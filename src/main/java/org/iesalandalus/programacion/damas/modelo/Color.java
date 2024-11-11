package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("blanco"),
    NEGRO("negro");

    private final String cadenaAMostrar;

    Color(String cadenaAMostrar) {this.cadenaAMostrar = cadenaAMostrar;}

    @Override
    public String toString() {return cadenaAMostrar;}

}
