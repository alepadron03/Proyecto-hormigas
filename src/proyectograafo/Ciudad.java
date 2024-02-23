/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

/**
 *
 * @author CMGamer
 * <code>Representa las ciudades o los vertices/nodos</code>
 */
public class Ciudad {
    Object dato; //el dato es un object
    ListaCaminos lista; //esta es la lista de adyacencia
    Ciudad siguiente; 
    
    
    public Ciudad(Object dato){
        this.dato = dato;
        this.lista = new ListaCaminos();
        this.siguiente = null;
    }
}
