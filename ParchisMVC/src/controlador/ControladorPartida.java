package controlador;

import java.util.Scanner;
import modelo.ModeloJuego;
import vista.*;

public class ControladorPartida {

    private VistaMenu vistaMenu;
    private ControladorConfigurarPartida cu1;
    private ControladorRegistrarJugador cu2;
    private ControladorIniciarPartida cu3;
    private ControladorSolicitarUnirse cu4;
    private ControladorSolicitarInicio cu5;

    public ControladorPartida(ModeloJuego modelo, Scanner sc) {
        vistaMenu = new VistaMenu(sc);
        cu1 = new ControladorConfigurarPartida(modelo, new VistaConfigurarPartida(sc));
        cu2 = new ControladorRegistrarJugador(modelo, new VistaRegistrarJugador(sc));
        cu3 = new ControladorIniciarPartida(modelo, new VistaIniciarPartida());
        cu4 = new ControladorSolicitarUnirse(modelo, new VistaSolicitarUnirse());
        cu5 = new ControladorSolicitarInicio(modelo, new VistaSolicitarInicio());
    }

    public void iniciar() {
        int opcion = -1;
        while (opcion != 0) {
            opcion = vistaMenu.pedirOpcion();
            if (opcion == 1) {
                cu1.ejecutar();
            } else if (opcion == 2) {
                cu4.ejecutar();
            } else if (opcion == 3) {
                cu2.ejecutar();
            } else if (opcion == 4) {
                cu5.ejecutar();
            } else if (opcion == 5) {
                cu3.ejecutar();
            } else if (opcion != 0) {
                System.out.println("Opcion no valida");
            }
        }
    }
}
