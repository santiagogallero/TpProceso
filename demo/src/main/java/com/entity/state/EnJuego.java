package com.entity.state;

import com.entity.Partido;

public class EnJuego implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        System.out.println("El partido ya está en juego.");
    }

    @Override
    public void cancelar(Partido partido) {
        System.out.println("No se puede cancelar un partido en curso.");
    }

    @Override
    public void iniciar(Partido partido) {
        System.out.println("El partido ya está en juego.");
    }

    @Override
    public void finalizar(Partido partido) {
        partido.cambiarEstado(new Finalizado());
    }
}
