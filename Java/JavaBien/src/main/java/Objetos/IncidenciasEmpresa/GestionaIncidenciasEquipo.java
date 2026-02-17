package Objetos.IncidenciasEmpresa;

public class GestionaIncidenciasEquipo {
    static void main(String[] args) {

        Equipo equipo1 = new Equipo("AB1234", "PcPablo", 0, "Windows 11");
        Equipo equipo2 = new Equipo("CD1234", "PcIsidro", 1, "Mac OS");
        Equipo equipo3 = new Equipo("EF1234", "PcPepe", 1, "Linux");
        Equipo equipo4 = new Equipo("GH1234", "PcJose", 2, "Windows 10");


        Incidente incidencia1 = new Incidente("GRAVE", "Falla RAM", equipo4, "REGISTRADA","", "1-1-2025", 1, "FalloRAM");
        Incidente incidencia2 = new Incidente("LEVE", "Falla HDMI", equipo2, "ANALIZADA","", "2-2-2025", 2, "FalloHDMI");
        Incidente incidencia3 = new Incidente("MEDIA", "Falla VGA", equipo3, "EN RESOLUCIÓN","", "3-3-2025", 3, "FalloVGA");
        Incidente incidencia4 = new Incidente("CRITICA", "Falla CPU", equipo4, "CERRADA","30-4-2025", "4-4-2025", 4, "FalloCPU");



    }
}
