package Objetos.Biblioteca.Controller;

import Objetos.Biblioteca.Models.Libro;
import Objetos.Biblioteca.Models.Multimedia;
import Objetos.Biblioteca.Models.Recurso;

public class GestionaBibliotecas {
    public static void main(String[] args) {
        Libro quijote = new Libro("L001", "Pasillo A1", 2, "Cervantes", "Castilla", "Clásico");
        Multimedia halo = new Multimedia("M502", "Estante B", 1, "Halo", "Acción", Multimedia.Tipo.JUEGO, 15);
        Multimedia inception = new Multimedia("M909", "Estante C", 5, "Inception", "Sci-Fi", Multimedia.Tipo.PELICULA, 148);

        System.out.println("--- Estado de la Biblioteca ---");

        void imprimirEstado (quijote, "Don Quijote");

        System.out.println("Prestando: " + halo.getNombre());
        halo.prestar();
        imprimirEstado(halo, halo.getNombre());

        System.out.println("Película: " + inception.getNombre() +
                " | Duración: " + inception.getDuracionMinutos() + " mins" +
                " | Días préstamo: " + inception.getDevuelveDiasPrestamo());


        (Recurso r, String nombre){
            String estado = r.estaDisponible() ? "Disponible" : "No disponible";
            System.out.println("Recurso: " + nombre + " [" + estado + "]");
        }
    }


}
