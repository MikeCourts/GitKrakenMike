package com.digitalhouse.retrofitbase.Model.Movies;

public class Ids {
    // Atributos
    private Integer trakt;
    private String slug;
    private String imdb;
    private Integer tmdb;

    // Constructor
    public Ids(Integer trakt, String slug, String imdb, Integer tmdb) {
        this.trakt = trakt;
        this.slug = slug;
        this.imdb = imdb;
        this.tmdb = tmdb;
    }

    // Getter
    public Integer getTrakt() {
        return trakt;
    }

    public String getSlug() {
        return slug;
    }

    public String getImdb() {
        return imdb;
    }

    public Integer getTmdb() {
        return tmdb;
    }

    @Override
    public String toString() {
        return "Ids{" +
                "trakt=" + trakt +
                ", slug='" + slug + '\'' +
                ", imdb='" + imdb + '\'' +
                ", tmdb=" + tmdb +
                '}';
    }
}
