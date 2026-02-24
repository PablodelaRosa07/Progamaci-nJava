package Objetos.TiendaAnimales.Controller;

import Objetos.TiendaAnimales.Models.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestionaTiendaDeAnimales tienda = new GestionaTiendaDeAnimales(5);

        tienda.insertarMascota(new Perro("Rex", 4, "Sano", new Date(), 12.5, "Pequinés", true));
        tienda.insertarMascota(new Loro("Yago", 1, "Hablador", new Date(), 0.8, "Corto", true, "Marruecos", true));
        tienda.insertarMascota(new Serpiente("Nagini", 2, "Muda", new Date(), 25.0, 3, 4));

        System.out.println("--- INVENTARIO ---");
        tienda.mostrarTodos();

        Mascotas masPesado = tienda.obtenerMasPesadoGlobal();
        System.out.println("El animal más pesado es: " + masPesado.getNombre() + " (" + masPesado.getPeso() + "kg)");

        Mascotas perroPesado = tienda.obtenerMasPesadoPorEspecie(Perro.class);
        System.out.println("El perro más pesado es: " + perroPesado.getNombre());
    }
}