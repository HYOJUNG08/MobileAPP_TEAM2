package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1bodycut_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodycut_4)
        val fun134 = findViewById<Button>(R.id.Fc1_3_4)
        fun134.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_1::class.java)
            startActivity(intent)
        }
        val fun134p = findViewById<Button>(R.id.Fc1_3_4_p)
        fun134p.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_3::class.java)
            startActivity(intent)
        }
        val fun134h = findViewById<Button>(R.id.Fc1_3_4_h)
        fun134h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun134w = findViewById<Button>(R.id.Fc1_3_4_w)
        fun134w.setOnClickListener {
            val intent = Intent(this, Fc1bodycut_w::class.java)
            startActivity(intent)
        }
    }
}