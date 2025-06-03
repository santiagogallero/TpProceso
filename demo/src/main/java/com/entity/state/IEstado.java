package com.entity.state;

import com.entity.Partido;

public interface IEstado {
    void confirmar(Partido partido);
    void cancelar(Partido partido);
    void iniciar(Partido partido);
    void finalizar(Partido partido);
}