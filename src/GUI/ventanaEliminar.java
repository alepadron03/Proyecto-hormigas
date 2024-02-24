/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import proyectograafo.*;
/**
 *
 * @author joseg
 * 
 */

public class ventanaEliminar extends javax.swing.JFrame {
    /**
     * Desde la ventana eliminar se declara variable vEliminar,
     */
    
    public static Menu1AgregarEliminarCargarIniciar vEliminar;

    /**
     * Creates new form ventanaAgregar
     */
    public ventanaEliminar(Menu1AgregarEliminarCargarIniciar vEliminar) {
        initComponents();
        this.vEliminar=vEliminar;
        vEliminar.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        elegirHormigasCiudades = new javax.swing.JComboBox<>();
        númeroCiudadesHormigas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        volverMenu1eliminar = new javax.swing.JButton();
        mensajeEliminación1 = new javax.swing.JLabel();
        mensajeEliminación2 = new javax.swing.JLabel();

        jButton2.setText("Volver a menu");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/solid-dark-grey-gkwp0pxxcrd3lkaw.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elegirHormigasCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hormiga(s)", "Ciudad(es)" }));
        elegirHormigasCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirHormigasCiudadesActionPerformed(evt);
            }
        });
        getContentPane().add(elegirHormigasCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, -1));
        getContentPane().add(númeroCiudadesHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 23));

        jButton1.setText("Eliminar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        volverMenu1eliminar.setText("Volver a menu");
        volverMenu1eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenu1eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(volverMenu1eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        mensajeEliminación1.setText("Introduzca la cantidad de elementos que quiera eliminar");
        getContentPane().add(mensajeEliminación1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 20));
        getContentPane().add(mensajeEliminación2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elegirHormigasCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirHormigasCiudadesActionPerformed

    }//GEN-LAST:event_elegirHormigasCiudadesActionPerformed

    private void volverMenu1eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenu1eliminarActionPerformed
this.toBack();
setVisible(false); /**
 * @param false es para indicar que al devolverse en el programa, esta ventana "this" requiere irse.
 */
new GUI.Menu1AgregarEliminarCargarIniciar(GUI.Menu1AgregarEliminarCargarIniciar.grafo).setState(java.awt.Frame.NORMAL); //he agregado cada constructor con el grafo
/**
 * @param NORMAL en setState es para indicar que es la ventana referenciada es el estado "normal" de una aplicación.
 */
    }//GEN-LAST:event_volverMenu1eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaEliminar(vEliminar).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> elegirHormigasCiudades;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mensajeEliminación1;
    private javax.swing.JLabel mensajeEliminación2;
    private javax.swing.JTextField númeroCiudadesHormigas;
    private javax.swing.JButton volverMenu1eliminar;
    // End of variables declaration//GEN-END:variables
}
