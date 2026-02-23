package Objetos.TiendaAnimales.Models;

public abstract class Aves {

    private String tipoPico;
    private boolean vuela;

    public Aves(String tipoPico, boolean vuela) {
        this.tipoPico = tipoPico;
        this.vuela = vuela;
    }
}
