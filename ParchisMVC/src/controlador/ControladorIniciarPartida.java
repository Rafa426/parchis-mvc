package controlador;

import modelo.ModeloJuego;
import vista.VistaIniciarPartida;

public class ControladorIniciarPartida {

    private ModeloJuego modelo;
    private VistaIniciarPartida vista;

    public ControladorIniciarPartida(ModeloJuego modelo, VistaIniciarPartida vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        if (modelo.iniciarPartida()) {
            vista.mostrarIniciada(modelo.getPartida());
        } else {
            vista.mostrarError();
        }
    }
}
