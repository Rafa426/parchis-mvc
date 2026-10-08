package controlador;

import modelo.ModeloJuego;
import vista.VistaConfigurarPartida;

public class ControladorConfigurarPartida {

    private ModeloJuego modelo;
    private VistaConfigurarPartida vista;

    public ControladorConfigurarPartida(ModeloJuego modelo, VistaConfigurarPartida vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        int numero = vista.pedirNumeroJugadores();
        if (modelo.configurarPartida(numero)) {
            vista.mostrarConfigurada(numero);
        } else {
            vista.mostrarError();
        }
    }
}
