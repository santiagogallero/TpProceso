package com.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Partido {
    private IStrategy strategy;
    private int id;
    private Date fecha;
    private Time horaInicio;
    private int duracion;
    private Deporte deporte;
    private Club club;
    private List<Jugador> jugadores;
    private IEstado estado;
    private IEmparejamiento emparejamiento;
    private List<IObservador> observadores;

    
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void emparejar() {
        if (strategy != null) {
            strategy.emparejar(this);
        }
    }
}