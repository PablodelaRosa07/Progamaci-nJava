package Objetos.TiendaAnimales.Models;

import java.util.Date;

public abstract class Mascotas {

    private String nombre;
    private int edad;
    private String estado;
    private Date fechaNacimiento;

    public Mascotas(int edad, String estado, Date fechaNacimiento, String nombre) {
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }


}
