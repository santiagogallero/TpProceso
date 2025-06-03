package com.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.entity.state.IEstado;
import com.entity.state.NecesitamosJugadores;
import com.entity.IObservador;
import com.entity.IEmparejamiento;

public class Partido {

    private int id;
    private Date fecha;
    private Time horaInicio;
    private int duracion;
    private Deporte deporte;
    private Zona zona;
    private List<Player> jugadores;
    private IEstado estado;
    private IEmparejamiento emparejamiento;
    private List<IObservador> observadores;

    // Constructor
    public Partido() {
        this.estado = new NecesitamosJugadores(); // Estado inicial
    }

    // =============================
    // Métodos del patrón STATE
    // =============================

    public void confirmar() {
        estado.confirmar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void finalizar() {
        estado.finalizar(this);
    }

    public void cambiarEstado(IEstado nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // =============================
    // Getters y Setters (mínimos necesarios)
    // =============================

    public List<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Player> jugadores) {
        this.jugadores = jugadores;
    }

    public IEstado getEstado() {
        return estado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public IEmparejamiento getEmparejamiento() {
        return emparejamiento;
    }

    public void setEmparejamiento(IEmparejamiento emparejamiento) {
        this.emparejamiento = emparejamiento;
    }

    public List<IObservador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<IObservador> observadores) {
        this.observadores = observadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
