package org.iesalandalus.programacion.damas.modelo;

import java.util.Objects;

public class Posicion {
    int fila;
    char columna;

    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    public Posicion(Posicion p) {
        if (p == null) {
            throw new IllegalArgumentException("Error: la posición no puede ser nula.");
        }
        setFila(p.getFila());
        setColumna(p.getColumna());
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna < 'A' || columna > 'H') {
            throw new IllegalArgumentException("La columna debe estar entre A y H");
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
        return "está en la fila " + fila +", columna " + columna;
    }
}
