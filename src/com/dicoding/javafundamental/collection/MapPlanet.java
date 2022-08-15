package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String, PlanetForMap> planets = new HashMap();
        planets.put("key-1", new PlanetForMap("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
        planets.put("key-2", new PlanetForMap("Venus", 0.82));
        planets.put("key-3", new PlanetForMap("Earth", 1.00));
        planets.put("key-4", new PlanetForMap("Mars", 0.11));
        planets.put("key-4", new PlanetForMap("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map planets awal: (size = "+ planets.size() +")");
        for (String key : planets.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map

        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (PlanetForMap planet : planets.values()) { // looping value dari Map
            System.out.println("\t " + planet);
        }
    }
}
