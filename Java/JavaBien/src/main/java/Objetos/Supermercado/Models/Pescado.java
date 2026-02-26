package Objetos.Supermercado.Models;

enum tipoPescado{
    BLANCO, AZUL, MARISCO;
}

public class Pescado {

    private String origen;
    private String peso;
    private int tiempoDuracion;

    public Pescado(String origen, String peso, int tiempoDuracion) {
        this.origen = origen;
        this.peso = peso;
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }


}
