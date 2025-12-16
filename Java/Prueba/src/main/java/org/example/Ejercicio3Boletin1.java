package org.example;

import java.util.Scanner;

public class Ejercicio3Boletin1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la base");
        int num = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Dime la altura");
        int num2 = input2.nextInt();

        int resultado = num*num2;
        System.out.println("El área es: "+resultado);
    }
}
