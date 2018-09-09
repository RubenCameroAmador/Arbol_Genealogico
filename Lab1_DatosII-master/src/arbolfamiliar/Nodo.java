/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolfamiliar;

/**
 *
 * @author Ruben Camero
 */
public class Nodo {
    final String nombre;
    Nodo hijoDerecho, HijoIzquierdo;
    final int X, Y, pos;

    public Nodo(String nombre, int X, int Y, int pos) {
        this.nombre = nombre;
        this.X=X;
        this.Y=Y;
        this.pos=pos;
        this.hijoDerecho=null;
        this.HijoIzquierdo=null;
    }

    public String getNombre() {
        return nombre;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getHijoIzquierdo() {
        return HijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo HijoIzquierdo) {
        this.HijoIzquierdo = HijoIzquierdo;
    }

    public int getPosX() {
        return X;
    }

    public int getPos() {
        return pos;
    }

    public int getPosY() {
        return Y;
    }

    
    
    

}
