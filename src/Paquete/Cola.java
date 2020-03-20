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
public class Cola<E> {
    Nodo<E> principio;
    Nodo<E> fin;

    public Cola() {
        principio = null;
        fin = null;
    }
    
    public boolean isEmpty(){
        return principio==null;
    }
    
    public E desencolar()throws Exception{
       E resultado;
       if(isEmpty())throw new Exception("Desencolar: Cola vacia");
       resultado = principio.getInfo();
       principio = principio.getSig();
       if(principio == null)fin=null;
       return resultado;
   }
   
   public void encolar(E elemento){
       Nodo<E> aux=new Nodo(elemento,null);
       if(principio==null){
           principio = aux;
           fin = aux;
       }else{
           fin.setSig(aux);
           fin = aux;
       }
   }
    
}
