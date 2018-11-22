package com.misewgapp.digital.mikecourts.model;

public class Paints {
    private String image;
    private String name;
    private Integer artistID;

    public Paints(String image, String name, Integer artistID) {
        this.image = image;
        this.name = name;
        this.artistID = artistID;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public Integer getArtistID() {
        return artistID;
    }

    @Override
    public String toString() {
        return "Paints{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", artistID=" + artistID +
                '}';
    }
}
