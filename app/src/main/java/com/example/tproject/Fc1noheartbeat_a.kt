package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_a : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1main::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a)
        val fun11af2 = findViewById<ImageButton>(R.id.noheartbeatAED)
        fun11af2.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a1 = findViewById<ImageButton>(R.id.Fc1_a_1_1)
        fun11a1.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun11aa = findViewById<ImageButton>(R.id.Fc1_a_1_a)
        fun11aa.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun11an = findViewById<ImageButton>(R.id.Fc1_a_1_n)
        fun11an.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun11ah = findViewById<ImageButton>(R.id.Fc1_a_1_h)
        fun11ah.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun111w = findViewById<ImageButton>(R.id.Fc1_a_1_w)
        fun111w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}