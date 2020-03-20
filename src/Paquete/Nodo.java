/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author YorgenGalvis
 */
public class Nodo<E> {
    E info;
    Nodo<E> sig;

    public Nodo() {
    }

    public Nodo(E info, Nodo<E> sig) {
        this.info = info;
        this.sig = sig;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Nodo<E> getSig() {
        return sig;
    }

    public void setSig(Nodo<E> sig) {
        this.sig = sig;
    }
    
    
}
