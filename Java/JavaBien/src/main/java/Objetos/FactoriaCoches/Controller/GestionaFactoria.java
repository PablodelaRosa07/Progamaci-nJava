package Objetos.FactoriaCoches.Controller;

import Objetos.FactoriaCoches.Models.*;

public class GestionaFactoria {
    public static void main(String[] args) {

        Robot[] inventarioRobots = new Robot[20];

        inventarioRobots[0] = new RobotSoldador("Robot1", 50, Estado.ENCENDIDO, "Soldador", 1250.0, "3");
        inventarioRobots[1] = new RobotPintor("Robot2", 5, Estado.ALERTA, "Pintor");
        inventarioRobots[2] = new RobotEnsamblador("Robot3", 80, Estado.APAGADO, "Ensamblador");

        System.out.println("=== LISTADO DE INVENTARIO ===");
        for (Robot r : inventarioRobots) {
            if (r != null) {

                System.out.println(r.toString());
                System.out.println("Tarea: " + r.ejecutarTarea());
                System.out.print("Intento de recarga: ");
                r.recargar();

                if (r instanceof DispositivoWIFI) {
                    ((DispositivoWIFI) r).conectarWIFI();
                }
                System.out.println("---------------------------------------");
            }
        }
    }
}