package Objetos.TiendaAnimales.Models;

import java.util.Date;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;
    private Date fechaNacimiento;
    private double peso;

    public Mascotas(String nombre, int edad, String estado, Date fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public abstract boolean habla();

    // Getters necesarios para la lógica del controlador
    public String getNombre() { return nombre; }
    public double getPeso() { return peso; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + "kg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascotas mascotas = (Mascotas) o;
        return edad == mascotas.edad && Objects.equals(nombre, mascotas.nombre);
    }
}
