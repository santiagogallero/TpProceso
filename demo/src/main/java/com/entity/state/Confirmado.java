package com.entity.state;

import com.entity.Partido;

public class Confirmado implements IEstado {

    @Override
    public void confirmar(Partido partido) {
        System.out.println("El partido ya está confirmado.");
    }

    @Override
    public void cancelar(Partido partido) {
        partido.cambiarEstado(new Cancelado());
    }

    @Override
    public void iniciar(Partido partido) {
        partido.cambiarEstado(new EnJuego());
    }

    @Override
    public void finalizar(Partido partido) {
        System.out.println("No se puede finalizar sin haber comenzado.");
    }
}
