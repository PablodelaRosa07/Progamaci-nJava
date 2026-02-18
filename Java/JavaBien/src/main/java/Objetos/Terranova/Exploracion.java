package Objetos.Terranova;

import java.util.Date;

public class Exploracion extends Mision{

    private String destino;
    private int tamanyoTripulacion;

    public Exploracion(int codigoNumerico, String estado, Date fechaLanzamiento, Nave naveAsignada, String nombreClase, String destino, int tamanyoTripulacion) {
        super(codigoNumerico, estado, fechaLanzamiento, naveAsignada, nombreClase);
        this.destino = destino;
        this.tamanyoTripulacion = tamanyoTripulacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTamanyoTripulacion() {
        return tamanyoTripulacion;
    }

    public void setTamanyoTripulacion(int tamanyoTripulacion) {
        this.tamanyoTripulacion = tamanyoTripulacion;
    }
}
