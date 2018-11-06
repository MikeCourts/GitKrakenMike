package com.misewgapp.digital.amiiboapi.model;

public class Amiibo {
    private String name;
    private String image;
    private String amiiboSeries;

    public Amiibo(String name, String image, String amiiboSeries) {
        this.name = name;
        this.image = image;
        this.amiiboSeries = amiiboSeries;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getAmiiboSeries() {
        return amiiboSeries;
    }

    @Override
    public String toString() {
        return "Amiibo{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", amiiboSeries='" + amiiboSeries + '\'' +
                '}';
    }
}
