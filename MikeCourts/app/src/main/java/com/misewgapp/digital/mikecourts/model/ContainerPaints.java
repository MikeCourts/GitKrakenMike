package com.misewgapp.digital.mikecourts.model;

import java.util.List;

public class ContainerPaints {
    private List<Paints> paints;

    public ContainerPaints(List<Paints> paints) {
        this.paints = paints;
    }

    public List<Paints> getPaints() {
        return paints;
    }

    @Override
    public String toString() {
        return "ContainerPaints{" +
                "paints=" + paints +
                '}';
    }
}
