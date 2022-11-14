package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_a_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_a_3)
        val fun14a3a = findViewById<Button>(R.id.Fc1_4_a3_a)
        fun14a3a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14a3s = findViewById<Button>(R.id.Fc1_4_a3_s)
        fun14a3s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14a3n = findViewById<Button>(R.id.Fc1_4_a3_n)
        fun14a3n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_4::class.java)
            startActivity(intent)
        }
        val fun14a3h = findViewById<Button>(R.id.Fc1_4_a3_h)
        fun14a3h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14a3w = findViewById<Button>(R.id.Fc1_4_a3_w)
        fun14a3w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14a3p = findViewById<Button>(R.id.Fc1_4_a3_p)
        fun14a3p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_2::class.java)
            startActivity(intent)
        }
    }
}