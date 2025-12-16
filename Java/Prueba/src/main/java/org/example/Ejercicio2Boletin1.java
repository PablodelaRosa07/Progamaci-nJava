package org.example;

import java.util.Scanner;

public class Ejercicio2Boletin1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Dime otro número");
        int num2 = input2.nextInt();

        int resultado = num*num2;
        System.out.println("El resultado de la multiplicación es: "+resultado);
    }
}
