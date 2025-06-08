package com.entity;

public class Player {
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private Zona zona;


    public Player (int id, String nombre, String apellido, String mail, String password, Zona zona) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.zona = zona;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public Zona getZona(){
        return zona;
    }

    public String getMail(){
        return mail;
    }
}