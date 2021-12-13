package com.example.kotline

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn = findViewById<Button>(R.id.rollBtn);
        diceImage=findViewById<ImageView>(R.id.imageView);

        rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = (1..6).random();
        val drawableImage =
            when(randomNumber){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableImage);


    }
}