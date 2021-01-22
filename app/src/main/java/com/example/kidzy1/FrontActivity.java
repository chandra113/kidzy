package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontActivity extends AppCompatActivity implements View.OnClickListener{

    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(FrontActivity.this, CategoryActivity.class));
    }

}
