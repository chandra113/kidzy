package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class BalitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balita);
        YouTubePlayerView youTubePlayerBalita = findViewById(R.id.youtube_player_balita);
        getLifecycle().addObserver(youTubePlayerBalita);
    }
}
