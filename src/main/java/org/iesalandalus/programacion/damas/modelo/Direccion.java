package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    NORESTE("Noreste"),
    NOROESTE("Noroeste"),
    SURESTE("Sureste"),
    SUROESTE("Suroeste");

    private final String cadenaAMostrar;

    Direccion(String cadenaAMostrar) {this.cadenaAMostrar = cadenaAMostrar;}

    @Override
    public String toString() {return "Direccion{" + "cadenaAMostrar='" + cadenaAMostrar + '\'' + '}';}
}
