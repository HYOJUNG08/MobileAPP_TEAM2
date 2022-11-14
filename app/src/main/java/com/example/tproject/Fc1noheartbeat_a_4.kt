package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_a_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_4)
        val fun11a41 = findViewById<Button>(R.id.Fc1_1_a4_1)
        fun11a41.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun11a4a = findViewById<Button>(R.id.Fc1_1_a4_a)
        fun11a4a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11a4n = findViewById<Button>(R.id.Fc1_1_a4_n)
        fun11a4n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_5::class.java)
            startActivity(intent)
        }
        val fun11a4p = findViewById<Button>(R.id.Fc1_1_a4_p)
        fun11a4p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_3::class.java)
            startActivity(intent)
        }
        val fun11a4h = findViewById<Button>(R.id.Fc1_1_a4_h)
        fun11a4h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun11a4w = findViewById<Button>(R.id.Fc1_1_a4_w)
        fun11a4w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}