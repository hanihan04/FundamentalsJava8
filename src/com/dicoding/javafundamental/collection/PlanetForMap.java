package com.dicoding.javafundamental.collection;

class PlanetForMap {
    private String name;
    private double mass;
    public PlanetForMap(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}
