package Objetos.TiendaAnimales.Models;

import java.util.Date;

public abstract class Aves extends Mascotas {
    private String tipoPico;
    private boolean vuela;

    public Aves(String nombre, int edad, String estado, Date fechaNacimiento, double peso, String tipoPico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.tipoPico = tipoPico;
        this.vuela = vuela;
    }
}