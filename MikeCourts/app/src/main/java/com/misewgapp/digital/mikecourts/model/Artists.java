package com.misewgapp.digital.mikecourts.model;

import java.util.List;

public class Artists {
    private String artistId;
    private String name;
    private String nationality;
    private String Influenced_by;

    public Artists(){

    }

    public Artists(String artistId, String name, String nationality, String influenced_by) {
        this.artistId = artistId;
        this.name = name;
        this.nationality = nationality;
        Influenced_by = influenced_by;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getInfluenced_by() {
        return Influenced_by;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setInfluenced_by(String influenced_by) {
        Influenced_by = influenced_by;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "artistId='" + artistId + '\'' +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", Influenced_by='" + Influenced_by + '\'' +
                '}';
    }
}
