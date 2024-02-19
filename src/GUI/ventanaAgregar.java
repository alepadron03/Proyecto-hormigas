/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author joseg
 */
public class ventanaAgregar extends javax.swing.JFrame {
    
    public static Menu1AgregarEliminarCargarIniciar vAgregar;

    /**
     * Creates new form ventanaAgregar
     */
    public ventanaAgregar(Menu1AgregarEliminarCargarIniciar vAgregar) {
        initComponents();
        this.vAgregar=vAgregar;
        vAgregar.setVisible(false);
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

        elegirHormigasCiudades = new javax.swing.JComboBox<>();
        númeroCiudadesHormigas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        volverMenu1agregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elegirHormigasCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hormiga(s)", "Ciudad(es)" }));
        elegirHormigasCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirHormigasCiudadesActionPerformed(evt);
            }
        });
        getContentPane().add(elegirHormigasCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, -1));
        getContentPane().add(númeroCiudadesHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, 23));

        jButton1.setText("Agregar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nMínimo 4 elementos pueden ser añadidos, máximo 20.\nInserte en la caja el número deseado de elementos.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 90));

        volverMenu1agregar.setText("Volver a menu");
        volverMenu1agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenu1agregarActionPerformed(evt);
            }
        });
        getContentPane().add(volverMenu1agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 480, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elegirHormigasCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirHormigasCiudadesActionPerformed

    }//GEN-LAST:event_elegirHormigasCiudadesActionPerformed

    private void volverMenu1agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenu1agregarActionPerformed
this.toBack();
setVisible(false); /**
 * @param false es para indicar que al devolverse en el programa, esta ventana "this" requiere irse.
 */
new GUI.Menu1AgregarEliminarCargarIniciar().setState(java.awt.Frame.NORMAL);
/**
 * @param NORMAL en setState es para indicar que es la ventana referenciada es el estado "normal" de una aplicación.
 */
    }//GEN-LAST:event_volverMenu1agregarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAgregar(vAgregar).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> elegirHormigasCiudades;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField númeroCiudadesHormigas;
    private javax.swing.JButton volverMenu1agregar;
    // End of variables declaration//GEN-END:variables
}
