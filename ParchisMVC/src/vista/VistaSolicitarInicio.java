package vista;

public class VistaSolicitarInicio {
   
    public void mostrarAceptada(int jugadores) {
        System.out.println("Solicitud aceptada, hay " + jugadores + " jugadores registrados");
    }

    public void mostrarRechazada() {
        System.out.println("No se puede iniciar, se necesitan al menos 2 jugadores");
    }
}
