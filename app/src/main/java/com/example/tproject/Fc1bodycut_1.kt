package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodycut_1 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1main::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_1)
        val emergencycall = findViewById<ImageButton>(R.id.bodycutcall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
            finish()
        }
        val fun131 = findViewById<ImageButton>(R.id.Fc1_3_1)
        fun131.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun131n = findViewById<ImageButton>(R.id.Fc1_3_1_n)
        fun131n.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun131h = findViewById<ImageButton>(R.id.Fc1_3_1_h)
        fun131h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun131w = findViewById<ImageButton>(R.id.Fc1_3_1_w)
        fun131w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}