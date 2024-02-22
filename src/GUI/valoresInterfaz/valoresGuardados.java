/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.valoresInterfaz;
import javax.swing.*;  


/**
 *
 * @author joseg
 */


        
        
public class valoresGuardados {
    ListaSimple paramObligatorioHormigas;
    ListaSimple paramObligatorioCiclos;
    ListaSimple paramOpcionalAlfa;
    ListaSimple paramOpcionalBeta;
    JFrame warningMensaje;

    public valoresGuardados(ListaSimple paramObligatorioHormigas, ListaSimple paramObligatorioCiclos, ListaSimple paramOpcionalAlfa, ListaSimple paramOpcionalBeta){
        this.paramObligatorioCiclos=paramObligatorioCiclos;
        this.paramObligatorioHormigas=paramObligatorioHormigas;
        this.paramOpcionalAlfa=paramOpcionalAlfa;
        this.paramOpcionalBeta=paramOpcionalBeta;
    }
    
    public void insertarHormiga(int valorHormiga){
        if(valorHormiga>=4 && valorHormiga<=20){
            
          this.paramObligatorioHormigas.hacerLista1(valorHormiga);
                  }else{
            warningMensaje=new JFrame();
            JOptionPane.showMessageDialog(warningMensaje, "No es posible insertar menos de 4 elementos o más de 20 elementos. Por favor ingrese monto válido.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void insertarCiclos(int valorCiclo){
        if(valorCiclo>=4 && valorCiclo<=20){
          this.paramObligatorioCiclos.hacerLista1(valorCiclo);
    }else{
            warningMensaje=new JFrame();
            JOptionPane.showMessageDialog(warningMensaje, "No es posible insertar menos de 4 elementos o más de 20 elementos. Por favor ingrese monto válido.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void insertarAlfa(int valorAlfa){
    this.paramOpcionalAlfa.hacerLista1(valorAlfa);
}
    public void insertarBeta(int valorBeta){
        this.paramOpcionalBeta.insertarfinal(valorBeta);
    }
    
    public String recuperarParamObligatorioCiclo(){ 
        String CicloString=this.paramObligatorioCiclos.buscarUltimoString();
        return CicloString;
    }
    
    public String recuperarParamObligatorioHormigas(){ 
        String HormigaString=this.paramObligatorioHormigas.buscarUltimoString();
        return HormigaString;
    }
    public String recuperarParamOpcionalAlfa(){ 
        String AlfaString=this.paramOpcionalAlfa.buscarUltimoString();
        return AlfaString;
    }
    public String recuperarParamOpcionalBeta(){ 
        String BetaString=this.paramOpcionalBeta.buscarUltimoString();
        return BetaString;
    }
    
    
}
