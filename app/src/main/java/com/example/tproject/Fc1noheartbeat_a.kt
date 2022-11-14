package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a)
        val fun11a1 = findViewById<Button>(R.id.Fc1_1_a_1)
        fun11a1.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun11aa = findViewById<Button>(R.id.Fc1_1_a_a)
        fun11aa.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11an = findViewById<Button>(R.id.Fc1_1_a_n)
        fun11an.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_2::class.java)
            startActivity(intent)
        }
        val fun11afc2 = findViewById<Button>(R.id.Fc1_1_a_fc2)
        fun11afc2.setOnClickListener {
            val intent = Intent(this, Fc2main::class.java)
            startActivity(intent)
        }
        val fun11ah = findViewById<Button>(R.id.Fc1_1_a_h)
        fun11ah.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun111w = findViewById<Button>(R.id.Fc1_1_a_w)
        fun111w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}