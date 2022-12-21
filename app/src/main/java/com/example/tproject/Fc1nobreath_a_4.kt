package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1nobreath_a_4 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1nobreath_a_3::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_a_4)
        val fun14a4a = findViewById<ImageButton>(R.id.Fc1_4_a4_a)
        fun14a4a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a4s = findViewById<ImageButton>(R.id.Fc1_4_a4_s)
        fun14a4s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a4h = findViewById<ImageButton>(R.id.Fc1_4_a4_h)
        fun14a4h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a4w = findViewById<ImageButton>(R.id.Fc1_4_a4_w)
        fun14a4w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a4p = findViewById<ImageButton>(R.id.Fc1_4_a4_p)
        fun14a4p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_3::class.java)
            startActivity(intent)
            finish()
        }
    }
}