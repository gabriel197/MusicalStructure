package com.example.android.musicalstructure;

public class Music {

    // Name of the song
    private String vSongName;

    //Name of the artist
    private String vArtistName;

    //*Constructor witch create an object of type Music
    public Music(String songName, String artistName) {
        vSongName = songName;
        vArtistName = artistName;
    }

    //Get song name
    public String getSongName() {
        return vSongName;
    }

    //Get artist name
    public String getArtistName() {
        return vArtistName;
    }
}