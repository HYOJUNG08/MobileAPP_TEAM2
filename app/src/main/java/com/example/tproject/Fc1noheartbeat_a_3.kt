package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_a_3 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_a_2::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_3)
        val fun11a31 = findViewById<ImageButton>(R.id.Fc1_a_3_1)
        fun11a31.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a3a = findViewById<ImageButton>(R.id.Fc1_a_3_a)
        fun11a3a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a3n = findViewById<ImageButton>(R.id.Fc1_a_3_n)
        fun11a3n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_4::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a3p = findViewById<ImageButton>(R.id.Fc1_a_3_p)
        fun11a3p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a3h = findViewById<ImageButton>(R.id.Fc1_a_3_h)
        fun11a3h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun11a3w = findViewById<ImageButton>(R.id.Fc1_a_3_w)
        fun11a3w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}