package com.mokniCorp.gtavfm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
//import android.view.View;

public class nonStopFm extends AppCompatActivity {
    //private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            if (item.getItemId() == R.id.navigation_dashboard ) {
                mp.pause();
                Intent move = new Intent(nonStopFm.this, RadioList.class);
                startActivity(move);

                return true;

            }
            return false;
        }
    };
    MediaPlayer mp;
    SeekBar Vol;
    Button play ;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_stop_fm);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        play = findViewById(R.id.playBTN);
        Vol = findViewById(R.id.VolBar);
        mp = MediaPlayer.create(this,  R.raw.nonstoppop);
        random = (int) (Math.random() * (mp.getDuration() - 1) + 1);
        mp.setLooping(true);
        mp.seekTo(random);
        mp.setVolume(0.5f,0.5f);
        mp.start();
        play.setBackgroundResource(R.drawable.stop);

        //play pause
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!mp.isPlaying()){
                    mp.start();
                    play.setBackgroundResource(R.drawable.stop);
                }else if(mp.isPlaying()){
                    mp.pause();
                    play.setBackgroundResource(R.drawable.play);
                }

            }
        });



        //volume
        Vol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean FromUsr) {
                float VolProg = progress / 100f;
                mp.setVolume(VolProg,VolProg);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
