package principal;

import controlador.ControladorPartida;
import java.util.Scanner;
import modelo.ModeloJuego;
import reglas.ReglasJuegoMock;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModeloJuego modelo = new ModeloJuego(new ReglasJuegoMock());
        ControladorPartida controlador = new ControladorPartida(modelo, sc);
        controlador.iniciar();
    }
}
