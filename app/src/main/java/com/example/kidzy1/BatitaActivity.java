package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class BatitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batita);
        YouTubePlayerView youTubePlayerBatita = findViewById(R.id.youtube_player_batita);
        getLifecycle().addObserver(youTubePlayerBatita);
    }
}
