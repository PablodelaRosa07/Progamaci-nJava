package Objetos.Vehiculo;

public class GestionaVehiculo {

    public static void main(String[] args) {

        Vehiculo coche1 = new Vehiculo(
                "Toyota", "Corolla", 2018, "Gasolina", 50, 8, 6.5
        );

        Vehiculo coche2 = new Vehiculo(
                "Ford", "Focus", 2020, "Diésel", 55, 20, 5.2
        );

        System.out.println("Consumo coche1 en 120 km: " + coche1.calcularConsumo(120));
        System.out.println("¿Coche1 necesita repostar?: " + coche1.necesitaRepostar());

        System.out.println("Consumo coche2 en 200 km: " + coche2.calcularConsumo(200));
        System.out.println("¿Coche2 necesita repostar?: " + coche2.necesitaRepostar());
    }
}
