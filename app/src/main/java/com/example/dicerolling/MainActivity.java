package com.example.dicerolling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] dices = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        Button roll = (Button) findViewById(R.id.Roll);

        final ImageView firstImage = (ImageView) findViewById(R.id.Dice_1);

        final ImageView secondImage = (ImageView) findViewById(R.id.Dice_2);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                int temp = rand.nextInt(6);

                firstImage.setImageResource(dices[temp]);

                temp = rand.nextInt(6);

                secondImage.setImageResource(dices[temp]);

            }
        });
    }
}