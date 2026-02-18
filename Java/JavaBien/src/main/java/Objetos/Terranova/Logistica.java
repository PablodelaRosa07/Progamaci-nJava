package Objetos.Terranova;

import java.util.Date;

public class Logistica extends Mision{

    private String[] suministros = new String[10];
    private float carga;

    public Logistica(int codigoNumerico, String estado, Date fechaLanzamiento, Nave naveAsignada, String nombreClase, float carga, String[] suministros) {
        super(codigoNumerico, estado, fechaLanzamiento, naveAsignada, nombreClase);
        this.carga = carga;
        this.suministros = suministros;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public String[] getSuministros() {
        return suministros;
    }

    public void setSuministros(String[] suministros) {
        this.suministros = suministros;
    }


}
