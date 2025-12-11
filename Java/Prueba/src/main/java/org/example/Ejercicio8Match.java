package org.example;

public class Ejercicio8Match {
    static void main(String[] args) {
        System.out.println("Introduce un número:");
        int num = input.nextInt();

        switch (num)

        {
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





