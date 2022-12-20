package com.example.tproject


import android.Manifest
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
var places: MutableList<Place> = listOf("hi",LatLng(0.0,0.0),"hi") as MutableList<Place>
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
        val inputStream: InputStream = assets.open("data2.xml")
        var factory: XmlPullParserFactory = XmlPullParserFactory.newInstance()
        var parser: XmlPullParser = factory.newPullParser()
        parser.setInput(inputStream, null)
        var event = parser.eventType
        Log.d("kkang", event.toString())
        //파싱

        //tag읽기
        while(parser.next() != XmlPullParser.END_DOCUMENT){
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            // buildAddress의 내용과 org 장소이름 받아오기, 위도경도 받아오기
            if (parser.name == "buildAddress") {
                Log.d("kkang",parser.name)
                var result=""
                if (parser.next() == XmlPullParser.TEXT) {
                    result = parser.text
                    //places_addr.add(result.toString())
                    Log.d("kkang",result)
                    parser.nextTag()
                }
                //places_addr.add(result)
                //Log.d("kkang",result)
            }
            else if(parser.name=="org"){ //장소 이름 받아오기
                Log.d("kkang",parser.name)
                var result=""
                if (parser.next() == XmlPullParser.TEXT) {
                    result = parser.text
                    //places_name.add(result)
                    parser.nextTag()
                }
                Log.d("kkang",result)
            }
            else if (parser.name=="wgs84Lat") { //위도
                Log.d("kkang",parser.name)
                var result=""
                if (parser.next() == XmlPullParser.TEXT) {
                    result = parser.text
                    //lat1.add(result.toDouble())
                    parser.nextTag()
                }
                Log.d("kkang",result)
            }
            else if (parser.name=="wgs84Lon"){ //경도
                Log.d("kkang",parser.name)
                var result=""
                if (parser.next() == XmlPullParser.TEXT) {
                    result = parser.text
                   // lon1.add(result.toDouble())
                    parser.nextTag()
                }
                Log.d("kkang",result)
            }
            else {
                continue
            }
        }
        //tag읽기 끝
        makeFun()
    }
    //주소, 장소 이름, 위도경도를 mutable list places에 넣기
    fun makeFun(){
        val count = lon1.count {true}

        for(i in 1 until count)
            places.add(places_name[i],LatLng(lat1[i],lon1[i]), places_addr[i])
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.setOnMarkerClickListener(this)
        setUpMap()

    }

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

private fun <E> MutableList<E>.add(s: String, latLng: LatLng, s1: String) {
   // val tmp = mutableListOf<Place>(s,latLng,s1)
    return mutableListOf<Place>(s,latLng,s1)
}

fun <T> mutableListOf(elements: String, elements1: LatLng, elements2: String) {

}
