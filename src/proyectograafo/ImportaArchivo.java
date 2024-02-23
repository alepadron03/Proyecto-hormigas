/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograafo;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author CMGamer
 */
public class ImportaArchivo{
    
    public Grafo lectorDeArchivos(){
        Grafo grafo = new Grafo();
        try{
            BufferedReader lector = new BufferedReader(new FileReader(abridorDeArchivos()));
            String linea = "";
            
            while(!(linea = lector.readLine()).toLowerCase().equals("ciudad")){
            }

            while(!(linea = lector.readLine()).toLowerCase().equals("aristas")){
                grafo.nuevaCiudad(linea);
            }

            while((linea = lector.readLine()) != null){
                String[] separador = linea.split(",");
                String origen = separador[0];
                String destino = separador[1];
                float distancia = Float.parseFloat(separador[2]);
                grafo.nuevoCamino(origen, destino, distancia);
            }
            
            
            lector.close();
            return grafo;
        }catch(IOException e){
            e.printStackTrace();
        }
        return grafo;
    }
    
    public String abridorDeArchivos(){
        try{
            JFileChooser seleccionArchivo = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Elija su TXT", "txt");      
            seleccionArchivo.setFileFilter(filtro);
            seleccionArchivo.setCurrentDirectory(new File("."));
            int result = seleccionArchivo.showOpenDialog(null);

            if(result == JFileChooser.APPROVE_OPTION){
                return seleccionArchivo.getSelectedFile().getAbsolutePath();
                
            }else if(result == JFileChooser.CANCEL_OPTION){
                System.out.println("Algo fallo");
                return "Error";
            }
        }catch(Exception e){
            System.out.println(e);
            return "Error";
        }
        return "Error";
    }
    
    public void salvadorDeArchivos(Grafo grafo){
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("SaveFile.txt"));
            
            escritor.write("ciudad\n");
            Ciudad aux = grafo.primero;
            for (int i = 0; i < grafo.cantidad; i++) {
                escritor.write(aux.dato.toString()+"\n");
                aux = aux.siguiente;
            }
            
            escritor.write("aristas\n");
            aux = grafo.primero;
            for (int i = 0; i < grafo.cantidad; i++) {
                Camino aux2 = aux.lista.primero;
                for (int j = 0; j < aux.lista.cantidad; j++) {
                    escritor.write(aux.dato+","+aux2.destino+","+aux2.distancia+"\n");
                    aux2 = aux2.siguiente;
                }
                aux = aux.siguiente;
            }
            
            escritor.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
