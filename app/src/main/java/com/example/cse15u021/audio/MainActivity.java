package com.example.cse15u021.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong =MediaPlayer.create(MainActivity.this,R.raw.bagbak);
    }
    public void playIT(View v){
        mySong.start();
    }
    protected void onPause(){
        super.onPause();
        mySong.release();
    }
    public void stopIT(View v){
        mySong.stop();
    }
    public void pauseIT(View v){
        mySong.pause();
    }
    public void resumeIT(View v){
        mySong.reset();
    }
}
