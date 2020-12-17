package com.example.evaluation.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluation.Constants;
import com.example.evaluation.R;

public class SplashScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        VideoView videoSplash =  (VideoView) findViewById(R.id.splash_screen);
        Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash);
        videoSplash.setVideoURI(path);
        videoSplash.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {go(); }

        });
        videoSplash.start();
    }
    private void go() {
        if(isFinishing())
            return;
        startActivity(new Intent(SplashScreen.this,LoginActivity.class));
        finish();
    }

    private void openNextScreen() {
        SharedPreferences sharedPreferences =getSharedPreferences(Constants.MY_PREFS, Context.MODE_PRIVATE);
        Boolean isConnected =sharedPreferences.getBoolean(Constants.ISCONNECTED,false);
        if(isConnected) {
            startActivity(new Intent(SplashScreen.this, HomeActivity.class));
        }
        else
        {
            startActivity(new Intent(SplashScreen.this, LoginActivity.class));
        }
    }
}















