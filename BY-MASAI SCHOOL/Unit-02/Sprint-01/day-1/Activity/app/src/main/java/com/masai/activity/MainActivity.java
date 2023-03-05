package com.masai.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag","onCreate");
        //MediaPlayer mediaPlayer =MediaPlayer.create(this, R.raw.music);
       // mediaPlayer.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","onRsume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","onStart");
    }
}