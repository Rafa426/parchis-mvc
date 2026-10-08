package vista;

public class VistaMenu {

    public int mostrarMenu() {
        System.out.println();
        System.out.println("===== PARCHIS =====");
        System.out.println("1. Configurar partida");
        System.out.println("2. Solicitar unirse");
        System.out.println("3. Registrarse como jugador");
        System.out.println("4. Solicitar inicio de juego");
        System.out.println("5. Iniciar partida");
        System.out.println("0. Salir");
        return Consola.leerEntero("Elige una opcion: ");
    }

    public void mostrarOpcionInvalida() {
        System.out.println("Opcion no valida.");
    }

    public void mostrarDespedida() {
        System.out.println("Hasta luego.");
    }
}
