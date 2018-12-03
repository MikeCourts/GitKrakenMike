package com.misewgapp.digital.mikecourts.model;

public class Paints {
    private String image;
    private String name;
    private String artistId;


    public Paints(String image, String name, String artistID) {
        this.image = image;
        this.name = name;
        this.artistId = artistID;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getArtistID() {
        return artistId;
    }

    @Override
    public String toString() {
        return "Paints{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", artistID=" + artistId +
                '}';
    }
}
