/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble;

/**
 *
 * @author franc
 */
public class Nodo {//por ser lista doblemente enlazada se crean siguiente y anterior
    Nodo siguiente;
    Nodo anterior;
    String dato;
    //constructor de nodo
    public Nodo(String d,Nodo an, Nodo sig){
       
       siguiente = sig;
       anterior = an;
       dato = d;
}
//Metodos aplicados a cada nodo y dato
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
