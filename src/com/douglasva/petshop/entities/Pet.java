package com.douglasva.petshop.entities;

public class Pet {

    private Integer id;
    private Integer vaccine;
    private String name;
    private String species;

    public Pet(Integer id, String name, String species, Integer vaccine) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.vaccine = vaccine;
    }

    public void addVaccine(int vaccine) {
        this.vaccine += vaccine;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVaccine() {
        return vaccine;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return "ID: " + id
                + ", Name: " + name
                + ", Species: " + species
                + ", Vaccines: " + vaccine;
    }

}