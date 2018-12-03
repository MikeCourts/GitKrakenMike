package com.digitalhouse.firebasedatabase.pojo;

public class Tweet {
    private String id;
    private String nombre;
    private String apellido;
    private String lastTweet;

    public Tweet(){

    }

    public Tweet(String id, String nombre, String apellido, String lastTweet) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lastTweet = lastTweet;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLastTweet() {
        return lastTweet;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", lastTweet='" + lastTweet + '\'' +
                '}';
    }
}
