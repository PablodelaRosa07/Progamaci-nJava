package Objetos.TiendaAnimales.Models;

public class Canario extends Aves{

    private String color;
    private boolean canta;

    public Canario(String tipoPico, boolean vuela, String color, boolean canta) {
        super(tipoPico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "Canario{" +
                "color='" + color + '\'' +
                ", canta=" + canta +
                '}';
    }

    public void muestra(){
        System.out.println();
    }

    public void habla(){
        System.out.println();
    }

    public void volar(){
        System.out.println();
    }
}
