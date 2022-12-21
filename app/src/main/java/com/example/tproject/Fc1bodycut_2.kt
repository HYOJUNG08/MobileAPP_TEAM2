package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodycut_2 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1bodycut_1::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_2)
        val fun132 = findViewById<ImageButton>(R.id.Fc1_3_2)
        fun132.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun132p = findViewById<ImageButton>(R.id.Fc1_3_2_p)
        fun132p.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun132n = findViewById<ImageButton>(R.id.Fc1_3_2_n)
        fun132n.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_3::class.java)
            startActivity(intent)
            finish()
        }
        val fun132h = findViewById<ImageButton>(R.id.Fc1_3_2_h)
        fun132h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun132w = findViewById<ImageButton>(R.id.Fc1_3_2_w)
        fun132w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}