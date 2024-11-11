package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Direccion;

public class MainApp {

    private static Dama dama;

    private static void ejecutarOpcion (int opcion) {
        try {
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
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void crearDamaDefecto () {
        try {
            dama = new Dama();
            System.out.println("Se ha creado una dama por defecto.");
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void crearDamaColor () {
        try {
            Color color = Consola.elegirOpcion();
            dama = new Dama(color);
            System.out.println("Se ha creado una dama de color " + color);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mover() {
        if (dama == null) {
            System.out.println("No has creado una dama.");
            return;
        }

        Consola.mostrarMenuDirecciones();
        int opcionDireccion = Consola.elegirDireccion();

        Direccion direccion;
        if (opcionDireccion == 1) {
            direccion = Direccion.NORESTE;
        } else if (opcionDireccion == 2) {
            direccion = Direccion.NOROESTE;
        } else if (opcionDireccion == 3) {
            direccion = Direccion.SURESTE;
        } else if (opcionDireccion == 4) {
            direccion = Direccion.SUROESTE;
        } else {
            System.out.println("Error: opción de dirección no válida.");
            return;
        }

        int pasos = dama.isEsDamaEspecial() ? Consola.elegirPasos() : 1;

        try {
            dama.mover(direccion, pasos);
        } catch (OperationNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarDama () {
        if (dama != null) {
            System.out.println(dama.toString());
        }
        else {
            System.out.println("No has creado una dama.");
        }
    }

    public static void main(String[] args) {
        int opcion;
        try {
            do {
                Consola.mostrarMenu();
                opcion = Consola.elegirOpcionMenu();
                ejecutarOpcion(opcion);
                mostrarDama();
            } while (opcion != 4);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
