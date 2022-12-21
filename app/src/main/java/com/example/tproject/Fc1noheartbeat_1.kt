package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Fc1noheartbeat_1 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1main::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1)

        val fun1111 = findViewById<ImageButton>(R.id.Fc1_1_1_1)
        fun1111.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun111a = findViewById<ImageButton>(R.id.Fc1_1_1_a)
        fun111a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun111n = findViewById<ImageButton>(R.id.Fc1_1_1_n)
        fun111n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun111h = findViewById<ImageButton>(R.id.Fc1_1_1_h)
        fun111h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun111w = findViewById<ImageButton>(R.id.Fc1_1_1_w)
        fun111w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }

}