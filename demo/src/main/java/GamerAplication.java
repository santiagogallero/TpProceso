package com;

import com.entity.Zona;
import com.entity.Player;
import com.entity.Partido;
import com.service.PlayerService;
import com.entity.JugadorPartido;

import java.util.Scanner;

public class GamerAplication {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        //zona fija: UADE
        Zona zona = new Zona (1, "Zona UADE", "Lima 775");

        Partido partido = new Partido ();
        PlayerService service = new PlayerService();

        System.out.print ("¿Cuantos Jugadores queres inscribir? ");
        int cantidad = Integer.parseInt (scanner.nextLine());

        for (int i=0; i< cantidad; i++ ){
            System.out.println ("\nJugador #" + (i+1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine ();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print ("Mail: ");
            String mail = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            Player jugador = new Player (i +1, nombre, apellido, mail, password, zona);
            service.inscribirJugadorEnPartido (jugador, partido);
        }

        System.out.println ("\nJugadores inscriptos en el partido: ");

        for (JugadorPartido jp : partido.getJugadorPartidos()) {
            Player p = jp.getJugador();
            System.out.println ("- " + p.getNombreCompleto() + " | Mail: " + p.getMail() + " | Zona: " + p.getZona().getNombre());
        }

        scanner.close();
    }
}