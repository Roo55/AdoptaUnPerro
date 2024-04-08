package com.example.adoptaunperrorlopez;

import android.os.Parcel;
import android.os.Parcelable;

public class Perro implements Parcelable {
    private String id;
    private String nombre;
    private String edad;
    private String raza;
    private String tamano;
    private String imagenFondo;
    private String descripcionPerro;

    public Perro(String id, String nombre, String edad, String raza, String tamano, String imagenFondo, String descripcionPerro) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
        this.imagenFondo = imagenFondo;
        this.descripcionPerro = descripcionPerro;
    }

    protected Perro(Parcel in) {
        id = in.readString();
        nombre = in.readString();
        edad = in.readString();
        raza = in.readString();
        tamano = in.readString();
        imagenFondo = in.readString();
        descripcionPerro = in.readString();
    }

    public static final Creator<Perro> CREATOR = new Creator<Perro>() {
        @Override
        public Perro createFromParcel(Parcel in) {
            return new Perro(in);
        }

        @Override
        public Perro[] newArray(int size) {
            return new Perro[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    public String getDescripcionPerro() {
        return descripcionPerro;
    }

    public void setDescripcionPerro(String descripcionPerro) {
        this.descripcionPerro = descripcionPerro;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(nombre);
        dest.writeString(edad);
        dest.writeString(raza);
        dest.writeString(tamano);
        dest.writeString(imagenFondo);
        dest.writeString(descripcionPerro);
    }
}
