package com.example.android.musicalstructure;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create new intent object to open JazzActivity class
        final Intent jazzActivity = new Intent(this, JazzActivity.class);

        //Find the view corresponding to JazzActivity and set a click listener to it
        View jazz = (View) findViewById(R.id.music_jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(jazzActivity);
            }
        });

        final Intent rockActivity = new Intent(this, RockActivity.class);
        View rock = (View) findViewById(R.id.music_rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(rockActivity);
            }
        });

        // Go to Now Playing activity
        Button nowPlaying = (Button) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playActivity = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playActivity);
            }
        });
    }
}