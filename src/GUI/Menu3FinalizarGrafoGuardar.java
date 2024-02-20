/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author joseg
 */
public class Menu3FinalizarGrafoGuardar extends javax.swing.JFrame {

    /**
     * Creates new form Menu3FinalizarGrafoGuardar
     */
    public Menu3FinalizarGrafoGuardar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verGrafo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        verValordecadacaminomenu3 = new javax.swing.JButton();
        volverMenu1menu3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        verGradomenu3 = new javax.swing.JButton();
        escogerHormigaoptimomenu3 = new javax.swing.JSpinner();
        verHormigaoptimamenu3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        verGrafo.setText("Ver grafo");
        verGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGrafoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Recorrido óptimo hormiga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 170, -1));

        verValordecadacaminomenu3.setText("Valor de cada camino");
        getContentPane().add(verValordecadacaminomenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        volverMenu1menu3.setText("Volver a menu");
        getContentPane().add(volverMenu1menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verGradomenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/verGrafo1.png"))); // NOI18N
        verGradomenu3.setText("Ver grafo");
        verGradomenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGradomenu3ActionPerformed(evt);
            }
        });
        jPanel1.add(verGradomenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 140, 210));
        jPanel1.add(escogerHormigaoptimomenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        verHormigaoptimamenu3.setText("Ver");
        jPanel1.add(verHormigaoptimamenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 64, -1));

        jLabel1.setText("Para estadísticas, oprimir botón de la estadística y posteriori \"ver grafo\".");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 450, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("En el grafo, el camino más óptimo de todos esta resaltado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 380, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Resultados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 620, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verGrafoActionPerformed

    private void verGradomenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGradomenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verGradomenu3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu3FinalizarGrafoGuardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu3FinalizarGrafoGuardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu3FinalizarGrafoGuardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu3FinalizarGrafoGuardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu3FinalizarGrafoGuardar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner escogerHormigaoptimomenu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verGradomenu3;
    private javax.swing.JButton verGrafo;
    private javax.swing.JButton verHormigaoptimamenu3;
    private javax.swing.JButton verValordecadacaminomenu3;
    private javax.swing.JButton volverMenu1menu3;
    // End of variables declaration//GEN-END:variables
}