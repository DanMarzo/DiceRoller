package com.example.atividadepm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonNumber)
        rollButton.setOnClickListener{ rollDice() }
    }

    fun rollDice()
    {
        val randomint = (1..6).random().toString()
        val resultText: TextView = findViewById(R.id.resultadoRandom)

        resultText.text = randomint
    }

}