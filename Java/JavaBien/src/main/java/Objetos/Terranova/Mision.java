package Objetos.Terranova;

import java.util.Date;

public abstract class Mision {

    private int codigoNumerico;
    private String nombreClase;
    private Date fechaLanzamiento;
    private Nave naveAsignada;
    private String estado;

    public Mision(int codigoNumerico, String estado, Date fechaLanzamiento, Nave naveAsignada, String nombreClase) {
        this.codigoNumerico = codigoNumerico;
        this.estado = estado;
        this.naveAsignada = naveAsignada;
        this.nombreClase = nombreClase;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Nave getNaveAsignada() {
        return naveAsignada;
    }

    public void setNaveAsignada(Nave naveAsignada) {
        this.naveAsignada = naveAsignada;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "codigoNumerico=" + codigoNumerico +
                ", nombreClase='" + nombreClase + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", naveAsignada=" + naveAsignada +
                ", estado='" + estado + '\'' +
                '}';
    }
}
