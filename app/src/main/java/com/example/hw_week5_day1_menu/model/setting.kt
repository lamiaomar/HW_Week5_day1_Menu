package com.example.hw_week5_day1_menu.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw_week5_day1_menu.R

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val sett = intent?.extras?.getString("setting").toString()
        val text : TextView = findViewById(R.id.textView)
        text.text = sett
    }
}