package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Poomsae extends AppCompatActivity implements View.OnClickListener{

    public CardView cardT1, cardT2, cardT3, cardT4, cardT5, cardT6, cardT7, cardT8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poomsae);

        cardT1 = (CardView) findViewById(R.id.Taegeuk1);
        cardT2 = (CardView) findViewById(R.id.Taegeuk2);
        cardT3 = (CardView) findViewById(R.id.Taegeuk3);
        cardT4 = (CardView) findViewById(R.id.Taegeuk4);
        cardT5 = (CardView) findViewById(R.id.Taegeuk5);
        cardT6 = (CardView) findViewById(R.id.Taegeuk6);
        cardT7 = (CardView) findViewById(R.id.Taegeuk7);
        cardT8 = (CardView) findViewById(R.id.Taegeuk8);

        cardT1.setOnClickListener(this);
        cardT2.setOnClickListener(this);
        cardT3.setOnClickListener(this);
        cardT4.setOnClickListener(this);
        cardT5.setOnClickListener(this);
        cardT6.setOnClickListener(this);
        cardT7.setOnClickListener(this);
        cardT8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.Taegeuk1:
                i = new Intent(this,Taegeuk1.class);
                startActivity(i);
                break;

            case R.id.Taegeuk2:
                i = new Intent(this,Taegeuk2.class);
                startActivity(i);
                break;

            case R.id.Taegeuk3:
                i = new Intent(this,Taegeuk3.class);
                startActivity(i);
                break;

            case R.id.Taegeuk4:
                i = new Intent(this,Taegeuk4.class);
                startActivity(i);
                break;

            case R.id.Taegeuk5:
                i = new Intent(this,Taegeuk5.class);
                startActivity(i);
                break;

            case R.id.Taegeuk6:
                i = new Intent(this,Taegeuk6.class);
                startActivity(i);
                break;

            case R.id.Taegeuk7:
                i = new Intent(this,Taegeuk7.class);
                startActivity(i);
                break;

            case R.id.Taegeuk8:
                i = new Intent(this,Taegeuk8.class);
                startActivity(i);
                break;
        }
    }
}