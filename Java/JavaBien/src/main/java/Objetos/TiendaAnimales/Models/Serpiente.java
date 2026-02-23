package Objetos.TiendaAnimales.Models;

import java.util.Date;

public class Serpiente extends Mascotas {
    private int numMudadoPielAlAño;
    private int mesesGestacion;

    public Serpiente(String nombre, int edad, String estado, Date fechaNacimiento, double peso, int mudas, int gestacion) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.numMudadoPielAlAño = mudas;
        this.mesesGestacion = gestacion;
    }
    @Override public boolean habla() { return false; }
}
