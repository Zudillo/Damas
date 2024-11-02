package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String colorDama;

    Color(String colorDama) {
        this.colorDama = colorDama;
    }

    @Override
    public String toString() {
        return "Color{" + "Color Dama='" + colorDama + '\'' + '}';
    }
}
