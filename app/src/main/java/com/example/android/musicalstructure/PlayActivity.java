package com.example.android.musicalstructure;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Find the image button and make it display a text when pressed
        ImageButton playButtond = (ImageButton) findViewById(R.id.play_button);
        playButtond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
            }
        });
    }
}