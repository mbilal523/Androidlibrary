package com.bike.maintenance.musicplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import androidx.annotation.NonNull;

import java.io.IOException;

public class MusicPlayer {
    private final MediaPlayer mediaPlayer;
    private final Context mContext;
    private boolean inLoop = false;


    public MusicPlayer(Context context) {
        this.mContext = context;
        mediaPlayer = new MediaPlayer();
    }

    public void stop() {
        mediaPlayer.stop();
    }

    public void play(@NonNull AssetFileDescriptor descriptor) {
        try {

            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            mediaPlayer.prepare();
            mediaPlayer.setVolume(1f, 1f);
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inLoop(boolean looping) {
        this.inLoop = looping;
    }
}
