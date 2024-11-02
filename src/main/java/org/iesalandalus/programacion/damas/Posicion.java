package org.iesalandalus.programacion.damas;

import java.util.Objects;

public class Posicion {
    int fila;
    char columna;

    public Posicion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Posicion(Posicion posicion) {
        this.fila = posicion.fila;
        this.columna = posicion.columna;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila +", columna=" + columna + '}';
    }
}
