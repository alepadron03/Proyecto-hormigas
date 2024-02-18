/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author CMGamer
 */
public class NodoGrafo {
    Object dato;
    ListaAdyacencia lista;
    NodoGrafo siguiente;
    
    
    public NodoGrafo(Object x){
        dato = x;
        lista = new ListaAdyacencia();
        siguiente = null; 
    }
}
