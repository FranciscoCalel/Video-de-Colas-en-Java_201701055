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
public class Cola_ListaDoble {
// se crean nodos a utilizar en cola juntamente un tamaño
    Nodo primero;
    Nodo ultimo;
    int tamaño;

    public Cola_ListaDoble() {// constructor de cola donde se inciializan nodos y tamaño
        primero = null;
        ultimo = null;
	tamaño = 0;

    }
    public boolean vacia() {
        return primero == null;//si la posicion primera no tiene datos la cola esta vacia
    }

    public void encolarI(String dato) {//se insertan datos al inicio por ser doblemente enlazada

        if (primero == null) {
            primero = new Nodo(dato, null, null);//se representan datos en caso la cola este vacia
            ultimo = primero;

        } else {
            Nodo nuevo = new Nodo(dato, null, primero);
            primero.setSiguiente(nuevo);//se asigna posicion a nuevo dato
            primero = nuevo;
        }
        tamaño ++;
    }

    public void encolarF(String dato) {//se insertan datos al final por ser doblemente enlazada admeas de ser cola

        if (primero == null) {
            ultimo = new Nodo(dato, null, null);//se representan datos en caso la cola este vacia
            primero = ultimo;

        } else {
            Nodo nuevo = new Nodo(dato, ultimo, null);
            ultimo.setSiguiente(nuevo);//se asigna posicion a nuevo dato
            ultimo = nuevo;
        }
        tamaño ++;
    }

    public String desenconlarI() {
        String dato = primero.getDato();//se obtiene dato
        primero = primero.getSiguiente();//cambio de posiciones
	tamaño--;// se reduce tamaño
        if (primero != null) {
            primero.setAnterior(null);
        } else {
            ultimo = null;
        }
        return dato;


    }

    public String desenconlarF() {
        String dato = ultimo.getDato();//se obtiene dato
        ultimo = ultimo.getAnterior();// cambio de posiciones
        tamaño--;
        if (ultimo != null) {
            ultimo.setSiguiente(null);
        } else {
            primero = null;//si no existieran datos al inicio
        }
        return dato;

    }

    public void mostrarCola() {
        Nodo temp = primero;
        while (temp != null) {
            System.out.println(temp.getDato());//se impriment datos
            temp = temp.getSiguiente();

        }

    }
    
    public String mostrarprimero() {
        return primero.getDato();// se muesta primer dato de la fila
    }

    public String mostrarultimo() {
        return ultimo.getDato();//se muestra ultimo dato de la fila
    }
    
	public int tamaño() {
        return tamaño;//se retorna tamaño
    }
    
    public Boolean buscar(String dato){
        Nodo temp= primero;//se crea un nodo temporal
        while(temp!=null){//si el nodo es diferente de vacio
            if(temp.getDato().equals(dato)){//se comparan los datos
                return true;//se muestra en caso sea verdadero
            }
            temp = temp.getSiguiente();
        
    }
        return false;
    }
}
