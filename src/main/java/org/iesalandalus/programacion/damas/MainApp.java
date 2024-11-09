package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Posicion;

public class MainApp {

    private static Dama dama;

    private static void ejecutarOpcion (int opcion) {
        switch (opcion) {
            case 1:
                crearDamaDefecto();
                break;
            case 2:
                crearDamaColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
        }
    }

    private static void crearDamaDefecto () {
        dama = new Dama ();
        System.out.println("Se ha creado una dama por defecto.");
    }

    private static void crearDamaColor () {
        Color color = Consola.elegirOpcion();
        dama = new Dama(color);
        System.out.println("Se ha creado una dama de color " +color);
    }

    private static void mover () {
        Consola.mostrarMenuDirecciones();
        int pasos = 1;
        if (dama.isEsDamaEspecial()) {
            pasos = Consola.elegirPasos();
        }
    }

    private static void mostrarDama () {
        if (dama != null) {
            System.out.println("Dama de color " + dama.getColor());
            System.out.println("Posición de la dama " + dama.getPosicion());
        }
        else {
            System.out.println("No has creado una dama.");
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 4);

    }

}
