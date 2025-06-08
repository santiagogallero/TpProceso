package com.entity;

public class Zona {
    private int id;
    private String nombre;
    private String direccion;
    private long centro;
    private int radioKm;

    public Zona (int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre () {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
