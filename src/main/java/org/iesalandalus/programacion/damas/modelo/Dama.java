package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.damas.Posicion;

public class Dama {

    Color color;
    Posicion inicial;
    boolean esDamaEspecial;

    public Dama(Color color, Posicion inicial, boolean esDamaEspecial) {
        this.color = color;
        this.inicial = inicial;
        this.esDamaEspecial = esDamaEspecial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getInicial() {
        return inicial;
    }

    public void setInicial(Posicion inicial) {
        this.inicial = inicial;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}
