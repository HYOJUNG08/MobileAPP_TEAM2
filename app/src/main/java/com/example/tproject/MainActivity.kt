package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fun1 = findViewById<ImageButton>(R.id.Fc1main)
        fun1.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun2 = findViewById<ImageButton>(R.id.Fc2main)
        fun2.setOnClickListener {
            val intent = Intent(this, Fc2main::class.java)
            startActivity(intent)
        }
    }
}