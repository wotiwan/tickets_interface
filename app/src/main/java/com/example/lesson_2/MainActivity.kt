package com.example.lesson_2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Находим массив в strings.xml
        val cities = resources.getStringArray(R.array.cities)

        // Находим список в activity_main.xml
        val list_view_origin = findViewById<Spinner>(R.id.list_origin)
        val list_view_diestination = findViewById<Spinner>(R.id.list_destination)

        val destination_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)

        list_view_origin.adapter = destination_adapter
        list_view_diestination.adapter = destination_adapter




    }
}