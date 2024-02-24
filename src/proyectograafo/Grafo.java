/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

/**
 *
 * @author CMGamer
 * <code>Esencialmente este es el constructor del grafo de por si</code>
 * 
 */


public class Grafo {
    public Ciudad primero;
    public Ciudad ultimo; 
    public int cantidad; //actual_cities
    
    public Grafo(){ //cambiado el int max

        this.primero = null;
        this.ultimo = null; 
        this.cantidad = 0;
    }
  
 
    public boolean existeCiudad(Object dato){
        boolean existe = false;
        if(this.cantidad > 0){
            Ciudad aux = this.primero;
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
            Ciudad posicion = this.primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevoCamino(destino, distancia);
            
            Ciudad posicion2 = this.primero;
            while(!posicion2.dato.equals(destino.toString())){
                posicion2 = posicion2.siguiente;
            }
            posicion2.lista.nuevoCamino(origen, distancia);
        }
    }
     
    public void nuevaCiudad(Object dato){
        if(!existeCiudad(dato)){
            Ciudad nodo = new Ciudad(dato);
            if(this.cantidad == 0){
                this.primero = nodo;
                this.ultimo = nodo;
                this.cantidad++;
            }else{
                this.ultimo.siguiente = nodo;
                this.ultimo = nodo;
                this.cantidad++;
            }
        }
    }
     
    public void eliminarCiudad(Object dato){
        if(existeCiudad(dato)){
            Ciudad aux3 = this.primero;
            while(aux3 != null){
                eliminarCamino(aux3.dato, dato);
                aux3 = aux3.siguiente;   
            }
            if (this.cantidad == 1){ //aqui se elimina en tal caso de que se aigual a 1
               this.primero = null;
               this.ultimo = null;
               this.cantidad--;
            }else{
                Ciudad aux = this.primero;
                Ciudad aux2 = null;

                while(aux.siguiente != null && (!aux.dato.toString().equals(dato.toString()))){ //mientras que el  siguiente a aux sea diferente de null y el dato aux en string sea distinto del dato en param
                   aux2 = aux; //se recorre lista
                   aux = aux.siguiente;
                }    
                if (aux == this.primero){ 
                   this.primero = this.primero.siguiente; 
                   aux.siguiente = null; 
                   this.cantidad--; 

                }else if(aux == this.ultimo){
                   aux2.siguiente = null;
                   this.ultimo = aux2; 
                   this.cantidad--;
                }else{
                   aux2.siguiente = aux.siguiente; //aqui se borra otro camino
                   aux.siguiente = null;
                   this.cantidad--;
               }
            }
        }
    }
    

    public void eliminarCamino(Object origen, Object destino){
        if(existeCiudad(origen) && existeCiudad(destino)){
            Ciudad posicion = this.primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.eliminarCamino(destino);
            
            posicion = this.primero;
            while(!posicion.dato.equals(destino.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.eliminarCamino(origen);
        }
    }
    
    
    public String toString(){
        String cadena = "";
        Ciudad aux = this.primero;
        while(aux != null){
            cadena = cadena + aux.dato.toString() +" -> "+aux.lista.toString()+"\n";
            aux = aux.siguiente;     
        }
        return cadena;
    }
    
}
