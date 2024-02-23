
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
    float feromonas;
    Camino siguiente;
    
    public Camino(Object destino, float distancia){
        this.destino = destino;
        this.distancia = distancia;
        this.siguiente = null;
        this.feromonas = (float) 1.0;
    }

  
    public Object getDestino() {
        return destino;
    }

    /**
     * @return distancia
     */
    public float getDistancia() {
        return distancia;
    }
    
    /**
     * @return feromonas
     */
    public float getFeromonas() {
        return feromonas;
    }

    public Camino getSiguiente() {
        return siguiente;
    }
}
