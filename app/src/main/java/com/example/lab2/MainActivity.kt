package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var clickCounter = 0
    private lateinit var textViewCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToast = findViewById<Button>(R.id.button)
        val buttonCounter = findViewById<Button>(R.id.button2)
        textViewCounter = findViewById<TextView>(R.id.textView)

        buttonToast.setOnClickListener {
            showToast()
        }

        buttonCounter.setOnClickListener {
            incrementCounter()
        }
    }
    private fun resetCounter() {
        clickCounter = 0
        textViewCounter.text = "$clickCounter"
    }

    private fun showToast() {
        Toast.makeText(this, "Toast_button clicked", Toast.LENGTH_SHORT).show()
        resetCounter()
    }

    private fun incrementCounter() {
        clickCounter++
        textViewCounter.text = "$clickCounter"
    }
}

