package com.example.hw_week5_day1_menu.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw_week5_day1_menu.R

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val sett = intent?.extras?.getString("con").toString()
        val text : TextView = findViewById(R.id.textView2)
        text.text = sett

    }
}