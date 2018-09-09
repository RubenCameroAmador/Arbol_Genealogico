/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolfamiliar;

import java.util.LinkedList;
import javax.swing.JTextField;

/**
 *
 * @author Ruben Camero
 */
public class Arbol {

    Nodo raiz;

    Arbol(Nodo raiz) {
        this.raiz = null;
    }

    //La principal root no cambia
    public Nodo insertar(Nodo principalRoot, Nodo raiz, Nodo padre, String nombre, int ancho) {
        if (raiz == null && padre == null) {
            return new Nodo(nombre, ancho / 2, 20, 0);
        } else {
            return null;
        }
    }

    //the principalRoot no varia, es para calcular el nivel
    public static void insertar(Nodo principalRoot, Nodo raiz, Nodo padre, String nombre, int ancho, int desicion) {
        if (desicion == 1) {
            int pos = padre.getPos() * 2;
            int nivel = 1 + nivel(principalRoot, padre.getNombre(), 0);
            int nroNodos = (int) Math.pow(2, nivel);
            int dx = ancho / nroNodos;
            int Xo = dx / 2;
            int x = Xo + (dx * pos);
            Nodo hijo = new Nodo(nombre, x, (35 * nivel) + 60, pos);
            padre.setHijoIzquierdo(hijo);
        } else {
            if (desicion == 2) {
                int pos = (padre.getPos() * 2) + 1;
                int nivel = 1 + nivel(principalRoot, padre.getNombre(), 0);
                int nroNodos = (int) Math.pow(2, nivel);
                int dx = ancho / nroNodos;
                int Xo = dx / 2;
                int x = Xo + (dx * pos);
                padre.setHijoDerecho(new Nodo(nombre, x, (35 * nivel) + 60, pos));
            }
        }
    }

