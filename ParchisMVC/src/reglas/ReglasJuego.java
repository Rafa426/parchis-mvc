package reglas;

public interface ReglasJuego {

    boolean configurarPartida(int numeroJugadores);

    boolean puedeUnirse();

    boolean registrarJugador(String nombre, String color);

    boolean puedeIniciar();

    boolean iniciarPartida();
}
