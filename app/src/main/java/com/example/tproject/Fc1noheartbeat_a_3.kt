package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_a_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_3)
        val fun11a31 = findViewById<Button>(R.id.Fc1_1_a3_1)
        fun11a31.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun11a3a = findViewById<Button>(R.id.Fc1_1_a3_a)
        fun11a3a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11a3n = findViewById<Button>(R.id.Fc1_1_a3_n)
        fun11a3n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_4::class.java)
            startActivity(intent)
        }
        val fun11a3p = findViewById<Button>(R.id.Fc1_1_a3_p)
        fun11a3p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_2::class.java)
            startActivity(intent)
        }
        val fun11a3h = findViewById<Button>(R.id.Fc1_1_a3_h)
        fun11a3h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun11a3w = findViewById<Button>(R.id.Fc1_1_a3_w)
        fun11a3w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}