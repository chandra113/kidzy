package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView batitaCard, balitaCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        batitaCard = (CardView) findViewById(R.id.batita_card);
        balitaCard = (CardView) findViewById(R.id.balita_card);
        batitaCard.setOnClickListener(this);
        balitaCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.batita_card : intent = new Intent(this,BatitaActivity.class);startActivity(intent); break;
            case R.id.balita_card : intent = new Intent(this,BalitaActivity.class);startActivity(intent); break;
        }

    }
}
