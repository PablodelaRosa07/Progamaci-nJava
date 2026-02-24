package Objetos.TiendaAnimales.Models;

import java.util.Date;

public class Gato extends Mascotas {
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, Date fechaNacimiento, double peso, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    @Override
    public boolean habla() {
        return false; }
}
