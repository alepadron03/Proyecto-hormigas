/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author CMGamer
 */
public class Grafo {
    private NodoGrafo primero;
    private NodoGrafo ultimo;
    
    public Grafo(){
        this.primero = null;
        this.ultimo = null;
    }
    
    private boolean isEmpty(){
        return primero == null;
    }
    
    public boolean existeVertice(Object dato){
        boolean existe = false;
        if(!isEmpty()){
            NodoGrafo aux = primero;
            while(aux != null && !existe){
                if(aux.dato.toString().equals(dato.toString())){
                    existe = true;
                }
                aux = aux.siguiente;
            }
        }
        return existe;
    }
    
    public void nuevaArista(Object origen, Object destino){
        if(existeVertice(origen) && existeVertice(destino)){
            NodoGrafo posicion=primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevaAdyacencia(destino);
        }
    }
    
    public void nuevaArista(Object origen, Object destino, float distancia){
        if(existeVertice(origen) && existeVertice(destino)){
            NodoGrafo posicion=primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevaAdyacencia(destino, distancia);
        }
    }
    
    public void nuevoNodo(Object dato){
        if(!existeVertice(dato)){
            NodoGrafo nodo = new NodoGrafo(dato);
            if(isEmpty()){
                primero = nodo;
                ultimo = nodo;
            }else if(dato.toString().compareTo(primero.dato.toString()) <= 0){
                nodo.siguiente = primero;
                primero = nodo;
            }else if(dato.toString().compareTo(ultimo.dato.toString())>= 0){
                ultimo.siguiente = nodo;
                ultimo = nodo;
            }else{
                NodoGrafo aux = primero;
                while(dato.toString().compareTo(aux.dato.toString()) >= 0){
                    aux = aux.siguiente;
                }
                nodo.siguiente = aux.siguiente;
                aux.siguiente = nodo;
            }       
        }
    }
    
    public String toString(){
        String cadena = "";
        NodoGrafo aux = primero;
        while(aux != null){
            cadena = cadena + aux.dato.toString() +" -> "+aux.lista.toString()+"\n";
            aux = aux.siguiente;
                    
        }
        return cadena;
    }
}
