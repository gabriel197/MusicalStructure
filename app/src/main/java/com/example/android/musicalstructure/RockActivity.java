package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //Create an array list to store music info
        final ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("All Along the Watchtower", "Jimi Hendrix"));
        music.add(new Music("American Woman", "The Guess Who"));
        music.add(new Music("Baby Hold On", "Eddie Money"));
        music.add(new Music("Bad Company", "Bad Company"));
        music.add(new Music("Band on the Run", "Paul McCartney & Wings"));
        music.add(new Music("Black Dog", "Led Zeppelin"));
        music.add(new Music("Blinded by the Light", "Manfred Mann's Earth Band"));
        music.add(new Music("Bohemian Rhapsody", "Queen"));
        music.add(new Music("Brown Eyed Girl", "Van Morrison"));
        music.add(new Music("Burnin' for You", "Blue Öyster Cult"));
        music.add(new Music("Carry on Wayward Son", "Kansas"));
        music.add(new Music("Centerfold", "J. Geils Band"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_elements.xml layout resource defined by us.
        // This list item layout contains two {@link TextView}, which the adapter will set to
        // display two strings
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list_for_adapter, which is declared in the
        // music_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_for_adapter);

        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link music} in the list.
        listView.setAdapter(adapter);

        //Set a click listener to every element of the list to show info about current song and
        //artist name in a PlayActivity (This is what i was trying with
        // setOnItemClick listener but because of term 15 August.. it just show a play activity
        // without details about each song and unimplemented buttons)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent listItemsClick = new Intent(RockActivity.this, PlayActivity.class);
                startActivity(listItemsClick);
            }
        });
    }
}