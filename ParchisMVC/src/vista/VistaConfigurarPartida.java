package vista;

import java.util.Scanner;

public class VistaConfigurarPartida {

    private Scanner sc;

    public VistaConfigurarPartida(Scanner sc) {
        this.sc = sc;
    }

    public int pedirNumeroJugadores() {
        System.out.print("Numero de jugadores (2 a 4): ");
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void mostrarConfigurada(int numeroJugadores) {
        System.out.println("Partida configurada para " + numeroJugadores + " jugadores");
    }

    public void mostrarError() {
        System.out.println("No se pudo configurar, el numero debe ser de 2 a 4");
    }
}
