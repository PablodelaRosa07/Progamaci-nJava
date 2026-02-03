package Objetos.EjercicioNotas;

public class Alumno {

    String nombre;
    String apellidos;
    String email;
    NotaAsignatura notaProg;
    NotaAsignatura notaBBDD;

    public Alumno(String email, String nombre) {

        this.email = email;
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", notaProg=" + notaProg +
                ", notaBBDD=" + notaBBDD +
                '}';
    }

    public void imprimeSiAprobado(String nombreAsignatura) {

        this.notaProg.nombre
    }

}
