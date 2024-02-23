/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

/**
 *
 * @author alexp
 */
public class Hormiga extends Grafo {
    private Grafo grafo;
    private Ciudad ciudadActual;
// private ListaCaminos caminoRecorrido;
    private Ciudad[] ciudadRecorrida;

  

    private int indiceCamino;
    public float distancia;
    public String ciudadesQuerecorrio;


    public Hormiga(Ciudad primera, int CantidadCiudades) {
        this.ciudadActual = primera;
        this.ciudadRecorrida = new Ciudad[CantidadCiudades];
        ciudadRecorrida[0] = primera;
    }
    
    

// Las simulaciones se podrán realizar con un mínimo de 4 ciudades y hasta un máximo de 20 ciudades.

   public boolean comprobarCiudadHormiga(Ciudad ciudad){
       for (int i = 0; i < ciudad; i++) {
           if(ciudadRecorrida[i].dato.toString().equals(ciudad.dato.toString())){
               System.out.println("Ya visitaste esta ciudad");
               return false;
           }
         
       }
       return true;
      
       
       
   }
   
   public void agregarCiudadHormiga(Ciudad ciudad){
      
       if(comprobarCiudadHormiga(ciudad)){
           Ciudad[] array = Arrays.copuOf()
       }  
       
       
   }

    public Ciudad getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(Ciudad ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public Ciudad[] getCiudadRecorrida() {
        return ciudadRecorrida;
    }

    public void setCiudadRecorrida(Ciudad[] ciudadRecorrida) {
        this.ciudadRecorrida = ciudadRecorrida;
    }

    public int getIndiceCamino() {
        return indiceCiudad;
    }

    public void setIndiceCamino(int indiceCamino) {
        this.indiceCiudad = indiceCamino;
    }
    
    
    

    

    
   
    
}
