package org.example;

import java.util.Scanner;

public class Ejercicio7Match {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Habitación  Camas  Planta");
        System.out.println("1.Azul      2      Primera");
        System.out.println("2.Roja      1      Primera");
        System.out.println("3.Verde     3      Segunda");
        System.out.println("4.Rosa      2      Segunda");
        System.out.println("5.Gris      1      Tercera");


        System.out.println("Introduce un número:");
        int num = input.nextInt();

        while (num !=0){

            switch (num) {
                case 1:
                    System.out.println("Primera Planta, 2 camas");
                    break;
                case 2:
                    System.out.println("Primera Planta, 1 cama");
                    break;
                case 3:
                    System.out.println("Segunda Planta, 3 camas");
                    break;
                case 4:
                    System.out.println("Segunda Planta, 2 camas");
                    break;
                case 5:
                    System.out.println("Tercera Planta, 1 cama");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        }
    }
}