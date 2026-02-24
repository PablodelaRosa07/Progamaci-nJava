package Objetos.FactoriaCoches.Models;

public class RobotEnsamblador extends Robot{
    private double temperatura;
    private String especificacionSeguridad;

    public RobotEnsamblador(String modelo, int bateria, Estado estado, String combustible, String descripcion, String especificacionSeguridad, double temperatura) {
        super(modelo, bateria, estado, combustible, descripcion);
        this.especificacionSeguridad = especificacionSeguridad;
        this.temperatura = temperatura;
    }

    public String ejecutarTarea() { return "Ensamblando."; }

    public boolean recargar() {
        if (this.getEstado() == Estado.APAGADO) {
            System.out.println("Recargando");
            return true;
        }
        System.out.println("Estoy encendido");
        return false;
    }

    public void conectarWIFI() { System.out.println("Ensamblador conectado a la red."); }
    public void desconectarWIFI() { System.out.println("Ensamblador fuera de línea."); }
}
