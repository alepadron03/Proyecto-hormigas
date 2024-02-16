
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyectograafo;

/**
 *
 * @author CMGamer'
 * <code>Representa los Caminos o las aristas/arcos</code>
 */


public class Camino {
    
    Object destino;
    float distancia;
    Camino siguiente;
    
    public Camino(Object destino, float distancia){
        this.destino = destino;
        this.distancia = distancia;
        this.siguiente = null;        
    }
}
