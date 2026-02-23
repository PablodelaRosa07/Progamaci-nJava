package Objetos.TiendaAnimales.Models;

import java.util.Date;

public class Perro extends Mascotas {
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, Date fechaNacimiento, double peso, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    public String getRaza() { return raza; }
    @Override public boolean habla() { return false; }
    @Override public String toString() { return super.toString() + ", Raza: " + raza + ", Pulgas: " + pulgas; }
}
