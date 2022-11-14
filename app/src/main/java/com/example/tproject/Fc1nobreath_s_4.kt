package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_s_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_4)
        val fun14s4a = findViewById<Button>(R.id.Fc1_4_s4_a)
        fun14s4a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14s4s = findViewById<Button>(R.id.Fc1_4_s4_s)
        fun14s4s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14s4n = findViewById<Button>(R.id.Fc1_4_s4_n)
        fun14s4n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_5::class.java)
            startActivity(intent)
        }
        val fun14s4h = findViewById<Button>(R.id.Fc1_4_s4_h)
        fun14s4h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14s4w = findViewById<Button>(R.id.Fc1_4_s4_w)
        fun14s4w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14s4p = findViewById<Button>(R.id.Fc1_4_s4_p)
        fun14s4p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_3::class.java)
            startActivity(intent)
        }
    }
}