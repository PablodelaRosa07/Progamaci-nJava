package org.example;

public class Ejercicio1Boletin1 {

    static void main(String[] args) {
        int x = 144;
        int y = 999;

        Ejercicio1Boletin1 referencia = new Ejercicio1Boletin1();
        int resultadoSuma = referencia.sumar(x, y);
        int resultadoRestar = referencia.restar(x, y);
        int resultadoMultiplica = referencia.multiplicar(x, y);
        int resultadoDividir = referencia.dividir(x, y);


    }


    public int sumar(int x, int y) {
        int resultado = x + y;
        System.out.println(resultado);

        return resultado;
    }

    public int restar(int x, int y) {
        int resultado = x - y;
        System.out.println(resultado);

        return resultado;
    }

    public int multiplicar(int x, int y) {
        int resultado = x * y;
        System.out.println(resultado);

        return resultado;
    }

    public int dividir(int x, int y) {
        int resultado = y / x;
        System.out.println(resultado);

        return resultado;
    }
}
