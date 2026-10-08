package reglas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReglasJuegoMock implements ReglasJuego {

    private List<String> coloresValidos = Arrays.asList("ROJO", "AZUL", "AMARILLO", "VERDE");
    private List<String> nombres = new ArrayList<String>();
    private List<String> colores = new ArrayList<String>();
    private int maxJugadores = 0;
    private boolean inicioSolicitado = false;
    private boolean iniciada = false;

    public boolean configurarPartida(int numeroJugadores) {
        if (numeroJugadores < 2 || numeroJugadores > 4) {
            return false;
        }
        maxJugadores = numeroJugadores;
        nombres.clear();
        colores.clear();
        inicioSolicitado = false;
        iniciada = false;
        return true;
    }

    public boolean puedeUnirse() {
        return maxJugadores > 0 && !iniciada && nombres.size() < maxJugadores;
    }

    public boolean registrarJugador(String nombre, String color) {
        if (!puedeUnirse()) {
            return false;
        }
        if (nombre.isEmpty() || nombres.contains(nombre)) {
            return false;
        }
        if (!coloresValidos.contains(color) || colores.contains(color)) {
            return false;
        }
        nombres.add(nombre);
        colores.add(color);
        return true;
    }

    public boolean puedeIniciar() {
        if (maxJugadores == 0 || iniciada || nombres.size() < 2) {
            return false;
        }
        inicioSolicitado = true;
        return true;
    }

    public boolean iniciarPartida() {
        if (!inicioSolicitado) {
            return false;
        }
        iniciada = true;
        return true;
    }
}
