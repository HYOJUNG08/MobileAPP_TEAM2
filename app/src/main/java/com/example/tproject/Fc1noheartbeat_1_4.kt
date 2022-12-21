package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_1_4 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_1_3::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1_4)
        val fun1141 = findViewById<ImageButton>(R.id.Fc1_1_4_1)
        fun1141.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun114a = findViewById<ImageButton>(R.id.Fc1_1_4_a)
        fun114a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun114n = findViewById<ImageButton>(R.id.Fc1_1_4_n)
        fun114n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_5::class.java)
            startActivity(intent)
            finish()
        }
        val fun114p = findViewById<ImageButton>(R.id.Fc1_1_4_p)
        fun114p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_3::class.java)
            startActivity(intent)
            finish()
        }
        val fun114h = findViewById<ImageButton>(R.id.Fc1_1_4_h)
        fun114h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun114w = findViewById<ImageButton>(R.id.Fc1_1_4_w)
        fun114w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}