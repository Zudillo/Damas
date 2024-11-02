package org.iesalandalus.programacion.damas;

public class Posicion {
    int fila;
    char columna;

    public Posicion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna < a || columna > h) {
            throw new IllegalArgumentException("La columna debe estar entre a y h");
        }
            this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("La fila debe estar entre 1 y 8");
        }
            this.fila = fila;
    }
}
