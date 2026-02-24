package Objetos.FactoriaCoches.Controller;

import Objetos.FactoriaCoches.Models.*;

public class GestionaFactoria {
    public static void main(String[] args) {
        Robot[] inventarioRobots = new Robot[20];

        inventarioRobots[0] = new RobotSoldador("1", 50, Estado.ENCENDIDO, "Soldador Pro", 1500, "Nivel 5");
        inventarioRobots[1] = new RobotPintor("2", 5, Estado.ALERTA, "Pintor Premium", "Mucho", "Algo", 1500);
        inventarioRobots[2] = new RobotEnsamblador("3", 80, Estado.APAGADO, "Ensamblador Nini", "Poco", "No", 1650);

        System.out.println("--- INVENTARIO DE LA FACTORÍA ---");
        for (Robot r : inventarioRobots) {
            if (r != null) {
                System.out.println(r.toString());
                System.out.println("Tarea: " + r.ejecutarTarea());
                System.out.print("Intento de recarga: ");
                r.recargar();
                System.out.println("¿Batería suficiente (>10)? " + (r.tieneBateriaSuficiente() ? "Sí" : "No"));
                System.out.println("--------------------------------");
            }
        }
    }
}
