package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    NORESTE("Noreste"),
    NOROESTE("Noroeste"),
    SURESTE("Sureste"),
    SUROESTE("Suroeste");

    private final String direccionDama;

    Direccion(String direccionDama) {
        this.direccionDama = direccionDama;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Direccion Dama='" + direccionDama + '\'' + '}';
    }
}
