package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Fc1nobreath_a_2 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1nobreath_a_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_a_2)
        val emergencycall = findViewById<ImageButton>(R.id.nobreathacall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
            finish()
        }
        val fun14a2a = findViewById<ImageButton>(R.id.Fc1_4_a2_a)
        fun14a2a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a2s = findViewById<ImageButton>(R.id.Fc1_4_a2_s)
        fun14a2s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a2n = findViewById<ImageButton>(R.id.Fc1_4_a2_n)
        fun14a2n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_3::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a2h = findViewById<ImageButton>(R.id.Fc1_4_a2_h)
        fun14a2h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun14a2w = findViewById<ImageButton>(R.id.Fc1_4_a2_w)
        fun14a2w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14a2p = findViewById<ImageButton>(R.id.Fc1_4_a2_p)
        fun14a2p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
    }
}