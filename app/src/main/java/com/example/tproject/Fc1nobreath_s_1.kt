package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1nobreath_s_1 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1main::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_1)
        val emergencycall = findViewById<ImageButton>(R.id.nobreathscall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
            finish()
        }
        val fun14s1a = findViewById<ImageButton>(R.id.Fc1_4_s1_a)
        fun14s1a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s1s = findViewById<ImageButton>(R.id.Fc1_4_s1_s)
        fun14s1s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s1n = findViewById<ImageButton>(R.id.Fc1_4_s1_n)
        fun14s1n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s1h = findViewById<ImageButton>(R.id.Fc1_4_s1_h)
        fun14s1h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun14s1w = findViewById<ImageButton>(R.id.Fc1_4_s1_w)
        fun14s1w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}