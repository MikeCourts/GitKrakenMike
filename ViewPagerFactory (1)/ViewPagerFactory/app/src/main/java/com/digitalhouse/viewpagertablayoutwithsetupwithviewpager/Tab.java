package com.digitalhouse.viewpagertablayoutwithsetupwithviewpager;

public class Tab {
    // Atributos
    private String titulo;
    private Integer icon;
    private Integer color;

    // Constructor
    public Tab(String titulo, Integer icon, Integer color) {
        this.titulo = titulo;
        this.icon = icon;
        this.color = color;
    }

    // Getter
    public String getTitulo() {
        return titulo;
    }

    public Integer getIcon() {
        return icon;
    }

    public Integer getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Tab{" +
                "titulo='" + titulo + '\'' +
                ", icon=" + icon +
                ", color=" + color +
                '}';
    }
}
