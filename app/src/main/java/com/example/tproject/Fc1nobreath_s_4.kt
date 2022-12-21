package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1nobreath_s_4 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1nobreath_s_3::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_4)
        val fun14s4a = findViewById<ImageButton>(R.id.Fc1_4_s4_a)
        fun14s4a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s4s = findViewById<ImageButton>(R.id.Fc1_4_s4_s)
        fun14s4s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s4n = findViewById<ImageButton>(R.id.Fc1_4_s4_n)
        fun14s4n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_5::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s4h = findViewById<ImageButton>(R.id.Fc1_4_s4_h)
        fun14s4h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s4w = findViewById<ImageButton>(R.id.Fc1_4_s4_w)
        fun14s4w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s4p = findViewById<ImageButton>(R.id.Fc1_4_s4_p)
        fun14s4p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_3::class.java)
            startActivity(intent)
            finish()
        }
    }
}