/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

import GUI.Menu1AgregarEliminarCargarIniciar;
import GUI.ventanaAgregar;

/**
 *
 * @author CMGamer
 */
public class GrafosInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new InterfazGrafoPrueba().setVisible(true);
        Menu1AgregarEliminarCargarIniciar Ventana1 = new GUI.Menu1AgregarEliminarCargarIniciar(); //Ventana 1, 2 y 3 estan nombradas de tal manera, en su secuencia normal.
        Ventana1.setVisible(true);
        ventanaAgregar vAgregar = new GUI.ventanaAgregar(); //"v" al principio de esta declaración es para abreviar ventana
        vAgregar.setVisible(true);


                
    }
    
}
