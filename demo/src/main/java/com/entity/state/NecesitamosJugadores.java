package com.entity.state;

import com.entity.Partido;

public class NecesitamosJugadores implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        System.out.println("No se puede confirmar: faltan jugadores.");
    }

    @Override
    public void cancelar(Partido partido) {
        partido.cambiarEstado(new Cancelado());
    }

    @Override
    public void iniciar(Partido partido) {
        System.out.println("No se puede iniciar: el partido no está armado.");
    }

    @Override
    public void finalizar(Partido partido) {
        System.out.println("No se puede finalizar: el partido no se jugó.");
    }
}
