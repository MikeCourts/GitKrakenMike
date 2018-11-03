package com.digitalhouse.retrofitbase.Model.Movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by digitalhouse on 15/01/18.
 */

public class MovieContainer {
    // ATRIBUTO
    @SerializedName("results")
    private List<Movie> movies;

    // Constructor
    public MovieContainer(List<Movie> movies) {
        this.movies = movies;
    }

    // GETTER
    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MovieContainer{" +
                "movies=" + movies +
                '}';
    }
}
