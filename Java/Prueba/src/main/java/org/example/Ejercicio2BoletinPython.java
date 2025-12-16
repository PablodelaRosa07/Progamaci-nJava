package org.example;

import java.util.Scanner;

public class Ejercicio2BoletinPython {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Dime otro número");
        int num2 = input2.nextInt();

        Ejercicio2BoletinPython referencia = new Ejercicio2BoletinPython();
        int esMultiplos = referencia.esMultiplo(num, num2);
    }

    public int esMultiplo(int num, int num2){
        int resultado = num%num2;
        if (resultado == 0){
            System.out.println("El número 1 es múltiplo del número 2");
        }
        if (resultado != 0){
            System.out.println("No son números múltiplos");
        }

        return resultado;
    }
}
