package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        Button ask =(Button) findViewById(R.id.button);
        final ImageView img =(ImageView) findViewById(R.id.imageView);

        final int[] imgarray1 ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num1= new Random();
                int number;
                number = num1.nextInt(4);
                img.setImageResource(imgarray1[number]);
            }
        });
    }
}
