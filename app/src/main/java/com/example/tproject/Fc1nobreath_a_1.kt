package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_a_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_a_1)
        val fun14a1a = findViewById<Button>(R.id.Fc1_4_a1_a)
        fun14a1a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14a1s = findViewById<Button>(R.id.Fc1_4_a1_s)
        fun14a1s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14a1n = findViewById<Button>(R.id.Fc1_4_a1_n)
        fun14a1n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_2::class.java)
            startActivity(intent)
        }
        val fun14a1h = findViewById<Button>(R.id.Fc1_4_a1_h)
        fun14a1h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14a1w = findViewById<Button>(R.id.Fc1_4_a1_w)
        fun14a1w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
    }

}