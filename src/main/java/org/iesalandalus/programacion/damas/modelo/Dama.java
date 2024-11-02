package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.damas.Posicion;

public class Dama {

    Color color;
    Posicion posicion;
    boolean esDamaEspecial;

    public Dama(Color color, Posicion inicial, boolean esDamaEspecial) {
        this.color = color;
        this.posicion = inicial;
        this.esDamaEspecial = esDamaEspecial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getInicial() {
        return posicion;
    }

    public void setInicial(Posicion inicial) {
        this.posicion = inicial;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}
