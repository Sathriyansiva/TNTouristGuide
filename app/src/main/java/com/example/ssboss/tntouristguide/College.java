package com.example.ssboss.tntouristguide;

/**
 * Created by venu sankaran on 11/16/2016.
 */

public class College {
    private String title, genre, year;
    private int image;
    public College() {
    }

    public College(String title, String genre, String year, int image) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
