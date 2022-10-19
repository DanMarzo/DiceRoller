package com.example.atividadepm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.TextView
import com.example.atividadepm.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.buttonNumber.setOnClickListener{rollDice()}
        binding.buttonNumber.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6);
        val diceRoll = dice.rool();
        val diceImage: ImageView = binding.resultadoRandom;
        diceImage.setImageResource(R.drawable.dice_2);
    }

    /*fun rollDice()
    {
        val resultText: TextView = binding.resultadoRandom
        val gerarNumero = binding.numberData.text.toString().toInt()
        val saidaRandom = (1..gerarNumero).random()
        resultText.text = saidaRandom.toString()
    }*/

    class Dice (val numSides: Int) {
        fun rool(): Int {
            return (1..numSides).random();
        }
    }

}