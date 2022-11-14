package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_a_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_5)
        val fun11a51 = findViewById<Button>(R.id.Fc1_1_a5_1)
        fun11a51.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun11a5a = findViewById<Button>(R.id.Fc1_1_a5_a)
        fun11a5a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11a5p = findViewById<Button>(R.id.Fc1_1_a5_p)
        fun11a5p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_4::class.java)
            startActivity(intent)
        }
        val fun11a5h = findViewById<Button>(R.id.Fc1_1_a5_h)
        fun11a5h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun11a5w = findViewById<Button>(R.id.Fc1_1_a5_w)
        fun11a5w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}