/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author CMGamer
 */
public class ListaAdyacencia {
    
    Arco primero;
    Arco ultimo;
    int cantidad;
    
    
    public ListaAdyacencia(){
        this.primero = null;
        this.ultimo = null;
    }
    
    private boolean isEmpty(){
        return this.primero == null;
    }
    
    public void nuevaAdyacencia(Object destino){
        if(!adyacente(destino)){
            Arco nodo = new Arco(destino);
            insertador(nodo, destino);
            
        }
    }
    
    public void nuevaAdyacencia(Object destino, float distancia){
        if (!adyacente(destino)){
            Arco nodo = new Arco(destino, distancia);
            insertador(nodo, destino);
        }
    }
     
    private void insertador(Arco Nodo, Object destino){
        if(isEmpty()){
            this.primero = Nodo;
            this.ultimo = Nodo;
        }else if (destino.toString().compareTo(this.primero.destino.toString()) <= 0){
            Nodo.siguiente = this.primero;
            this.primero = Nodo;
        }else if(destino.toString().compareTo(this.ultimo.destino.toString()) >= 0){
            this.ultimo.siguiente = Nodo;
            this.ultimo = Nodo;
        }else{
            Arco posicion = this.primero;
            while(destino.toString().compareTo(posicion.destino.toString())>= 0){
                posicion = posicion.siguiente;
            Nodo.siguiente = posicion.siguiente;
            posicion.siguiente = Nodo;
                }
        }
    }

    public boolean adyacente(Object informacionArco){
        Arco aux = this.primero;
        boolean encontrado = false;
       
        while(aux != null && !(informacionArco.toString().equals(aux.destino.toString()))) {
            aux = aux.siguiente;
        }
        
        if(aux != null){
            encontrado = true;
        }
        return encontrado;
    }
    
    public String toString(){
        String cadena ="";
        Arco aux = primero;
        while (aux != null){
            cadena = cadena+aux.destino.toString()+","+String.valueOf(aux.distancia)+" ; ";
            aux = aux.siguiente;
        }
        return cadena;
    }
}
