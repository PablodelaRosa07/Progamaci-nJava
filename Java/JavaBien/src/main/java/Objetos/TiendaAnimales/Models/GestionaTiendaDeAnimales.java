package Objetos.TiendaAnimales.Models;

public class GestionaTiendaDeAnimales {
    private Mascotas[] mascotas;
    private int contador;

    public GestionaTiendaDeAnimales(int capacidadInicial) {
        this.mascotas = new Mascotas[capacidadInicial];
        this.contador = 0;
    }

    // Insertar mascota con gestión de capacidad
    public void insertarMascota(Mascotas m) {
        if (contador == mascotas.length) {
            ampliarCapacidad();
        }
        mascotas[contador] = m;
        contador++;
    }

    private void ampliarCapacidad() {
        Mascotas[] nuevoArray = new Mascotas[mascotas.length * 2];
        System.arraycopy(mascotas, 0, nuevoArray, 0, mascotas.length);
        mascotas = nuevoArray;
    }

    // Mostrar todos los datos
    public void mostrarTodos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(mascotas[i].toString());
        }
    }

    // Sobrecarga 1: Eliminar por objeto
    public void eliminarAnimal(Mascotas m) {
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].equals(m)) {
                desplazarYBorrar(i);
                return;
            }
        }
    }

    // Sobrecarga 2: Eliminar por nombre, raza y peso
    public void eliminarAnimal(String nombre, String raza, double peso) {
        for (int i = 0; i < contador; i++) {
            Mascotas m = mascotas[i];
            if (m.getNombre().equals(nombre) && m.getPeso() == peso) {
                if (m instanceof Perro && ((Perro) m).getRaza().equals(raza)) {
                    desplazarYBorrar(i);
                    System.out.println("Animal eliminado correctamente.");
                    return;
                }
            }
        }
    }

    private void desplazarYBorrar(int indice) {
        for (int j = indice; j < contador - 1; j++) {
            mascotas[j] = mascotas[j + 1];
        }
        mascotas[contador - 1] = null;
        contador--;
    }

    // Animal con más peso GLOBAL
    public Mascotas obtenerMasPesadoGlobal() {
        if (contador == 0) return null;
        Mascotas max = mascotas[0];
        for (int i = 1; i < contador; i++) {
            if (mascotas[i].getPeso() > max.getPeso()) {
                max = mascotas[i];
            }
        }
        return max;
    }

    // Animal con más peso POR ESPECIE
    public Mascotas obtenerMasPesadoPorEspecie(Class<?> tipo) {
        Mascotas max = null;
        for (int i = 0; i < contador; i++) {
            if (tipo.isInstance(mascotas[i])) {
                if (max == null || mascotas[i].getPeso() > max.getPeso()) {
                    max = mascotas[i];
                }
            }
        }
        return max;
    }
}