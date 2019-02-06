package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link MusicAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Music} objects.
 */
public class MusicAdapter extends ArrayAdapter<Music> {

    /**
     * Create a new {@link MusicAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param muzica  is the list of {@link Music}s to be displayed.
     */
    public MusicAdapter(Context context, ArrayList<Music> muzica) {
        super(context, 0, muzica);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_elements, parent, false);
        }


        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);


        // Find the TextView in the list_elements.xml layout with the ID song_name.
        TextView songName = (TextView) convertView.findViewById(R.id.song_name);
        //Get the song name and set it on TextView
        songName.setText(currentMusic.getSongName());

        // Find the TextView in the list_elements.xml layout with the ID artist_name.
        TextView artistName = (TextView) convertView.findViewById(R.id.artist_name);

        //Get the artist name and set it on TextView
        artistName.setText(currentMusic.getArtistName());

        //Return the whole list layout that contain 2TextViews so it can be show
        //in music_list
        return convertView;
    }
}