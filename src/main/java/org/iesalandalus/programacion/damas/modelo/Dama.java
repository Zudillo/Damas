package org.iesalandalus.programacion.damas.modelo;

import java.util.Random;

import javax.naming.OperationNotSupportedException;

public class Dama {

    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    public Dama() {
        setColor(Color.BLANCO);
        setPosicion(crearPosicionInicial(Color.BLANCO));
        setEsDamaEspecial(false);
    }

    public Dama(Color color) {
        setColor(color);
        setPosicion(crearPosicionInicial(color));
        setEsDamaEspecial(esDamaEspecial);
    }

    private Posicion crearPosicionInicial(Color color) {
        Random random = new Random();
        int fila;
        char columna = 0;
        if (color == Color.BLANCO) {
            fila = random.nextInt(1,3);
        }
        else {
            fila = random.nextInt(6, 8);
        }

        int columnaAleatoria = random.nextInt(1, 4);

        if (fila % 2 != 0) {
            switch (columnaAleatoria) {
                case 1:
                    columna = 'A';
                    break;
                case 2:
                    columna = 'C';
                    break;
                case 3:
                    columna = 'E';
                    break;
                case 4:
                    columna = 'G';
                    break;
                default:
            }
        }
        else {
            switch (columnaAleatoria) {
                case 1:
                    columna = 'B';
                    break;
                case 2:
                    columna = 'D';
                    break;
                case 3:
                    columna = 'F';
                    break;
                case 4:
                    columna = 'H';
                    break;
                default:
            }
        }

        return new Posicion(fila, columna);
    }

    public void mover (Direccion direccion, int pasos) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new NullPointerException("Error: la dirección no puede ser nula");
        }
        if (pasos < 1) {
            throw new IllegalArgumentException("Error: el movimiento debe ser al menos 1.");
        }
        if (!esDamaEspecial) {
            pasos = 1;
            if (color == Color.BLANCO && (direccion == Direccion.SURESTE || direccion == Direccion.SUROESTE)) {
                throw new IllegalArgumentException("Error: las damas blancas no pueden mover hacia atrás.");
            } else if (color == Color.NEGRO && (direccion == Direccion.NORESTE || direccion == Direccion.NOROESTE)) {
                throw new IllegalArgumentException("Error: las damas negras no pueden mover hacia atrás.");
            }
        }

        int nuevaFila = posicion.getFila();
        char nuevaColumna = posicion.getColumna();

        switch (direccion) {
            case NORESTE -> {
                nuevaFila += pasos;
                nuevaColumna += (char) pasos;
            }
            case NOROESTE -> {
                nuevaFila += pasos;
                nuevaColumna -= (char) pasos;
            }
            case SURESTE -> {
                nuevaFila -= pasos;
                nuevaColumna += (char) pasos;
            }
            case SUROESTE -> {
                nuevaFila -= pasos;
                nuevaColumna -= (char) pasos;
            }
            default -> throw new IllegalArgumentException("Error: dirección no válida");
        }

        if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'A' || nuevaColumna > 'H') {
            throw new OperationNotSupportedException("Error: la ficha no puede salir del tablero");
        }

        posicion.setFila(nuevaFila);
        posicion.setColumna(nuevaColumna);

        System.out.println("La dama se ha movido hacia " + direccion + " y su nueva casilla es; " + nuevaFila + ", " + nuevaColumna);

        if ((color == Color.BLANCO && nuevaFila == 8) || (color == Color.NEGRO && nuevaFila == 1)) {
            esDamaEspecial = true;
        }

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

    @Override
    public String toString() {
        return "La dama de color " + color +", " + posicion + ", ¿es dama especial? " + (esDamaEspecial ? "Sí" : "No");
    }
}
