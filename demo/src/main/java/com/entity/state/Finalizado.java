package com.entity.state;

import com.entity.Partido;

public class Finalizado implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        System.out.println("El partido ya finalizó.");
    }

    @Override
    public void cancelar(Partido partido) {
        System.out.println("No se puede cancelar un partido ya jugado.");
    }

    @Override
    public void iniciar(Partido partido) {
        System.out.println("El partido ya finalizó.");
    }

    @Override
    public void finalizar(Partido partido) {
        System.out.println("El partido ya está finalizado.");
    }
}
