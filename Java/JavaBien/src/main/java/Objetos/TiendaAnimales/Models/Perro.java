package Objetos.TiendaAnimales.Models;

import java.util.Date;

public class Perro extends Mascotas {

    private String raza;
    private boolean pulgas; // si o no

    public Perro(int edad, String estado, Date fechaNacimiento, String nombre, boolean pulgas, String raza) {
        super(edad, estado, fechaNacimiento, nombre);
        this.pulgas = pulgas;
        this.raza = raza;
    }


}
