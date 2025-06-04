package com.entity;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Jugador {
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private Zona zona;
    private int distancia;
    private int historial;
    private int nivel;

}
