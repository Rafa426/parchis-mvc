package vista;

import java.util.Scanner;

public class VistaMenu {

    private Scanner sc;

    public VistaMenu(Scanner sc) {
        this.sc = sc;
    }

    public int pedirOpcion() {
        System.out.println();
        System.out.println("1. Configurar partida");
        System.out.println("2. Solicitar unirse");
        System.out.println("3. Registrarse como jugador");
        System.out.println("4. Solicitar inicio de juego");
        System.out.println("5. Iniciar partida");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}