package com.shakila.quizastronomi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class quiz2 extends AppCompatActivity implements View.OnClickListener {

    String[] niceArray = {
            "a","c","d","b","d"
    };

    ImageView gambar,circle1,circle2,circle3,circle4,circle5,back;
    Button a,b,c,d;
    int cek2=0, bener=0;
    String temp;

    protected void setQuestion(){
        switch(cek2)
        {
            case 0 :
                gambar.setImageResource(R.drawable.medium_soal1);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_warna));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle));

                a.setText("Lingkaran besar hasil proyeksi bidang equator bumi di bola langit");
                b.setText("Lingkaran besar hasil proyeksi bidang horison di bola langit");
                c.setText("Lingkaran besar yang menjadi bidang edar seluruh benda langit");
                d.setText("Lingkaran tempat diproyeksikannya kutub kutub bumi ");
                break;
            case 1 :
                gambar.setImageResource(R.drawable.medium_soal2);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_warna));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle));

                a.setText("CV Canis Majoris");
                b.setText("Betelgeus");
                c.setText("UY Scuti");
                d.setText("Matahari");
                break;
            case 2 :
                gambar.setImageResource(R.drawable.medium_soal3);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_warna));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle));

                a.setText("3.26 parsek");
                b.setText("satu tahun cahaya");
                c.setText("8 jam cahaya");
                d.setText("8.3 menit cahaya");
                break;
            case 3 :
                gambar.setImageResource(R.drawable.medium_soal4);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_warna));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle));

                a.setText("Saturnus");
                b.setText("Jupiter");
                c.setText("Mars");
                d.setText("Bumi");
                break;
            case 4 :
                gambar.setImageResource(R.drawable.medium_soal5);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_warna));

                a.setText("Banyak hewan hidup di atasnya");
                b.setText("Ada makhluk hidup unik di atasnya");
                c.setText("Ada banyak jenis hewan luar angkasa");
                d.setText("Tidak ada makhluk hidup di atasnya");
                break;
            default:
                break;
        }
    }
    protected void trueAnswer()
    {
        bener +=20;

    }
    protected void falseAnswer()
    {
        bener+=0;
    }
    protected void checkAnswer(){
        if(temp.equals(niceArray[cek2]))
        {
            trueAnswer();
        }else{
            temp="";
            falseAnswer();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        a = (Button) findViewById(R.id.a);
        b = (Button)findViewById(R.id.b);
        c = (Button)findViewById(R.id.c);
        d = (Button)findViewById(R.id.d);
        gambar = (ImageView)findViewById(R.id.picture);
        circle1 = (ImageView)findViewById(R.id.circle1mc);
        circle2 = (ImageView)findViewById(R.id.circle2mc);
        circle3 = (ImageView)findViewById(R.id.circle3mc);
        circle4 = (ImageView)findViewById(R.id.circle4mc);
        circle5 = (ImageView)findViewById(R.id.circle5mc);
        back = (ImageView)findViewById(R.id.back);

        setQuestion();

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.a :
                temp ="a";
                checkAnswer();
                cek2++;
                if(cek2>4){
                    cek2=0;
                    Intent intent = new Intent(this,hasilquiz2.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.iconhasil);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.b :
                temp = "b";
                checkAnswer();
                cek2++;
                if(cek2>4){
                    cek2=0;
                    Intent intent = new Intent(this,hasilquiz2.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.iconhasil);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.c :
                temp ="c";
                checkAnswer();
                cek2++;
                if(cek2>4){
                    cek2=0;
                    Intent intent = new Intent(this,hasilquiz2.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.iconhasil);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.d :
                temp = "d";
                checkAnswer();
                cek2++;
                if(cek2>4){
                    cek2=0;
                    Intent intent = new Intent(this,hasilquiz2.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.iconhasil);
                    startActivity(intent);
                    finish();
                }else
                {
                    setQuestion();
                }
                break;
            default:break;
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukahome=new Intent(quiz2.this, home.class);
                startActivity(bukahome);
            }
        });
    }

}