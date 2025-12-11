package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio1Match {

        static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Dime un número:");
                int num = input.nextInt();

                switch (num){
                        case 0:
                                System.out.println("Cero");
                                break;
                        case 1:
                                System.out.println("Uno");
                                break;
                        case 2:
                                System.out.println("Dos");
                                break;
                        default:
                                System.out.println("Otro");
                                break;




                }
        }






}
