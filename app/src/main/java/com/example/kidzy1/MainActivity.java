package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView playButton, reminderButton, notesButton, settingsButton, exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (CardView) findViewById(R.id.play_button);
        reminderButton = (CardView) findViewById(R.id.reminder_button);
        notesButton = (CardView) findViewById(R.id.notes_button);
        settingsButton = (CardView) findViewById(R.id.settings_button);
        exitButton = (CardView) findViewById(R.id.exit_button);
        playButton.setOnClickListener(this);
        reminderButton.setOnClickListener(this);
        notesButton.setOnClickListener(this);
        settingsButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.play_button : intent = new Intent(this,FrontActivity.class);startActivity(intent); break;

        }


    }
}

