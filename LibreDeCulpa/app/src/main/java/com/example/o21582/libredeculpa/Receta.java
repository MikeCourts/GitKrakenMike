package com.example.o21582.libredeculpa;

public class Receta {
    private String titulo;
    private Integer imagen;
    private String ingredientes;
    private String preparacion;

    public Receta(String titulo, Integer imagen, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getImagen() {
        return imagen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }
}
