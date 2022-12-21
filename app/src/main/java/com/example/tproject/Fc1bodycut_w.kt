package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodycut_w : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1bodycut_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_w)
        val fun13w = findViewById<ImageButton>(R.id.Fc1_3_w)
        fun13w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun13wh = findViewById<ImageButton>(R.id.Fc1_3_w_h)
        fun13wh.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun13ww = findViewById<ImageButton>(R.id.Fc1_3_w_w)
        fun13ww.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
    }

}