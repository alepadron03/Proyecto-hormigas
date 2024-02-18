/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author CMGamer
 */
public class Arco {
    
    Object destino;
    float distancia;
    Arco siguiente;
    
    public Arco(Object destino){
        this.destino = destino;
        this.siguiente = null;
    }
    
    public Arco(Object destino, float distancia){
        this.destino = destino;
        this.distancia = distancia;
        this.siguiente = null;
    }
}
