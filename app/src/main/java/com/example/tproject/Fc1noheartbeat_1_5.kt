package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_1_5 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_1_4::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1_5)
        val fun1151 = findViewById<ImageButton>(R.id.Fc1_1_5_1)
        fun1151.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun115a = findViewById<ImageButton>(R.id.Fc1_1_5_a)
        fun115a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun115p = findViewById<ImageButton>(R.id.Fc1_1_5_p)
        fun115p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_4::class.java)
            startActivity(intent)
            finish()
        }
        val fun115h = findViewById<ImageButton>(R.id.Fc1_1_5_h)
        fun115h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun115w = findViewById<ImageButton>(R.id.Fc1_1_5_w)
        fun115w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}