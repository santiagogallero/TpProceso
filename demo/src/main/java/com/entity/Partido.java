package com.entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partido {
    private int id;
    private Date fecha;
    private Time horaInicio;
    private int duracion;
    private Deporte deporte;
    private Club club;
    private List<JugadorPartido> jugadorPartidos = new ArrayList <>();
    private IEstado estado;
    private IEmparejamiento emparejamiento;
    private List<IObservador> observadores;

    public void agregarJugador (JugadorPartido jugadorPartido) {
        jugadorPartidos.add (jugadorPartido);
    }

    public List <JugadorPartido> getJugadorPartidos () {
        return jugadorPartidos;
    }
}