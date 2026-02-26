package Objetos.Supermercado.Models;

enum tipoDetergente{
    MAQUINA, MANO, COMBINADO;
}

enum tipoRopa{
    BLANCA, COLOR;
}

public class Detergente extends Producto{

    private String marca;

    public Detergente(String descripcion, String identificador, double IVAaplicable, String nombre, String peso, double precioCompra, double precioVenta, String marca) {
        super(descripcion, identificador, IVAaplicable, nombre, peso, precioCompra, precioVenta);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
