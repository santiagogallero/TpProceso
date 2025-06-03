package com.example.demo;

import com.entity.Partido;
import com.entity.state.PartidoArmado;
import org.junit.jupiter.api.Test;

public class PartidoStateTest {

    @Test
    public void testTransiciones() {
        Partido partido = new Partido();
        partido.confirmar();
        partido.cambiarEstado(new PartidoArmado());
        partido.confirmar();
        partido.iniciar();
        partido.finalizar();
    }
}
