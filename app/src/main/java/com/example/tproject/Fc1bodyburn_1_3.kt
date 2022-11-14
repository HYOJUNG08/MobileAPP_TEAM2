package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1bodyburn_1_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_1_3)
        val fun123 = findViewById<Button>(R.id.Fc1_2_3)
        fun123.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
        }
        val fun123p = findViewById<Button>(R.id.Fc1_2_3_p)
        fun123p.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_2::class.java)
            startActivity(intent)
        }
        val fun123h = findViewById<Button>(R.id.Fc1_2_3_h)
        fun123h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun123w = findViewById<Button>(R.id.Fc1_2_3_w)
        fun123w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
        }
    }
}