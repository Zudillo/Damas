package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.damas.Posicion;

import java.util.Random;

public class Dama {

    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    public Dama() {
        setColor(Color.BLANCO);
    }

    public Dama(Color color, Posicion posicion, boolean esDamaEspecial) {
        setColor(color);
        setPosicion(getPosicion());
        setEsDamaEspecial(false);
    }

    private Posicion crearPosicionInicial() {
        return getPosicion();
    }

    private Posicion mover(Direccion direccion) {

        return getPosicion();
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Error: no es un color válido.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("Error: no es una posición válida.");
        }
        this.posicion = posicion;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}
