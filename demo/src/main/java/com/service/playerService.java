package com.service;

import com.entity.Partido;
import com.entity.Player;
import com.entity.JugadorPartido;

public class PlayerService {
    public void inscribirJugadorEnPartido (Player jugador, Partido partido) {
        JugadorPartido jugadorPartido = new JugadorPartido (jugador, partido);
        partido.agregarJugador(jugadorPartido);
        System.out.println ("Jugador " + jugador.getNombreCompleto () + " agregado al partido.");

    }

    
}
