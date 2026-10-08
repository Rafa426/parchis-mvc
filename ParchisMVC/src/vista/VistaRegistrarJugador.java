package vista;

import java.util.Scanner;

public class VistaRegistrarJugador {

    private Scanner sc;

    public VistaRegistrarJugador(Scanner sc) {
        this.sc = sc;
    }

    public String pedirNombre() {
        System.out.print("Nombre: ");
        return sc.nextLine().trim();
    }

    public String pedirColor() {
        System.out.print("Color (ROJO, AZUL, AMARILLO, VERDE): ");
        return sc.nextLine().trim().toUpperCase();
    }

    public void mostrarRegistrado(String nombre, String color) {
        System.out.println("Jugador " + nombre + " registrado con color " + color);
    }

    public void mostrarError() {
        System.out.println("No se pudo registrar, revisa que haya partida, que el nombre y el color no esten repetidos");
    }
}
