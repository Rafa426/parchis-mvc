package vista;

import modelo.Partida;

public class VistaIniciarPartida {

    public void mostrarIniciada(Partida partida) {
        System.out.println("La partida ha comenzado");
        for (int i = 0; i < partida.getJugadores().size(); i++) {
            System.out.println("Jugador " + (i + 1) + ": " + partida.getJugadores().get(i).getNombre());
        }
    }

    public void mostrarError() {
        System.out.println("No se pudo iniciar, primero hay que solicitar el inicio del juego");
    }
}
