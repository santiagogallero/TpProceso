package com.demo;

import com.entity.Partido;
import com.entity.state.PartidoArmado;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n=== Simulación de estados de Partido ===");

        Partido partido = new Partido(); // Estado inicial: NecesitamosJugadores

        System.out.println("Estado actual: NecesitamosJugadores");
        partido.confirmar(); // No debería confirmar aún
        partido.iniciar();   // No debería iniciar

        System.out.println("Cambiando estado a: PartidoArmado");
        partido.cambiarEstado(new PartidoArmado());

        partido.confirmar(); // Cambia a Confirmado
        partido.iniciar();   // Cambia a EnJuego
        partido.finalizar(); // Cambia a Finalizado
        partido.cancelar();  // No debería cancelar un partido finalizado
    }
}
