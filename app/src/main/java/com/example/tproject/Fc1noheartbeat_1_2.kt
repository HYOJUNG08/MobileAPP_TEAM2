package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1_2)
        val fun1121 = findViewById<Button>(R.id.Fc1_1_2_1)
        fun1121.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun112a = findViewById<Button>(R.id.Fc1_1_2_a)
        fun112a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun112n = findViewById<Button>(R.id.Fc1_1_2_n)
        fun112n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_3::class.java)
            startActivity(intent)
        }
        val fun112p = findViewById<Button>(R.id.Fc1_1_2_p)
        fun112p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun112h = findViewById<Button>(R.id.Fc1_1_2_h)
        fun112h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun112w = findViewById<Button>(R.id.Fc1_1_2_w)
        fun112w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}