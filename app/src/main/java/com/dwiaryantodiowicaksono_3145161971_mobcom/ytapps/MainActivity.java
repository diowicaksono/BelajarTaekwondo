package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView card1,  card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.Poomsae);
        card2 = (CardView) findViewById(R.id.Kyourugi);
        card3 = (CardView) findViewById(R.id.Basic);
        card4 = (CardView) findViewById(R.id.Knowledge);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.Poomsae:
                i = new Intent(this,Poomsae.class);
                startActivity(i);
                break;

            case R.id.Kyourugi:
                i = new Intent(this,Kyourugi.class);
                startActivity(i);
                break;

            case R.id.Basic:
                i = new Intent(this,Basic.class);
                startActivity(i);
                break;

            case R.id.Knowledge:
                i = new Intent(this,Knowledge.class);
                startActivity(i);
                break;
        }

    }
}