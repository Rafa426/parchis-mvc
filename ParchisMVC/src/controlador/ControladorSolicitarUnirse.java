
package controlador;

import modelo.ModeloJuego;
import vista.VistaSolicitarUnirse;

public class ControladorSolicitarUnirse {
    
    private ModeloJuego modelo;
    private VistaSolicitarUnirse vista;

    public ControladorSolicitarUnirse(ModeloJuego modelo, VistaSolicitarUnirse vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        if (modelo.solicitarUnirse()) {
            vista.mostrarAceptada();
        } else {
            vista.mostrarRechazada();
        }
    }
}
