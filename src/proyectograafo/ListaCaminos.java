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
            creador(nodo, destino);
            
        }
    }
    
    private void creador(Camino nodo, Object destino){
        if(this.cantidad == 0){
            this.primero = nodo;
            this.ultimo = nodo;
            this.cantidad++;
        }else if (destino.toString().compareTo(this.primero.destino.toString()) <= 0){
            nodo.siguiente = this.primero;
            this.primero = nodo;
            this.cantidad++;
        }else if(destino.toString().compareTo(this.ultimo.destino.toString()) >= 0){
            this.ultimo.siguiente = nodo;
            this.ultimo = nodo;
            this.cantidad++;
        }else{
            Camino posicion = this.primero;
            while(destino.toString().compareTo(posicion.siguiente.destino.toString()) > 0){
                posicion = posicion.siguiente;
            }
            nodo.siguiente = posicion.siguiente;
            posicion.siguiente = nodo;
            this.cantidad++;
        }
    }
    
    public void eliminarCamino(Object destino){
        if(existenciaCamino(destino)){
            if(this.cantidad == 1){
                this.primero = null;
                this.ultimo = null;
                this.cantidad--;          
            }else{
                Camino aux = this.primero;
                Camino aux2 = null;
                
                while(aux.siguiente != null && (!aux.destino.toString().equals(destino.toString()))){
                    aux2 = aux;
                    aux = aux.siguiente;
                    }
                if(aux == this.primero){
                    this.primero = this.primero.siguiente;
                    aux.siguiente = null;
                    this.cantidad--;
                }else if(aux == this.ultimo){
                    aux2.siguiente = null;
                    this.ultimo = aux2;
                    this.cantidad--;
                }else{
                    aux2.siguiente = aux.siguiente;
                    aux.siguiente = null;
                    this.cantidad--;       
                }
            }
        }
    }
    
    public Camino obtenerDatoIndice(int dato){
        if(dato == 0){
            return this.primero;
        }else if(dato == this.cantidad-1){
            return this.ultimo;
        }else{
            Camino aux = this.primero;
            for (int i = 0; i < dato; i++) {
                aux = aux.siguiente;
            }
            return aux;
        }
    }

    public int obtenerIndice(Camino dato){
        if(dato == this.primero){
            return 0;
        }else if(dato == this.ultimo){
            return this.cantidad-1;
        }else{
            int x = 0;
            Camino aux = this.primero;
            while(dato != aux){
                aux = aux.siguiente;
                x++;
            }
            return x;        
        }
    }
    
    
    public String toString(){
        String cadena ="";
        Camino aux = this.primero;
        while (aux != null){
            cadena = cadena+aux.destino.toString()+","+String.valueOf(aux.distancia)+" ; ";
            aux = aux.siguiente;
        }
        return cadena;
    }   
}
