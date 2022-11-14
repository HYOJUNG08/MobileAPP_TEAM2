package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_s_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_5)
        val fun14s5a = findViewById<Button>(R.id.Fc1_4_s5_a)
        fun14s5a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14s5s = findViewById<Button>(R.id.Fc1_4_s5_s)
        fun14s5s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14s5h = findViewById<Button>(R.id.Fc1_4_s5_h)
        fun14s5h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14s5w = findViewById<Button>(R.id.Fc1_4_s5_w)
        fun14s5w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14s5p = findViewById<Button>(R.id.Fc1_4_s5_p)
        fun14s5p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_4::class.java)
            startActivity(intent)
        }
    }
}