package org.example;

import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num1 = input.nextInt();

        System.out.println("Introduce un segundo número:");
        int num2 = input.nextInt();

        System.out.println("Introduce un tercer número:");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es:" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es:" + num3);
        }


    }
}