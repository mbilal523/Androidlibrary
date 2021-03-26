package com.bike.maintenance.androidlibrary;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bike.maintenance.musicplayer.MusicPlayer;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MusicPlayer musicPlayer = new MusicPlayer(this);

        try {
            AssetFileDescriptor descriptor = getAssets().openFd("office_phone_ringigng.mp3");
            musicPlayer.play(descriptor);
        } catch (IOException e) {
            e.printStackTrace();
        }
//
    }
}