package com.company;

public class Music {
    private String file;
    private String artist;
    private int yreaOfPublication;

    public Music(String file, String artist, int yreaOfPublication){
        this.file = file;
        this.artist = artist;
        this.yreaOfPublication = yreaOfPublication;
    }

    public int getYreaOfPublication() {
        return yreaOfPublication;
    }

    public String getArtist() {
        return artist;
    }

    public String getFile() {
        return file;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setYreaOfPublication(int yreaOfPublication) {
        this.yreaOfPublication = yreaOfPublication;
    }
}
