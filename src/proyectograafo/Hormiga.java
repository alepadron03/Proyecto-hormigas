/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

import proyectograafo.Ciudad;

/**
 *
 * @author alexp
 */
public class Hormiga {
    private Ciudad ciudadActual;
// private ListaCaminos caminoRecorrido;
    private Ciudad[] ciudadRecorrida;
    private int indiceCamino;

    public Hormiga( int cantidadDeCiudad) {
        this.ciudadActual = ciudadActual;
        this.ciudadRecorrida = new Ciudad[cantidadDeCiudad];
        this.indiceCamino = 0;
    }
// Las simulaciones se podrán realizar con un mínimo de 4 ciudades y hasta un máximo de 20 ciudades.

    public void agregarCiudad(Ciudad ciudad){
        if(indiceCamino<ciudadRecorrida.length){
            this.ciudadRecorrida[indiceCamino]=ciudad;
            indiceCamino++;
        }else{
            System.out.println("No se puede agregar mas caminos, el arreglo esta lleno");
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
        return indiceCamino;
    }

    public void setIndiceCamino(int indiceCamino) {
        this.indiceCamino = indiceCamino;
    }
    
    
    

    

    
   
    
}
