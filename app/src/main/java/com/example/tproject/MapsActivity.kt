package com.example.tproject


import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.tproject.databinding.ActivityMapsBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.InputStream

data class Place(
    val name: String,
    val latLng: LatLng,
    val address: String
)

//차례대로 이름,위도,경도,주소를 저장할 places, 위도 저장 lat1, 경도 저장 lon1, 장소이름 저장 palces_name, 주소 저장 places_addr
var places: List<Place> = listOf("hi",LatLng(0.0,0.0),"hi") as List<Place>
var lat1 : MutableList<Double> = listOf(0.0) as MutableList<Double>
var lon1 : MutableList<Double> = listOf(0.0) as MutableList<Double>
var places_name: MutableList<String> = listOf("0") as MutableList<String>
var places_addr: MutableList<String> = listOf("0") as MutableList<String>

class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    private lateinit var lastLocation: Location
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient //위칫값 사용

    companion object {
        private const val LOCATION_REQUEST_CODE = 1
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view binding
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        //파싱
        val inputStream: InputStream = assets.open("data.xml")
        var factory: XmlPullParserFactory = XmlPullParserFactory.newInstance()
        var parser: XmlPullParser = factory.newPullParser()
        parser.setInput(inputStream, null)
        var event = parser.eventType

        //파싱

        //tag읽기
        var i = 0
        var result1 = ""
        var result2 = ""
        var result3 = ""
        var result4 = ""
        while (parser.next() != XmlPullParser.END_DOCUMENT) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }

            // buildAddress의 내용과 org 장소이름 받아오기, 위도경도 받아오기
            if (parser.name == "buildAddress") {
                //Log.d("kkang", parser.name)
                var result = ""
                if (parser.next() == XmlPullParser.TEXT) {
                    result1 = parser.text
                    //places_addr.add(result1)
                    //Log.d("kkang", result1)
                    parser.nextTag()
                }
                i = i + 1
                //places_addr.add(result)
                //Log.d("kkang",result)
            } else if (parser.name == "org") { //장소 이름 받아오기
                //Log.d("kkang", parser.name)
                var result = ""
                if (parser.next() == XmlPullParser.TEXT) {
                    result2 = parser.text
                    //places_name.add(result)
                    parser.nextTag()
                }
                i = i + 1
                //Log.d("kkang", result2)
            } else if (parser.name == "wgs84Lat") { //위도
                //Log.d("kkang", parser.name)
                var result = ""
                if (parser.next() == XmlPullParser.TEXT) {
                    result3 = parser.text
                    //lat1.add(result.toDouble())
                    parser.nextTag()
                }
                i = i + 1
                //Log.d("kkang", result3)
            } else if (parser.name == "wgs84Lon") { //경도
                //Log.d("kkang", parser.name)
                var result = ""
                if (parser.next() == XmlPullParser.TEXT) {
                    result4 = parser.text
                    // lon1.add(result.toDouble())
                    parser.nextTag()
                }
                i = i + 1
                //Log.d("kkang", result4)
            } else {
                continue
            }

            if (i % 4 == 0) {
                //places.add(result2,LatLng(result3.toDouble(),result4.toDouble()),result4)
                //Log.d("kkang", "1")
                val currentLatLong = LatLng(result3.toDouble(), result4.toDouble())
                //Log.d("kkang", "2")
                //val markerOptions = MarkerOptions().position(currentLatLong)
                //markerOptions.title(result1)
                //placeMarkerOnMap(currentLatLong)
                val mapFragment = supportFragmentManager.findFragmentById(
                    R.id.map
                ) as? SupportMapFragment
                mapFragment?.getMapAsync { googleMap ->
                    placeMarkerOnMap(currentLatLong)
                }
                //Log.d("kkang", "3")
                result1 = ""
                result2 = ""
                result3 = ""
                result4 = ""
                //Log.d("kkang",places[0].name)

            }
        }
        //addMarkers(mMap)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.setOnMarkerClickListener(this)
        setUpMap()

    }

    //@SuppressLint("MissingPermission")
    private fun setUpMap() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_REQUEST_CODE)
            return
        }
        mMap.isMyLocationEnabled = true
        fusedLocationProviderClient.lastLocation.addOnSuccessListener(this) {location ->
            if (location != null) {
                lastLocation = location
                val currentLatLong = LatLng(location.latitude, location.longitude)
                placeMarkerOnMap(currentLatLong)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLong, 15f))
            }
        }
    }

    private fun placeMarkerOnMap(currentLatLong: LatLng) {
        val markerOptions = MarkerOptions().position(currentLatLong)
        markerOptions.title("현재 위치")
        mMap.addMarker(markerOptions)
    }

    override fun onMarkerClick(p0: Marker) = false

    private fun addMark() {
        val currentLatLong = LatLng(35.8881,128.6)
        val markerOptions = MarkerOptions().position(currentLatLong)
        mMap.addMarker(markerOptions)
    }
    //마커 추가하기
    private fun addMarkers(googleMap: GoogleMap) {
        places.forEach { place ->
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .position(place.latLng)
            )
        }
    }
}

