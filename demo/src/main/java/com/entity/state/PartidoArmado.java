package com.entity.state;

import com.entity.Partido;

public class PartidoArmado implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        partido.cambiarEstado(new Confirmado());
    }

    @Override
    public void cancelar(Partido partido) {
        partido.cambiarEstado(new Cancelado());
    }

    @Override
    public void iniciar(Partido partido) {
        System.out.println("No se puede iniciar, aún no fue confirmado.");
    }

    @Override
    public void finalizar(Partido partido) {
        System.out.println("No se puede finalizar un partido no iniciado.");
    }
}
