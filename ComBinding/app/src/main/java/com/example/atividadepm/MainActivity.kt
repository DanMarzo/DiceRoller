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
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.buttonNumber.setOnClickListener{rollDice()}

    }

    fun rollDice()
    {
        val resultText: TextView = binding.resultadoRandom
        val gerarNumero = binding.numberData.text.toString().toInt()
        val saidaRandom = (1..gerarNumero).random()
        resultText.text = saidaRandom.toString()
    }

}