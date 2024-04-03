package com.example.adoptaunperrorlopez;

import java.util.List;

public class PerrosRepository implements Repository{

    private List<Perro> perros = List.of(
                                            new Perro("1", "Max", "3 años", "Labrador Retriever", "Grande"),
                                            new Perro("2", "Luna", "2 años", "Golden Retriever", "Mediano"),
                                            new Perro("3", "Rocky", "4 años", "Bulldog Francés", "Pequeño"),
                                            new Perro("4", "Buddy", "5 años", "Pastor Alemán", "Grande"),
                                            new Perro("5", "Daisy", "1 año", "Bichón Frisé", "Pequeño")
    );

    @Override
    public List<Perro> findAllPerros() {
        return perros;
    }
}
