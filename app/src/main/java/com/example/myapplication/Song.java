package com.example.myapplication;

public class Song {
    private String title;
    private String artist;
    private String path;
    private String duration;

    public Song(String title, String artist, String path, String duration) {
        this.title = title;
        this.artist = artist;
        this.path = path;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getPath() {
        return path;
    }

    public String getDuration() {
        return duration;
    }
}
