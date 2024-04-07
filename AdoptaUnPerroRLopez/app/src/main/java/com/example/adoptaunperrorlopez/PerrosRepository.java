package com.example.adoptaunperrorlopez;

import java.util.List;

public class PerrosRepository implements Repository {

    private List<Perro> perros = List.of(
            new Perro("1", "Max", "3 años", "Labrador Retriever", "Grande", "labradoretriever"),
            new Perro("2", "Luna", "2 años", "Golden Retriever", "Mediano", "goldenretriever"),
            new Perro("3", "Rocky", "4 años", "Bulldog Francés", "Pequeño", "bulldogfrances"),
            new Perro("4", "Buddy", "5 años", "Pastor Alemán", "Grande", "pastoraleman"),
            new Perro("5", "Daisy", "1 año", "Bichón Frisé", "Pequeño", "bichonfrise")
    );

    @Override
    public List<Perro> findAllPerros() {
        return perros;
    }
}

