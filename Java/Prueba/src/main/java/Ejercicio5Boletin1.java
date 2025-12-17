import org.example.Ejercicio2BoletinPython;

import java.util.Scanner;

public class Ejercicio5Boletin1 {
    static void main(String[] args) {
        Ejercicio5Boletin1 referencia = new Ejercicio5Boletin1();
        int esMultiplos = referencia.funcion(3, 4);
    }

    public int funcion(int num1, int num2) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Eres premium y has gastado más de 50€ o eres mayor de 65 años?(S/N):");
        String respuesta = input.nextLine();

        if (respuesta.equals("S")) {
            System.out.println("Descuento");
        }

        if (respuesta.equals("N")) {
            System.out.println("No descuento");
        }
        return num1;
    }
}







