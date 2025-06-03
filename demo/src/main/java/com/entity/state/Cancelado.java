package com.entity.state;

import com.entity.Partido;

public class Cancelado implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        System.out.println("No se puede confirmar un partido cancelado.");
    }

    @Override
    public void cancelar(Partido partido) {
        System.out.println("El partido ya está cancelado.");
    }

    @Override
    public void iniciar(Partido partido) {
        System.out.println("No se puede iniciar un partido cancelado.");
    }

    @Override
    public void finalizar(Partido partido) {
        System.out.println("No se puede finalizar un partido cancelado.");
    }
}
