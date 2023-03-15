package com.shakila.quizastronomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class home extends AppCompatActivity {
    CardView easy, medium, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        easy = (CardView) findViewById(R.id.easy);
        medium = (CardView) findViewById(R.id.medium);
        hard = (CardView) findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka=new Intent(home.this, quiz1.class);
                startActivity(buka);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka=new Intent(home.this, quiz2.class);
                startActivity(buka);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka=new Intent(home.this, quiz3.class);
                startActivity(buka);
            }
        });
    }
}