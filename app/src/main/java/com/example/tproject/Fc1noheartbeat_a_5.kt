package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_a_5 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_a_4::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_5)
        val fun11a51 = findViewById<ImageButton>(R.id.Fc1_a_5_1)
        fun11a51.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a5a = findViewById<ImageButton>(R.id.Fc1_a_5_a)
        fun11a5a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a5p = findViewById<ImageButton>(R.id.Fc1_a_5_p)
        fun11a5p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_4::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a5h = findViewById<ImageButton>(R.id.Fc1_a_5_h)
        fun11a5h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a5w = findViewById<ImageButton>(R.id.Fc1_a_5_w)
        fun11a5w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}