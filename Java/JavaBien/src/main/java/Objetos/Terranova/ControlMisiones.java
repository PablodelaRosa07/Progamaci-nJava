package Objetos.Terranova;

import java.util.Date;

public class ControlMisiones {
    static void main(String[] args) {
        Date a = new Date(2026);
        Nave nave1 = new Nave(010, 12, "Ford Fiesta");
        Nave nave2 = new Nave(011, 2, "Seat Panda");

        Exploracion mision1 = new Exploracion(1234, "Planificada", a, nave1);

    }


}
