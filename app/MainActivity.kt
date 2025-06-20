package com.example.megaanalytics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnGenerate.setOnClickListener {
            val numbers = (1..60).shuffled().take(6).sorted()
            tvResult.text = "Jogo sugerido: ${numbers.joinToString(" - ")}"
        }
    }
}
