package com.entity;

public class JugadorPartido {
    private Player jugador;
    private Partido partido;

    public JugadorPartido(Player jugador, Partido partido) {
        this.jugador = jugador;
        this.partido = partido;
    }

    public Player getJugador() {
        return jugador;
    }

    public Partido getPartido() {
        return partido;
    }
}
