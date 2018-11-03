package com.digitalhouse.retrofitbase.Model.Movies;

/**
 * Created by digitalhouse on 15/01/18.
 */

public class Movie {
    // Atributos
    private String title;
    private Integer year;
    private Ids ids;

    // Constructor
    public Movie(String title, Integer year, Ids ids) {
        this.title = title;
        this.year = year;
        this.ids = ids;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Ids getIds() {
        return ids;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", ids=" + ids +
                '}';
    }
}
