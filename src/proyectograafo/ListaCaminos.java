/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

/**
 *
 * @author CMGamer
 * <code>Representa la lista de caminos disponibles o la lista de Adyacencia, es decir, no usa matrices</code>
 * 
 */
public class ListaCaminos {
    
    Camino primero;
    Camino ultimo;
    int cantidad;
    
    
    public ListaCaminos(){
        this.primero = null;
        this.ultimo = null;
        this.cantidad = 0;
    }
    
    private boolean existenciaCamino(Object destino){
        boolean existente = false;
        if(this.cantidad == 0){
            return existente;
        }else{
            Camino aux = this.primero;
            while(aux != null && !(destino.toString().equals(aux.destino.toString()))){
                aux = aux.siguiente;
            }
            if(aux != null){
                existente = true;
            }
            return existente;
        }
    }     
    
    public void nuevoCamino(Object destino, float distancia){
        if(!existenciaCamino(destino)){
            Camino nodo = new Camino(destino, distancia);
            creador(nodo, distancia);
        }
    }
    
    private void creador(Camino nodo, Object destino){
        if(this.cantidad == 0){
            this.primero = nodo;
            this.ultimo = nodo;
        }else if (destino.toString().compareTo(this.primero.destino.toString()) <= 0){
            nodo.siguiente = this.primero;
            this.primero = nodo;
        }else if(destino.toString().compareTo(this.ultimo.destino.toString()) >= 0){
            this.ultimo.siguiente = nodo;
            this.ultimo = nodo;
        }else{
            Camino posicion = this.primero;
            while(destino.toString().compareTo(posicion.destino.toString()) < 0){
                posicion = posicion.siguiente;
            nodo.siguiente = posicion.siguiente;
            posicion.siguiente = nodo;
            }
        }
    }
}
