package com.misewgapp.digital.mikecourts.model;

import java.util.List;

public class Artists {
    private Integer id;
    private String name;
    private String nationality;
    private List<Artists> Influenced_by;

    public Artists(Integer id, String name, String nationality, List<Artists> influenced_by) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        Influenced_by = influenced_by;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public List<Artists> getInfluenced_by() {
        return Influenced_by;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", Influenced_by=" + Influenced_by +
                '}';
    }
}
