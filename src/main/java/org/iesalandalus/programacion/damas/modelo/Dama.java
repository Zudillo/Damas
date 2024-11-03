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
        Random random = new Random();
        int fila;
        int columna, columnaAleatoria;
        if (color == Color.BLANCO) {
            fila = random.nextInt(1,3);
        }
        else {
            fila = random.nextInt(6, 8);
        }

        columnaAleatoria = random.nextInt(1, 4);

        if (fila % 2 == 0) {
            switch (columnaAleatoria) {
                case 1:
                    columna = 'a';
                    break;
                case 2:
                    columna = 'c';
                    break;
                case 3:
                    columna = 'e';
                    break;
                case 4:
                    columna = 'g';
                    break;
                default:
            }
        }
        else {
            switch (columnaAleatoria) {
                case 1:
                    columna = 'b';
                    break;
                case 2:
                    columna = 'd';
                    break;
                case 3:
                    columna = 'f';
                    break;
                case 4:
                    columna = 'h';
                    break;
                default:
            }
        }

        return getPosicion();
    }

    private Posicion mover(Direccion direccion) {
        if (direccion == null) {
            throw new NullPointerException("Error: la dirección no puede ser nula");
        }
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
