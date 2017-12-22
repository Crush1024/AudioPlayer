package com.destiny.daudioolayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.destiny.daudioolayer.R;
import com.destiny.daudioolayer.status.StatusBar;

public class MusicPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_play);
        StatusBar.applay(this, true);
    }
}
