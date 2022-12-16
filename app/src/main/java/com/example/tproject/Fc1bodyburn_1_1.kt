package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1bodyburn_1_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_1_1)
        val emergencycall = findViewById<Button>(R.id.bodyburncall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
        }
        val fun121 = findViewById<Button>(R.id.Fc1_2_1)
        fun121.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
        }
        val fun121n = findViewById<Button>(R.id.Fc1_2_1_n)
        fun121n.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_2::class.java)
            startActivity(intent)
        }
        val fun121h = findViewById<Button>(R.id.Fc1_2_1_h)
        fun121h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun121w = findViewById<Button>(R.id.Fc1_2_1_w)
        fun121w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
        }
    }
}