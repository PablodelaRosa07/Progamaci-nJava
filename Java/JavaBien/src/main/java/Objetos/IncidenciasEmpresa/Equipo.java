package Objetos.IncidenciasEmpresa;

public class Equipo {

    private String nombre;
    private String direccionMac;
    private String so;
    private int numIncidentes;
    private Usuario usuario;

    public Equipo(String direccionMac, String nombre, int numIncidentes, String so) {
        this.direccionMac = direccionMac;
        this.nombre = nombre;
        this.numIncidentes = numIncidentes;
        this.so = so;
        this.usuario = usuario;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIncidentes() {
        return numIncidentes;
    }

    public void setNumIncidentes(int numIncidentes) {
        this.numIncidentes = numIncidentes;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String infoUsuario = (usuario != null) ? usuario.getNombre() : "Sin usuario";
        return "Equipo{" +
                "MAC='" + direccionMac + '\'' +
                ", nombre='" + nombre + '\'' +
                ", SO='" + so + '\'' +
                ", incidentes=" + numIncidentes +
                ", usuario=" + infoUsuario + // Requisito Apartado 4
                '}';
    }
}
