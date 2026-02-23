package Objetos.TiendaAnimales.Controller;

import Objetos.TiendaAnimales.Models.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Inicializamos con capacidad para 5 (crecerá si es necesario)
        GestionaTiendaDeAnimales tienda = new GestionaTiendaDeAnimales(5);

        // Añadimos los animales del enunciado
        tienda.insertarMascota(new Perro("Rex", 4, "Sano", new Date(), 12.5, "Pequinés", true));
        tienda.insertarMascota(new Loro("Yago", 1, "Hablador", new Date(), 0.8, "Corto", true, "Marruecos", true));
        tienda.insertarMascota(new Serpiente("Nagini", 2, "Muda", new Date(), 25.0, 3, 4));

        System.out.println("--- INVENTARIO ---");
        tienda.mostrarTodos();

        Mascotas masPesado = tienda.obtenerMasPesadoGlobal();
        System.out.println("\nEl animal más pesado es: " + masPesado.getNombre() + " (" + masPesado.getPeso() + "kg)");

        // Ejemplo de peso por especie (Gatos por ejemplo)
        Mascotas perroPesado = tienda.obtenerMasPesadoPorEspecie(Perro.class);
        System.out.println("El perro más pesado es: " + perroPesado.getNombre());
    }
}