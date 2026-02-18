package Objetos.Terranova;

import java.util.Objects;

public class Nave {

    private int codigoRegistro;
    private String modelo;
    private int horasVuelo;

    public Nave(int codigoRegistro, int horasVuelo, String modelo) {
        this.codigoRegistro = codigoRegistro;
        this.horasVuelo = horasVuelo;
        this.modelo = modelo;
    }

    public int getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(int codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return horasVuelo == nave.horasVuelo && Objects.equals(codigoRegistro, nave.codigoRegistro) && Objects.equals(modelo, nave.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoRegistro, modelo, horasVuelo);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "codigoRegistro='" + codigoRegistro + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horasVuelo=" + horasVuelo +
                '}';
    }
}
