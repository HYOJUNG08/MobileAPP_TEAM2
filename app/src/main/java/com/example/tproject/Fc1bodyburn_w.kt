package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodyburn_w : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1bodyburn_1_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_w)
        val fun12w = findViewById<ImageButton>(R.id.Fc1_2_w)
        fun12w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun12wh = findViewById<ImageButton>(R.id.Fc1_2_w_h)
        fun12wh.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun12ww = findViewById<ImageButton>(R.id.Fc1_2_w_w)
        fun12ww.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}