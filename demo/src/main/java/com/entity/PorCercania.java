package com.entity;

public class PorCercania implements IStrategy {
    private int rango;
    
    public PorCercania(int rango) {
        this.rango = rango;
    }
    
    @Override
    public void emparejar(Partido partido) {
        partido.getJugadores().removeIf(j -> j.getDistancia() > rango);
        if (partido.getJugadores().size() < 2) {
            throw new RuntimeException("No hay suficientes jugadores dentro del rango requerido.");
        }
    }

    
} 
