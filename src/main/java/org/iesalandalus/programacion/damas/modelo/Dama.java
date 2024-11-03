package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.damas.Posicion;

public class Dama {

    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    public Dama() {
        setColor(Color.BLANCO);
        setPosicion(getPosicion());
        setEsDamaEspecial(false);
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color != Color.BLANCO || color != Color.NEGRO) {
            throw new IllegalArgumentException("Error: no es un color válido.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion < 1 || posicion > 8 || posicion < 'a' || posicion > 'h') {
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
