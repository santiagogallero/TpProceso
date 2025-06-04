package com;

import com.entity.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear algunos jugadores de ejemplo
        Jugador j1 = new Jugador(1, "Juan", "Pérez", "juan@mail.com", "123", null, 3, 10, 5);
        Jugador j2 = new Jugador(2, "Ana", "García", "ana@mail.com", "456", null, 10, 5, 2);
        Jugador j3 = new Jugador(3, "Luis", "Martínez", "luis@mail.com", "789", null, 2, 20, 7);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);

        // Crear un partido y asignar los jugadores
        Partido partido = new Partido(null, 1, new Date(), new java.sql.Time(System.currentTimeMillis()), 90, null, null, jugadores, null, null, null);

        // Usar estrategia por nivel mínimo 4
        partido.setStrategy(new PorNivel(4));
        partido.emparejar();

        System.out.println("Jugadores emparejados (nivel >= 4):");
        for (Jugador j : partido.getJugadores()) {
            System.out.println(j.getNombre() + " " + j.getApellido() + " - Nivel: " + j.getNivel());
        }
    }
}