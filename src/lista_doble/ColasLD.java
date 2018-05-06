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
public class ColasLD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Cola_ListaDoble LD = new Cola_ListaDoble();
     
     //Encolar
     LD.encolarF("Fernando");
     LD.encolarF("Juan");
     LD.encolarF("Roberto");
     LD.encolarF("David");
     
     //Mostrar cola
     LD.mostrarCola();
     //Desencolar
     System.out.println("_____________________________________");
     System.out.println("Eliminando a"+LD.desenconlarI());
     //tamaño
     System.out.println("_____________________________________");
     System.out.println("El tamaño es"+LD.tamaño());
     // mostrar cola
     System.out.println("_____________________________________");
     LD.mostrarCola();
     System.out.println("_____________________________________");
     System.out.println("Eliminando a"+LD.desenconlarI());
     // mostrar cola
     System.out.println("_____________________________________");
     LD.mostrarCola();
     //buscar
     System.out.println("_____________________________________");
     System.out.println(LD.buscar("david"));
     
     //mostra primer dato
     System.out.println("_____________________________________");
     System.out.println("El primer dato es"+LD.mostrarprimero());
     
     //mostrar segundo dato
     System.out.println("_____________________________________");
     System.out.println("El ultimo dato es "+ LD.mostrarultimo());
    }
}