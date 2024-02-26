/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;
import EDD.*;
import java.math.*;
import java.util.Random;
/**
 *
 * @author CMGamer
 */
public class Hormiga{
    
    Ciudad actual;
    Lista<String> ciudadesVisitadas;
    Boolean llego;

    public Hormiga(Grafo grafo) {
        Ciudad actual = grafo.primero;
        ciudadesVisitadas = new Lista();
        llego = false;
    }
    
    public void calcularProbabilidad(){
        double x = 0;
        double y = 0;
        double z = 0;
        
        Lista<Camino> caminosPosibles = new Lista();
        
        Camino caminosTomables = actual.lista.primero;
        
        while(caminosTomables != null){
            Nodo<String> aux5 = ciudadesVisitadas.head;
            while(aux5 != null){
                if(!aux5.getData().equals(caminosTomables.destino.toString()))
                    
            }
        }
           
        

        Camino aux = actual.lista.primero;
        while(aux != null) {
            x =+ aux.feromonas*Math.pow(aux.distancia, 2);
            aux = aux.siguiente;
        }
        
        Lista<Double> numeroCalculos = new Lista();
        
        Camino aux2 = actual.lista.primero;
        
        while (aux2 != null){
            double valor = (aux.feromonas*Math.pow(aux.distancia, 2))/x;
            y =+ valor;
            numeroCalculos.addLast(valor);
            aux2 = aux2.siguiente;
        }
        
        Nodo<Double> aux3 = numeroCalculos.head;
        
        while(aux3 != null){
            z =+ (aux3.getData()/y)*100;
            aux3.setData(z);
            aux3 = aux3.next;
        }
        
        Random randomizador = new Random();
        double probabilidad = randomizador.nextInt(100);
        
        Nodo<Double> aux4 = numeroCalculos.head;
        while(aux4 != null){
            if(probabilidad <= aux4.getData()){
                z++;
                break;
            }else{
                z++;
                aux4 = aux4.next;
            }
        }
        
        
                
        
        
        
        
        
        
}
    
    
    

    

    
   
    
}
