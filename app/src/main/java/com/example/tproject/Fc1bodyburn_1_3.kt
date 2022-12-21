package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodyburn_1_3 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1bodyburn_1_2::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_1_3)
        val fun123 = findViewById<ImageButton>(R.id.Fc1_2_3)
        fun123.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun123p = findViewById<ImageButton>(R.id.Fc1_2_3_p)
        fun123p.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun123h = findViewById<ImageButton>(R.id.Fc1_2_3_h)
        fun123h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun123w = findViewById<ImageButton>(R.id.Fc1_2_3_w)
        fun123w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}