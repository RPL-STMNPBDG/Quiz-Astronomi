package com.shakila.quizastronomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hasilquiz1 extends AppCompatActivity {
    String name;
    ImageView gambarr,star1,star2,star3,star4,star5,menu,replay;
    int res,gambarrr;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilquiz1);

        Bundle extras = getIntent().getExtras();
        if(extras==null)
        {
            return;
        }
        res = extras.getInt("nilai");
        gambarrr = extras.getInt("gambar");

        gambarr = (ImageView)findViewById(R.id.badge);
        star1 = (ImageView)findViewById(R.id.star1);
        star2 = (ImageView)findViewById(R.id.star2);
        star3 = (ImageView)findViewById(R.id.star3);
        star4 = (ImageView)findViewById(R.id.star4);
        star5 = (ImageView)findViewById(R.id.star5);
        menu = (ImageView)findViewById(R.id.back);
        replay = (ImageView)findViewById(R.id.replay);

        gambarr.setImageResource(gambarrr);

        TextView nilai = (TextView)findViewById(R.id.nilai);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hasilquiz1.this,home.class);
                startActivity(i);
                finish();
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hasilquiz1.this,quiz1.class);
                startActivity(i);
                finish();
            }
        });

        nilai.setText(String.valueOf(res));
        if (res >= 100)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
        }
        else if (res >= 80)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 60)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 40)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 20)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res == 0)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
    }

    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), home.class);
        startActivity(i);
        finish();
    }

}