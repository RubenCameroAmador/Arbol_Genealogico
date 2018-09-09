/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolfamiliar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ruben Camero
 */
public class Grafica {

    /* public static void graficar(Nodo raiz, String nombre, Graphics g, JPanel panel) {
        int x = panel.getWidth();
        g.setColor(Color.white);
        g.drawRect(x / 2, 20, 60, 30);
        g.setColor(Color.BLACK);
        g.drawString(nombre, x/2+4, 37);
    }*/
    private static void draw(Nodo raiz, Graphics g, Nodo check) {
        if (raiz != null) {
           if(raiz==check){
               g.setColor(Color.MAGENTA);
               g.fillRect(raiz.getPosX(), raiz.getPosY(), 60, 40);
           }
            g.setColor(Color.white);
            g.drawRect(raiz.getPosX(), raiz.getPosY(), 60, 40);
            g.setColor(Color.BLACK);
            g.drawString(raiz.getNombre(), raiz.getPosX() + 9, raiz.getPosY() + 20);
            draw(raiz.getHijoIzquierdo(), g, check);
            draw(raiz.getHijoDerecho(), g, check);
        }
    }

    public static void drawTree(Nodo raiz, Graphics g) {
       // draw(raiz, g);
        g.dispose();
    }
    
    public static void drawAll(Nodo raiz, Graphics g, JPanel panel, Nodo check){
        g.clearRect(0, 0, panel.getWidth(), panel.getWidth());
        draw(raiz, g, check);
        DrawLines(raiz, null, g);
    }
    
    public static void lines(Nodo raiz, Nodo padre, Graphics g){
        DrawLines(raiz, padre, g);
        g.dispose();
    }
    private static void DrawLines(Nodo raiz, Nodo padre, Graphics g) {
        if (raiz != null) {
            /*if (raiz != null) {
                if (raiz.getPos() - 1 == padre.getPosX() || raiz.getPos() == padre.getPos()) {
                    g.setColor(Color.BLACK);
                    g.drawLine(padre.getPosX(), padre.getPosY() + 20, raiz.getPosX() + 30, raiz.getPosY());
                } else {
                    g.setColor(Color.BLACK);
                    g.drawLine(padre.getPosX() + 60, padre.getPosY() + 20, raiz.getPosX() + 30, raiz.getPosY());
                }
                
                DrawLines(raiz.getHijoIzquierdo(), raiz, g);
                DrawLines(raiz.getHijoDerecho(), raiz, g);
            }*/
            if(raiz.getHijoIzquierdo()!=null){
                g.setColor(Color.BLACK);
                Nodo hijo = raiz.getHijoIzquierdo();
                g.drawLine(raiz.getPosX(), raiz.getPosY()+20, hijo.getPosX()+30, hijo.getPosY());
            }
            if(raiz.getHijoDerecho()!=null){
                g.setColor(Color.BLACK);
                Nodo hijo = raiz.getHijoDerecho();
                g.drawLine(raiz.getPosX()+60, raiz.getPosY()+20, hijo.getPosX()+30, hijo.getPosY());
            }
            DrawLines(raiz.getHijoIzquierdo(), raiz, g);
            DrawLines(raiz.getHijoDerecho(), raiz, g);
        } else {
        }
    }

    /*public static void changeColor(Nodo nodo, Graphics g, JPanel panel) {
        g.setColor(Color.cyan);
        g.fillRect(nodo.getPosX(), nodo.getPosY(), 60, 40);
        g.setColor(Color.BLACK);
        g.drawString(nodo.getNombre(), panel.getWidth() / 2 + 4, 37);
    }*/

    public static Nodo infoNodo(Nodo raiz, int x, int y) {
       
        if (raiz != null) {
            int x1 = raiz.getPosX();
            int y1 = raiz.getPosY();
            int x2 = x1+60;
            int y2 = y1+40;
            if (x > x1 && x < x2 && y>y1 && y<y2) {
                return raiz;
            } else {
                if (x1+30 > x) {
                    return infoNodo(raiz.getHijoIzquierdo(), x, y);
                } else {
                    return infoNodo(raiz.getHijoDerecho(), x, y);
                }
            }
        }
        return null;
    }
    
}