    public static void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.getNombre());
            System.out.println("(" + raiz.getPosX() + "," + raiz.getPosY() + ")");
            System.out.println(raiz.getPos());
            preOrden(raiz.getHijoIzquierdo());
            preOrden(raiz.getHijoDerecho());
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //para el nivel en el parametro int level. Comienza en 0 siempre
    public static int nivel(Nodo raiz, String nombreNodo, int level) {
        if (raiz != null) {
            if (raiz.getNombre().equals(nombreNodo)) {
                return level;
            } else {
                int i = nivel(raiz.getHijoIzquierdo(), nombreNodo, level + 1);
                int d = nivel(raiz.getHijoDerecho(), nombreNodo, level + 1);
                return Math.max(i, d);
            }
        }
        return -1;
    }

    public static Nodo buscarPadre(Nodo raiz, String nombre) {
        LinkedList<Nodo> cola = new LinkedList<>();
        cola.addFirst(raiz);
        while (!cola.isEmpty()) {
            Nodo q = cola.removeLast();
            if (q.getHijoIzquierdo() != null) {
                if (q.getHijoIzquierdo().getNombre().equals(nombre)) {
                    return q;
                }
            }
            if (q.getHijoDerecho() != null) {
                if (q.getHijoDerecho().getNombre().equals(nombre)) {
                    return q;
                }
            }
            if (q.getHijoIzquierdo() != null) {
                cola.add(q.getHijoIzquierdo());
            }
            if (q.getHijoDerecho() != null) {
                cola.add(q.getHijoDerecho());
            }
        }
        return null;
    }

    //La raiz. Es la raiz principal del árbol
    public static void parentesco(Nodo raiz, Nodo nodoX, Nodo nodoY, JTextField texto) {
        int nivelX = Arbol.nivel(raiz, nodoX.getNombre(), 0);
        int nivelY = Arbol.nivel(raiz, nodoY.getNombre(), 0);
        Nodo padreX = Arbol.buscarPadre(raiz, nodoX.getNombre());
        Nodo padreY = Arbol.buscarPadre(raiz, nodoY.getNombre());
        Nodo abueloX = Arbol.buscarPadre(raiz, padreX.getNombre());
        Nodo abueloY = Arbol.buscarPadre(raiz, padreY.getNombre());
        if (nivelX == nivelY) {
            if (padreX.getNombre().equals(padreY.getNombre())) {
                texto.setText(nodoX.getNombre() + " es hermano(a) de: " + nodoY.getNombre());
            } else {
                if (abueloX.getNombre().equals(abueloY.getNombre())) {
                    texto.setText(nodoX.getNombre() + " es primo(a) de: " + nodoY.getNombre());
                } else {
                    texto.setText("No presentan parentesco");
                }
            }
        } else {
            if (nivelY + 1 == nivelX && nivelX > nivelY) {
                if (nodoY.getNombre().equals(padreX.getNombre())) {
                    texto.setText(nodoX.getNombre() + " es hijo(a) de: " + nodoY.getNombre());
                } else {
                    if (padreY.getNombre().equals(abueloX.getNombre())) {
                        texto.setText(nodoX.getNombre() + " es sobrino(a) de: " + nodoY.getNombre());
                    } else {
                        texto.setText("No presentan parentesco");
                    }
                }
            } else {
                if (nivelX + 1 == nivelY && nivelY > nivelX) {
                    if (nodoX.getNombre().equals(padreY.getNombre())) {
                        texto.setText(nodoY.getNombre() + " es hijo(a) de: " + nodoX.getNombre());
                    } else {
                        if (padreX.getNombre().equals(abueloY.getNombre())) {
                            texto.setText(nodoY.getNombre() + " es sobrino(a) de: " + nodoX.getNombre());
                        } else {
                            texto.setText("No presentan parentesco");
                        }
                    }
                } else {
                    if (nivelY + 2 == nivelX && nivelX > nivelY) {
                        if (abueloX.getNombre().equals(nodoY.getNombre())) {
                            texto.setText(nodoY.getNombre() + " es nieto(a) de: " + nodoX.getNombre());
                        }
                    } else {
                        if (nivelX + 2 == nivelY && nivelY > nivelX) {
                            if (abueloY.getNombre().equals(nodoX.getNombre())) {
                                texto.setText(nodoX.getNombre() + " es nieto(a) de: " + nodoY.getNombre());
                            }
                        } else {
                            texto.setText("No presentan parentesco");
                        }
                    }
                }
            }
        }

    }

    public static void family(Nodo pRoot, Nodo x, Nodo y, JTextField p) {
        int nivelX = Arbol.nivel(pRoot, x.getNombre(), 0);
        int nivelY = Arbol.nivel(pRoot, y.getNombre(), 0);
        Nodo menor = null, mayor = null;
        int diferencia = 0;
        int alturaMin = -1;
        if (nivelX < nivelY) {
            menor = x;
            mayor = y;
            diferencia = nivelY - nivelX;
            alturaMin = nivelY;
        } else {
            if (nivelY < nivelX) {
                menor = y;
                mayor = x;
                diferencia = nivelX - nivelY;
                alturaMin = nivelX;
            } else {
                menor = y;
                mayor = x;
                diferencia = nivelX - nivelY;
                alturaMin = nivelX;
            }
        }
        if (diferencia >= 0 && diferencia <= 2) {
            //por completar con método relación
            Arbol.relacion(pRoot, menor, mayor, diferencia, p, alturaMin);
        } else {
            p.setText("No presentan parentesco");
        }
    }

    private static void relacion(Nodo pRoot, Nodo rMenor, Nodo rMayor, int diferencia, JTextField p, int alturaNivel) {
        switch (diferencia) {
            case 0:
                if (alturaNivel - 2 >= 0) {
                    Nodo padreX = Arbol.buscarPadre(pRoot, rMenor.getNombre());
                    Nodo padreY = Arbol.buscarPadre(pRoot, rMayor.getNombre());
                    Nodo abueloX = Arbol.buscarPadre(pRoot, padreX.getNombre());
                    Nodo abueloY = Arbol.buscarPadre(pRoot, padreY.getNombre());
                    if (padreX.getNombre().equals(padreY.getNombre())) {
                        p.setText(rMenor.getNombre() + " es hermano(a) de: " + rMayor.getNombre());
                    } else {
                        if (abueloX.getNombre().equals(abueloY.getNombre())) {
                            p.setText(rMenor.getNombre() + " es primo(a) de: " + rMayor.getNombre());
                        } else {
                            p.setText("No presentan parentesco");
                        }
                    }
                } else {
                    p.setText(rMenor.getNombre() + " es hermano(a) de: " + rMayor.getNombre());
                }
                break;
            case 1:
                if (alturaNivel - 2 >= 0) {
                    Nodo padreX = Arbol.buscarPadre(pRoot, rMenor.getNombre());
                    Nodo padreY = Arbol.buscarPadre(pRoot, rMayor.getNombre());
                    Nodo abueloX = Arbol.buscarPadre(pRoot, padreX.getNombre());
                    Nodo abueloY = Arbol.buscarPadre(pRoot, padreY.getNombre());
                    if (padreY.getNombre().equals(rMenor.getNombre())) {
                        p.setText(rMayor.getNombre() + " es hijo(a) de: " + rMenor.getNombre());
                    } else {
                        if (padreX.getNombre().equals(abueloY.getNombre())) {
                            p.setText(rMayor.getNombre() + " es sobrino(a) de: " + rMenor.getNombre());
                        } else {
                            p.setText("No presentan parentesco");
                        }
                    }
                } else {
                    p.setText(rMayor.getNombre() + " es hijo(a) de: " + rMenor.getNombre());
                }
                break;
            case 2:
                if (alturaNivel - 2 >= 0) {
                    Nodo padreY = Arbol.buscarPadre(pRoot, rMayor.getNombre());
                    Nodo abueloY = Arbol.buscarPadre(pRoot, padreY.getNombre());
                    if (abueloY.getNombre().equals(rMenor.getNombre())) {
                        p.setText(rMayor.getNombre() + " es nieto(a) de: " + rMenor.getNombre());
                    } else {
                        p.setText("No presentan parentesco");
                    }
                } else {
                    p.setText("No presentan parentesco");
                }
                break;
        }
    }
}
