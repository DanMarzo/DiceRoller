package com.example.atividadepm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.atividadepm.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.buttonNumber.setOnClickListener{rollDice()}
        setContentView(binding.root)
    }

    fun rollDice()
    {
        val randomint = (1..6).random().toString()
        binding.resultadoRandom.text = randomint
    }

}