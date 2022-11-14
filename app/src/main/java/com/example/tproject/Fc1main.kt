package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1main)

        val fun11 = findViewById<ImageButton>(R.id.Fc1_1)
        fun11.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun12 = findViewById<ImageButton>(R.id.Fc1_2)
        fun12.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
        }
        val fun13 = findViewById<ImageButton>(R.id.Fc1_3)
        fun13.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
        }
        val fun14 = findViewById<ImageButton>(R.id.Fc1_4)
        fun14.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun1h = findViewById<Button>(R.id.Fc1main_h)
        fun1h.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}