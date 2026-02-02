package Objetos.Notas;

public class GestionaNotas {
    static void main(String[] args) {

        Notas persona1 = new Notas("Mates", 9, 7, 8, 8);
        Notas persona2 = new Notas("Mates", 4, 5, 5, 5);
        Notas persona3 = new Notas("Mates", 10, 10, 10, 10);

        persona1.trimestresAprobados();
        persona1.notaMediaFinal();
        persona2.trimestresAprobados();
        persona2.notaMediaFinal();
        persona3.trimestresAprobados();
        persona3.notaMediaFinal();
    }
}
