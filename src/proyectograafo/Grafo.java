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
 * javadoc @author joseg
 */


public class Grafo {
    public Ciudad primero;
    public Ciudad ultimo;
    public int cantidad;
    
    public Grafo(){
        this.primero = null;
        this.ultimo = null;    
    }
    
    /**
     * @param dato nos indica si existe el objeto "ciudad" que exista
     * @return existe nos indica si existe la ciudad
     * 
     * Funciona detectando si la canitdad es mayor que 0, en tal caso la ciudad aux sera la primera,
     * y mientras que el aux no sea 0 y mientras que sea distinto de verdadero entonces comprobará
     * si el dato del aux convertido en string es igual al dato pasado como parametro en string; si es igual
     * se comprueba que exista, de lo contrario, continua el recorrido.
     */
    public boolean existeCiudad(Object dato){
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
    
    /**
     * Este método sirve para hacer un nuevo camino.
     * @param origen define al objeto ciudad origen
     * @param destino define al objeto ciudad destino
     * @param distancia representa la distancia entre ciudades
     */
    
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
     
    /**
     * Este método sirve para hacer una nueva ciudad.
     * Si no existe la ciudad con el dato s ehace una nueva ciudad; si la cantidad es igual a 0,
     * el this.primero sera igual a nodo e igual el ultimo, de ahí se suma la cantidad de ciudades.
     * @param dato 
     */
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
     
    /**
     * El método eliminarCiudad elimina una ciudad. 
     * @param dato es la ciudad que queremos eliminar
     */
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
               
                if (aux == this.primero){ //si el aux es el primero 
                   this.primero = this.primero.siguiente; //ahora va a puntar hacia el siguiente
                   aux.siguiente = null; //el aux.siguiente va a ser null; osea el siguiente a this.primero va a apuntar a nada
                   this.cantidad--; //la cantidad se le resta
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
    
    /**
     * Elimina caminos.
     * Verifica si existe una ciudad en el origen y que exista una ciudad en el destino
     * luego recorre las ciudades hasta encontrar la del parametro origen, para luego acceder a la posicion y eliminar el destino.
     * 
     * 
     * @param origen es la ciudad origen
     * @param destino es la ciudad destino
     */
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
