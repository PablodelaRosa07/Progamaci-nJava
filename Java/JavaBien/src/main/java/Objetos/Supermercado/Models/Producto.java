package Objetos.Supermercado.Models;

public class Producto {

    private String identificador;
    private String nombre;
    private String descripcion;
    private String peso;
    private double precioVenta;
    private double precioCompra;
    private double IVAaplicable;

    public Producto(String descripcion, String identificador, double IVAaplicable, String nombre, String peso, double precioCompra, double precioVenta) {
        this.descripcion = descripcion;
        this.identificador = identificador;
        this.IVAaplicable = IVAaplicable;
        this.nombre = nombre;
        this.peso = peso;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getIVAaplicable() {
        return IVAaplicable;
    }

    public void setIVAaplicable(double IVAaplicable) {
        this.IVAaplicable = IVAaplicable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso='" + peso + '\'' +
                ", precioVenta=" + precioVenta +
                ", precioCompra=" + precioCompra +
                ", IVAaplicable=" + IVAaplicable +
                '}';
    }

}
