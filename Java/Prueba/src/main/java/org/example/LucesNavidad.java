package org.example;

import java.util.Scanner;

public class LucesNavidad {
    static void main(String[] args) {
    int contadorSi = 0;
    int contadorNo = 0;
    }
    public int lucesEncienden(int ContadorSi, int ContadorNo){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("¿Está la luz bien?:");
            String respuesta = input.nextLine();

            while (respuesta != "si" && respuesta != "no") {
                System.out.println("Quillo ayúdame: si o no:");
            }

            if (respuesta.equals("si")){
                ContadorSi = ContadorSi+1;
            }
            if (respuesta.equals("no")){
                ContadorNo = ContadorNo+1;
            }
        }
        return ContadorSi;

    }


}
