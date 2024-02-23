/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.Viewer;
import java.io.File;


/**
 *
 * @author CMGamer
 */
public class VisualizadorGrafo {
    
    
    
    public void GrafoVisualizador(Grafo grafo){
        System.setProperty("org.graphstream.ui", "swing");
        
        Graph grafoVisualizado = new MultiGraph("Visualizacion");
        
        File file = new File("styling.css");
        
        grafoVisualizado.setAttribute("ui.stylesheet", String.format("url('%s')", file.getAbsolutePath()));
        
        Ciudad aux = grafo.primero;
        for (int i = 0; i < grafo.cantidad; i++) {
            grafoVisualizado.addNode(aux.dato.toString());
            aux = aux.siguiente;
        }
        
        Ciudad aux2 = grafo.primero;
        for (int i = 0; i < grafo.cantidad; i++) {
            Camino aux3 = aux2.lista.primero;
            for (int j = 0; j < aux2.lista.cantidad; j++) {
                grafoVisualizado.addEdge(aux2.dato.toString()+aux3.destino,aux2.dato.toString(), aux3.destino.toString());
                aux3 = aux3.siguiente;
            }
            aux2 = aux2.siguiente;
        }
        
        
    }
}
