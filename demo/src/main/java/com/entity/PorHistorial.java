package com.entity;

public class PorHistorial implements IStrategy {
    private int historialMin;
    
    public PorHistorial(int historialMin) {
        this.historialMin = historialMin;
    }
    
    @Override
    public void emparejar(Partido partido) {
        partido.getJugadores().removeIf(j -> j.getHistorial() < historialMin);
        if (partido.getJugadores().size() < 2) {
            throw new RuntimeException("No hay suficientes jugadores con el historial mínimo requerido.");
        }
        System.out.println("Emparejando por historial con mínimo: " + historialMin);
        // Aquí podrías agregar lógica adicional para emparejar jugadores según su historial
    }
    
}
