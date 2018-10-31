package com.example.o21582.jasontesting.Model;

import java.util.List;

public class ContenedorColor {

    private List<Color> colores;

    public ContenedorColor(List<Color> colores) {
        this.colores = colores;
    }

    public List<Color> getColores() {
        return colores;
    }

    @Override
    public String toString() {
        return "ContenedorColor{" +
                "colores=" + colores +
                '}';
    }
}
