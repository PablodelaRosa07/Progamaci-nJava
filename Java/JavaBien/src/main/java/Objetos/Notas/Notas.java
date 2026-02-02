package Objetos.Notas;

public class Notas {

    String nombreAsignatura;
    int notaPrimerTrimestre;
    int notaSegundoTrimestre;
    int notaTercerTrimestre;
    int notaMedia;

    public Notas(String nombreAsignatura, int notaPrimerTrimestre, int notaSegundoTrimestre, int notaTercerTrimestre, int notaMedia) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaPrimerTrimestre = notaPrimerTrimestre;
        this.notaSegundoTrimestre = notaSegundoTrimestre;
        this.notaTercerTrimestre = notaTercerTrimestre;
        this.notaMedia = notaMedia;
    }
    int contador = 0;
    public void trimestresAprobados(){
        contador = 0;
        if (notaPrimerTrimestre >= 5){
            contador = contador+1;
        }
        if (notaSegundoTrimestre >= 5){
            contador = contador+1;
        }
        if (notaTercerTrimestre >= 5){
            contador = contador+1;
        }
        System.out.println("Ha aprobado " +contador+ " trimestres.");
    }

    public void notaMediaFinal(){
        notaMedia = (notaPrimerTrimestre+notaSegundoTrimestre+notaTercerTrimestre)/3;
        System.out.println("La nota media es " +notaMedia);
    }
}
