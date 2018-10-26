package com.digitalhouse.recyclerviewpersonajes;

public class StarWarsHero {
    // Clase Interna
    public enum Categoria { SITH, JEDI, DROID, ANIMAL}

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

    // Getter
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Integer getImagen() {
        return imagen;
    }

    // RESPONSABILIDAD
    public void cambiarLado() {
        if (categoria == Categoria.SITH){
            categoria = Categoria.JEDI;
        } else if (categoria == Categoria.JEDI){
            categoria = Categoria.SITH;
        }
    }
}
