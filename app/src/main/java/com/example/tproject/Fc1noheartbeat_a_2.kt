package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1noheartbeat_a_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_a_2)
        val fun11a21 = findViewById<Button>(R.id.Fc1_1_a2_1)
        fun11a21.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
        }
        val fun11a2a = findViewById<Button>(R.id.Fc1_1_a2_a)
        fun11a2a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11a2n = findViewById<Button>(R.id.Fc1_1_a2_n)
        fun11a2n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a_3::class.java)
            startActivity(intent)
        }
        val fun11a2p = findViewById<Button>(R.id.Fc1_1_a2_p)
        fun11a2p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
        }
        val fun11a2h = findViewById<Button>(R.id.Fc1_1_a2_h)
        fun11a2h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun11a2w = findViewById<Button>(R.id.Fc1_1_a2_w)
        fun11a2w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
        }
    }
}