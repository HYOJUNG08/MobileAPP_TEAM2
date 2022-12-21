package com.example.tproject

import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.security.MessageDigest
import android.os.Build
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {
    private val TAG = "SOL_LOG"
    override fun onBackPressed() {
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fun1 = findViewById<ImageButton>(R.id.Fc1main)
        fun1.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun2 = findViewById<ImageButton>(R.id.Fc2main)
        fun2.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}