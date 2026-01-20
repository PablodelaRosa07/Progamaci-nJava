package EjerciciosClase;

import java.util.Scanner;

public class Racing {
    static void main(String[] args) {
        String[] nombresPilotos = new String[100];
        double[] tiemposPilotos = new double[100];
        int contador = 0;
        Racing referencia = new Racing();

        boolean noSalir = true;
        while (noSalir == true){
            referencia.ejecutarMenu();
            Scanner input = new Scanner(System.in);
            System.out.println("Elige opción: ");
            int sc = input.nextInt();

            if (sc == 1) {
                referencia.inicializarEscuderia(nombresPilotos, tiemposPilotos, contador);
            }

            if (sc == 2){
                referencia.formatearPilotos(nombresPilotos, contador);
            }

            if (sc == 3){

            }

            if (sc == 4){
                referencia.buscarPiloto(nombresPilotos, tiemposPilotos);
            }
        }
    }

    void ejecutarMenu(){
            System.out.println("1. Cargar/Reiniciar Datos: Llama al Apartado 2.\n" +
                    "2. Formatear Nombres: Ejecuta el proceso de limpieza y mayúsculas.\n" +
                    "3. Ver Estadísticas: Muestra la media y el ganador.\n" +
                    "4. Buscar Piloto: Pide un nombre y devuelve su tiempo.\n" +
                    "5. Generar IDs de Carrera: Muestra los códigos de tres letras.\n" +
                    "6. Salir.\n");
        }

    int inicializarEscuderia(String[] nombresPilotos, double[] tiemposPilotos, int contador){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántos pilotos quieres añadir?: ");
        int veces = input.nextInt();

        for (int i = 0; i < veces; i++) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Introduce nombre del piloto: ");
            String nombrePiloto = input2.nextLine();
            System.out.println("Introduce tiempo del piloto:");
            int tiempoPiloto = input2.nextInt();

            while (tiempoPiloto <= -1){
                System.out.println("Introduce tiempo del piloto");
                tiempoPiloto = input2.nextInt();
            }

            nombresPilotos[contador] = nombrePiloto;
            tiemposPilotos[contador] = tiempoPiloto;
            contador = contador+1;
        }
        return contador;
    }

    void formatearPilotos(String[] nombresPilotos, int contador){
        for (int i = 0; i < contador; i++) {
            nombresPilotos[i] = nombresPilotos[i].toUpperCase();
            if (nombresPilotos[i].length() > 10){
                nombresPilotos[i] = nombresPilotos[i].substring(0, 9)+".";
            }
            System.out.println(nombresPilotos[i]);
        }
    }

    double buscarPiloto(String[] nombresPilotos, double[] tiemposPilotos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de piloto:");
        String nombre = sc.nextLine();
        int contador = 0;
        boolean sigue = true;
        while (sigue){
            if (nombresPilotos[contador].equals(nombre)){
                System.out.println(tiemposPilotos[contador]);
                sigue = false;
            }
            if (contador == nombresPilotos.length){
                sigue = false;
            }
            contador +=1;
        }
        return tiemposPilotos[contador];
    }




}
