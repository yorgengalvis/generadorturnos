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
public class Pila<E> {
    Nodo<E> pila;

    public Pila() {
        pila = null;
    }

    public boolean isEmpty() {
        return pila == null;
    }

    public void apilar(E dato) {
        Nodo<E> aux = new Nodo(dato, pila);
        pila = aux;
    }

    public E desapilar() throws Exception {
        E resultado;
        if (isEmpty()) {
            throw new Exception("Desapilar: La pila esta vacia");
        }
        resultado = pila.getInfo();
        pila = pila.getSig();
        return resultado;
    }
}
