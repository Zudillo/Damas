package org.iesalandalus.programacion.damas;


import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    public Consola() {
    }

    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear dama por defecto.");
        System.out.println("2. Crear dama eligiendo color." );
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");
    }

    public static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.println("Elige una opción.");
            opcion = Entrada.entero();
            if (opcion < 1 || opcion > 4)
                System.out.println("Error: opción inválida.");
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static Color elegirOpcion() {
        int opcion;
        do {
            System.out.println("Elige un color:");
            System.out.println("1. Blanco.");
            System.out.println("2. Negro.");
            opcion = Entrada.entero();
            if (opcion != 1 && opcion != 2)
                System.out.println("Error: opción inválida.");
        } while (opcion != 1 && opcion != 2);
        return opcion;
    }

    public static void mostrarMenuDirecciones () {
        System.out.println("Elige una dirección:");
        System.out.println("1. Noreste.");
        System.out.println("2. Noroeste.");
        System.out.println("3. Sureste.");
        System.out.println("4. Suroeste.");
    }

    public static int elegirDireccion() {
        int opcion;
        do {
            System.out.println("Elige una opción.");
            opcion = Entrada.entero();
            if (opcion < 1 || opcion > 4)
                System.out.println("Error: opción inválida.");
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static int elegirPasos() {
        int pasos;
        do {
            System.out.println("Introduce el número de pasos.");
            pasos = Entrada.entero();
            if (pasos < 1)
                System.out.println("Error: número de pasos incorrecto.");
        } while (pasos < 1);
        return pasos;
    }

    public static void despedirse() {
        System.out.println("Saliendo de la aplicación. ¡Hasta pronto!");
    }

}
