package com.misewgapp.digital.recyclerviewpersonajes;

import java.util.Locale;

public class StarWarsHero {
    // Clase Interna
    public enum Categoria {SITH, JEDI, DROID, ANIMAL}

    // Atributos
    private String nombre;
    private Categoria categoria;
    private Integer imagen;

    // Constructor

    public StarWarsHero(String nombre, Categoria categoria, Integer imagen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Integer getImagen() {
        return imagen;
    }


    // Setters

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
