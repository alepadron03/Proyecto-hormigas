/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.Locale;

/**
 *
 * @author joseg
 */
public class Menu2IntroducirCiclosHormigas extends javax.swing.JFrame {
    public static Menu1AgregarEliminarCargarIniciar m1;
    
    /**
     * Creates new form Menu2IntroducirCiclosHormigas
     */
    public Menu2IntroducirCiclosHormigas(Menu1AgregarEliminarCargarIniciar m1) {
        initComponents();
        this.m1=m1;
        m1.setVisible(false);
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

        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        iniciarSimulación = new javax.swing.JButton();
        cargarGrafo = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Agregar1 = new javax.swing.JButton();
        iniciarSimulación1 = new javax.swing.JButton();
        cargarGrafo1 = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volvermenu1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Una vez que se llenen los parametros obligatorios, aparecerá el botón \"INICIAR VIAJE\"");

        jLabel8.setText("Son opcionales: Por default las variables son α=1  y ß=2");

        Agregar.setText("Introducir número de ciclos");

        iniciarSimulación.setText("Introducir número de hormigas");
        iniciarSimulación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSimulaciónActionPerformed(evt);
            }
        });

        cargarGrafo.setText("Entrar parametro de Importancia α");
        cargarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarGrafoActionPerformed(evt);
            }
        });

        Eliminar.setText("Entrar parametro de visibilidad ß");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Parametros opcionales");

        jLabel5.setText("Parametros obligatorios");

        jLabel4.setText("Antes de iniciar la simulación, es necesario introducir parametros. ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Valores de simulación");

        jButton2.setText("Volver a menu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("No debe apretar el botón \"INICIAR VIAJE\" sino hasya haber llenado los parametros opcionales");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, 10));

        jLabel11.setText("Son opcionales: Por default las variables son α=1  y ß=2");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        Agregar1.setText("Introducir número de ciclos");
        getContentPane().add(Agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        iniciarSimulación1.setText("Introducir número de hormigas");
        iniciarSimulación1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSimulación1ActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSimulación1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cargarGrafo1.setText("Entrar parametro de Importancia α");
        cargarGrafo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarGrafo1ActionPerformed(evt);
            }
        });
        getContentPane().add(cargarGrafo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 220, -1));

        Eliminar1.setText("Entrar parametro de visibilidad ß");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel7.setText("Parametros opcionales");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel12.setText("Parametros obligatorios");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel13.setText("Antes de iniciar la simulación, es necesario introducir parametros. ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 430, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Valores de simulación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        Volvermenu1.setText("Volver a menú");
        Volvermenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volvermenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(Volvermenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jButton1.setText("Iniciar viaje");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/solid-dark-grey-gkwp0pxxcrd3lkaw.jpg"))); // NOI18N
        jLabel14.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 650, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSimulaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSimulaciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSimulaciónActionPerformed

    private void cargarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarGrafoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void iniciarSimulación1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSimulación1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSimulación1ActionPerformed

    private void cargarGrafo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarGrafo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarGrafo1ActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void Volvermenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volvermenu1ActionPerformed
        this.setVisible(false);
        m1.setVisible(true);
        
    }//GEN-LAST:event_Volvermenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2IntroducirCiclosHormigas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2IntroducirCiclosHormigas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2IntroducirCiclosHormigas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2IntroducirCiclosHormigas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2IntroducirCiclosHormigas(m1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Agregar1;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JButton Volvermenu1;
    private javax.swing.JButton cargarGrafo;
    private javax.swing.JButton cargarGrafo1;
    private javax.swing.JButton iniciarSimulación;
    private javax.swing.JButton iniciarSimulación1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
