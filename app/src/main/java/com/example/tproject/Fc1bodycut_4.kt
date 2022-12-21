package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodycut_4 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1bodycut_3::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_4)
        val fun134 = findViewById<ImageButton>(R.id.Fc1_3_4)
        fun134.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun134p = findViewById<ImageButton>(R.id.Fc1_3_4_p)
        fun134p.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_3::class.java)
            startActivity(intent)
            finish()
        }
        val fun134h = findViewById<ImageButton>(R.id.Fc1_3_4_h)
        fun134h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun134w = findViewById<ImageButton>(R.id.Fc1_3_4_w)
        fun134w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}