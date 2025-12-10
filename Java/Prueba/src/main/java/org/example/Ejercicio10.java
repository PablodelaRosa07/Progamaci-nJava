package org.example;

import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num2 != 0)
        {
            float resultado = num1 / num2;
            System.out.println("La división es:"+resultado);
        }

        else
        {
            System.out.println("La división no se puede hacer");
        }


    }



}
