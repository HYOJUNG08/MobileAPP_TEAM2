package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1nobreath_w : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1nobreath_a_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_w)
        val fun14ws = findViewById<ImageButton>(R.id.Fc1_4_w_s)
        fun14ws.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14wa = findViewById<ImageButton>(R.id.Fc1_4_w_a)
        fun14wa.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14wh = findViewById<ImageButton>(R.id.Fc1_4_w_h)
        fun14wh.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun14ww = findViewById<ImageButton>(R.id.Fc1_4_w_w)
        fun14ww.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}