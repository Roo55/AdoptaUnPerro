package com.example.adoptaunperrorlopez;

public class Perro {

    private String id;
    private String nombre;
    private String edad;
    private String raza;
    private String tamano;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return tamano;
    }

    public Perro(String id, String nombre, String edad, String raza, String tamano) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }
}
