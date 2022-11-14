package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1bodycut_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_3)
        val fun133 = findViewById<Button>(R.id.Fc1_3_3)
        fun133.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
        }
        val fun133p = findViewById<Button>(R.id.Fc1_3_3_p)
        fun133p.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_2::class.java)
            startActivity(intent)
        }
        val fun133n = findViewById<Button>(R.id.Fc1_3_3_n)
        fun133n.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_4::class.java)
            startActivity(intent)
        }
        val fun133h = findViewById<Button>(R.id.Fc1_3_3_h)
        fun133h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun133w = findViewById<Button>(R.id.Fc1_3_3_w)
        fun133w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_w::class.java)
            startActivity(intent)
        }
    }
}