package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_1_2 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1_2)
        val emergencycall = findViewById<ImageButton>(R.id.noheartbeatcall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
            finish()
        }
        val fun1121 = findViewById<ImageButton>(R.id.Fc1_1_2_1)
        fun1121.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun112a = findViewById<ImageButton>(R.id.Fc1_1_2_a)
        fun112a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun112n = findViewById<ImageButton>(R.id.Fc1_1_2_n)
        fun112n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_3::class.java)
            startActivity(intent)
            finish()
        }
        val fun112p = findViewById<ImageButton>(R.id.Fc1_1_2_p)
        fun112p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun112h = findViewById<ImageButton>(R.id.Fc1_1_2_h)
        fun112h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun112w = findViewById<ImageButton>(R.id.Fc1_1_2_w)
        fun112w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}