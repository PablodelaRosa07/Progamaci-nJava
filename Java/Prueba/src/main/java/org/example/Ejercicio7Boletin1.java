package org.example;

import java.util.Scanner;

public class Ejercicio7Boletin1 {
    static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el número: ");
    int num = input.nextInt();

    Ejercicio7Boletin1 referencia = new Ejercicio7Boletin1();
    referencia.imprimeMultiplos(num);

    }
    public void imprimeMultiplos(int num){
        for (int i = 1; i < 11; i++) {
            int multiplo = i*num;
            System.out.println(multiplo);
        }
    }

}
