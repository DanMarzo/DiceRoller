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
        setContentView(R.layout.activity_main)
        //setContentView(binding.root)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.buttonNumber.setOnClickListener{rollDice()}
        val buton = findViewById<Button>(R.id.buttonNumber)
        buton.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(6);
        val diceRoll = dice.rool();
        val diceImage: ImageView = findViewById(R.id.resultadoRandom);
        //val diceImage: ImageView = findViewById(R.id.resultadoRandom);
        diceImage.contentDescription = diceRoll.toString()


        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
    class Dice (val numSlides: Int) {
        fun rool(): Int {
            return (1..this.numSlides).random();
        }
    }
    /*fun rollDice()
    {
        val resultText: TextView = binding.resultadoRandom
        val gerarNumero = binding.numberData.text.toString().toInt()
        val saidaRandom = (1..gerarNumero).random()
        resultText.text = saidaRandom.toString()
    }*/



}