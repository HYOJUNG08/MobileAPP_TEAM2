package com.example.tproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1bodyburn_1_1 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1main::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1bodyburn_1_1)
        val emergencycall = findViewById<ImageButton>(R.id.bodyburncall)
        emergencycall.setOnClickListener {
            val dial = Uri.parse("tel:119")
            val intent = Intent(Intent.ACTION_DIAL, dial)
            startActivity(intent)
        }
        val fun121 = findViewById<ImageButton>(R.id.Fc1_2_1)
        fun121.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun121n = findViewById<ImageButton>(R.id.Fc1_2_1_n)
        fun121n.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_1_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun121h = findViewById<ImageButton>(R.id.Fc1_2_1_h)
        fun121h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun121w = findViewById<ImageButton>(R.id.Fc1_2_1_w)
        fun121w.setOnClickListener {
            val intent = Intent(this, Fc1bodyburn_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}