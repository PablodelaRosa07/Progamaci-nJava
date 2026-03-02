package Objetos.Empresa.Models;

public class JefeDepartamento extends Empleado{

    private int antigüedadEmpresa;

    public JefeDepartamento(String DNI, String nombre, int sueldo, int antigüedadEmpresa) {
        super(DNI, nombre, sueldo);
        this.antigüedadEmpresa = antigüedadEmpresa;
    }

    public int getAntigüedadEmpresa() {
        return antigüedadEmpresa;
    }

    public void setAntigüedadEmpresa(int antigüedadEmpresa) {
        this.antigüedadEmpresa = antigüedadEmpresa;
    }


}
