package com.example.keyboardwarriors;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class OptionScreen extends AppCompatActivity {
    MediaPlayer Song;
    ImageButton back2;
    ImageButton Credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Song = MediaPlayer.create(OptionScreen.this, R.raw.loopsong);
        Song.start();
        Song.setLooping(true);
        Song.start();
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_option_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);


        back2 = (ImageButton) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TitleScreen.class));
                finish();
            }
        });
        Credits = (ImageButton) findViewById(R.id.Credits);
        Credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Credits.class));
                finish();
            }
        });


    }
    public void onPause(){
        super.onPause();
        Song.release();
        finish();
    }
}
