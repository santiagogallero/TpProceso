package com.entity;

public class PorNivel implements IStrategy {
    private int nivelMin;
    public PorNivel(int nivelMin) {
        this.nivelMin = nivelMin;
    }
    @Override
    public void emparejar(Partido partido) {
        partido.getJugadores().removeIf(j -> j.getNivel() < nivelMin);
        if (partido.getJugadores().size() < 2) {
            throw new RuntimeException("No hay suficientes jugadores con el nivel mínimo requerido.");
        }
        // Aquí podrías agregar lógica adicional para emparejar jugadores según su nivel
    }
}
