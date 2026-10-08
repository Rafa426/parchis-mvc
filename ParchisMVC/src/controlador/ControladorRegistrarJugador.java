package controlador;

import modelo.ModeloJuego;
import vista.VistaRegistrarJugador;

public class ControladorRegistrarJugador {

    private ModeloJuego modelo;
    private VistaRegistrarJugador vista;

    public ControladorRegistrarJugador(ModeloJuego modelo, VistaRegistrarJugador vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        String nombre = vista.pedirNombre();
        String color = vista.pedirColor();
        if (modelo.registrarJugador(nombre, color)) {
            vista.mostrarRegistrado(nombre, color);
        } else {
            vista.mostrarError();
        }
    }
}

