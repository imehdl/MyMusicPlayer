package com.example.myproject;

public class Audio {
    private String TrackTitle;
    private String singer;
    private String filePath;
    private String duration;

    public Audio(String title, String artist, String path, String duration) {
        this.TrackTitle = title;
        this.singer = artist;
        this.filePath = path;
        this.duration = duration;
    }

    public String getTitle() {
        return TrackTitle;
    }

    public String getArtist() {
        return singer;
    }

    public String getPath() {
        return filePath;
    }

    public String getDuration() {
        return duration;
    }
}
