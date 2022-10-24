package com.example.lekcja1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //obsługa kliknięcia
        findViewById<Button>(R.id.mojPrzycisk).setOnClickListener {
            findViewById<Button>(R.id.mojPrzycisk).text = "działa"
        }
        findViewById<Button>(R.id.Przyciskkol).setOnClickListener {
            findViewById<Button>(R.id.Przyciskkol).setBackgroundColor(Color.parseColor("#ee82ee"))
        }
    }
}