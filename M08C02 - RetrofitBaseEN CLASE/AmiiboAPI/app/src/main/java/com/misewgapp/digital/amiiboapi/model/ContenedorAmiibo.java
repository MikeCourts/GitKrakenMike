package com.misewgapp.digital.amiiboapi.model;

import java.util.List;

public class ContenedorAmiibo {
    private List<Amiibo> amiibo;

    public ContenedorAmiibo(List<Amiibo> amiibo) {
        this.amiibo = amiibo;
    }

    public List<Amiibo> getAmiibo() {
        return amiibo;
    }

    @Override
    public String toString() {
        return "ContenedorAmiibo{" +
                "amiibo=" + amiibo +
                '}';
    }
}
