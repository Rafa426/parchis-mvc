package modelo;

import reglas.ReglasJuego;

public class ModeloJuego {

    private ReglasJuego reglas;
    private Partida partida;

    public ModeloJuego(ReglasJuego reglas) {
        this.reglas = reglas;
    }

    public Partida getPartida() {
        return partida;
    }

    public boolean configurarPartida(int numeroJugadores) {
        if (reglas.configurarPartida(numeroJugadores)) {
            partida = new Partida(numeroJugadores);
            return true;
        }
        return false;
    }

    public boolean solicitarUnirse() {
        return reglas.puedeUnirse();
    }

    public boolean registrarJugador(String nombre, String color) {
        if (reglas.registrarJugador(nombre, color)) {
            partida.getJugadores().add(new Jugador(nombre, color));
            return true;
        }
        return false;
    }

    public boolean solicitarInicio() {
        return reglas.puedeIniciar();
    }

    public boolean iniciarPartida() {
        if (reglas.iniciarPartida()) {
            partida.setIniciada(true);
            return true;
        }
        return false;
    }
}
