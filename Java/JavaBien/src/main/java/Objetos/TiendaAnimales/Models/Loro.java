package Objetos.TiendaAnimales.Models;

import java.util.Date;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, Date fechaNacimiento, double peso, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    @Override public boolean habla() {
        return this.habla; }
    @Override public String toString() {
        return super.toString() + ", Origen: " + origen + ", Habla: " + habla; }
}

