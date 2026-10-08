package modelo;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private int numeroJugadores;
    private List<Jugador> jugadores = new ArrayList<Jugador>();
    private boolean iniciada = false;

    public Partida(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }
}
