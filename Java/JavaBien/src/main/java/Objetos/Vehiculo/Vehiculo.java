package Objetos.Vehiculo;

public class Vehiculo {

    String marca;
    String modelo;
    int anio;
    String tipoCombustible;
    double capacidadTanque;double combustibleActual;double consumoMedio; // litros cada 100 km

    public Vehiculo(String marca, String modelo, int anio, String tipoCombustible, double capacidadTanque, double combustibleActual, double consumoMedio) {

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
        this.combustibleActual = combustibleActual;
        this.consumoMedio = consumoMedio;
    }

    public double calcularConsumo(double km) {
        return (km / 100.0) * consumoMedio;
    }

    public boolean necesitaRepostar() {
        return combustibleActual < (capacidadTanque * 0.20);
    }
}