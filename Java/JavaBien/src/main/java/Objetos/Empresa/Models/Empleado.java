package Objetos.Empresa.Models;

public abstract class Empleado {

    private String DNI;
    private String nombre;
    private int sueldo;

    public Empleado(String DNI, String nombre, int sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


}
