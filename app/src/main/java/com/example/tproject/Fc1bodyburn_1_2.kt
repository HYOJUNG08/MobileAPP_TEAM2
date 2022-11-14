package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1bodyburn_1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_1_2)
        val fun122 = findViewById<Button>(R.id.Fc1_2_2)
        fun122.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
        }
        val fun121n = findViewById<Button>(R.id.Fc1_2_2_n)
        fun121n.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_3::class.java)
            startActivity(intent)
        }
        val fun121p = findViewById<Button>(R.id.Fc1_2_2_p)
        fun121p.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
        }
        val fun122h = findViewById<Button>(R.id.Fc1_2_2_h)
        fun122h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun122w = findViewById<Button>(R.id.Fc1_2_2_w)
        fun122w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
        }
    }
}