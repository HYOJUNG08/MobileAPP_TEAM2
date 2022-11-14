package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_s_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_2)
        val fun14s2a = findViewById<Button>(R.id.Fc1_4_s2_a)
        fun14s2a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14s2s = findViewById<Button>(R.id.Fc1_4_s2_s)
        fun14s2s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14s2n = findViewById<Button>(R.id.Fc1_4_s2_n)
        fun14s2n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_3::class.java)
            startActivity(intent)
        }
        val fun14s2h = findViewById<Button>(R.id.Fc1_4_s2_h)
        fun14s2h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14s2w = findViewById<Button>(R.id.Fc1_4_s2_w)
        fun14s2w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14s2p = findViewById<Button>(R.id.Fc1_4_s2_p)
        fun14s2p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
    }
}