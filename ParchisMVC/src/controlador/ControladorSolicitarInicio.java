
package controlador;

import modelo.ModeloJuego;
import vista.VistaSolicitarInicio;

public class ControladorSolicitarInicio {
    
    private ModeloJuego modelo;
    private VistaSolicitarInicio vista;

    public ControladorSolicitarInicio(ModeloJuego modelo, VistaSolicitarInicio vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        if (modelo.solicitarInicio()) {
            vista.mostrarAceptada(modelo.getPartida().getJugadores().size());
        } else {
            vista.mostrarRechazada();
        }
    }
    
}
