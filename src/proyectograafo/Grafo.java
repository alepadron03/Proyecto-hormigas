/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

/**
 *
 * @author CMGamer
 * <code>Esencialmente este es el constructor del grafo de por si</code>
 */
public class Grafo {
    private Ciudad primero;
    private Ciudad ultimo;
    public int cantidad;
    
    public Grafo(){
        this.primero = null;
        this.ultimo = null;    
    }
    
    private boolean existeCiudad(Object dato){
        boolean existe = false;
        if(this.cantidad > 0){
            Ciudad aux = primero;
            while(aux != null && !existe){
                if(aux.dato.toString().equals(dato.toString())){
                    existe = true;
                }
                aux = aux.siguiente;
            }
        }
        return existe;
    }
    
     public void nuevoCamino(Object origen, Object destino, float distancia){
        if(existeCiudad(origen) && existeCiudad(destino)){
            Ciudad posicion = primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevoCamino(destino, distancia);
            posicion = primero;
            while(!posicion.dato.equals(destino.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevoCamino(origen, distancia);
        }
    }
     
     public void nuevaCiudad(Object dato){
        if(!existeCiudad(dato)){
            Ciudad nodo = new Ciudad(dato);
            if(this.cantidad == 0){
                this.primero = nodo;
                this.ultimo = nodo;
            }else{
                this.ultimo.siguiente = nodo;
                this.ultimo = nodo;
            }
        }
    }
     
    public void eliminarCiudad(Object dato){
        if(!existeCiudad(dato)){
           Ciudad aux = this.primero;
           while(aux.dato.toString() != dato.toString()){
               aux = aux.siguiente;
           }
           //aux.
        }
    }
}
