package com.example.chapter06_inclass;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    MediaPlayer mpFirstSong, mpSecondSong;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        mpFirstSong =new MediaPlayer();
        mpSecondSong =new MediaPlayer();

        mpFirstSong= MediaPlayer.create(this, R.raw.track1);
        mpSecondSong= MediaPlayer.create(this, R.raw.track2);

        playing=0;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing){
                    case 0:
                        mpFirstSong.start();
                        playing=1;
                        button.setText("Pause first song");
                        break;

                    case 1:
                        mpFirstSong.pause();
                        playing=0;
                        button.setText("Start second song");
                        break;
                }

            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing){
                case 0:
                mpSecondSong.start();
                playing=1;
                button2.setText("Pause first song");
                break;

                case 1:
                mpSecondSong.pause();
                playing=0;
                button2.setText("Start second song");
                break;

            }

    }
        });
 } }