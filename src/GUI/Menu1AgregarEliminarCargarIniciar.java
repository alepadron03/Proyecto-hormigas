/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import GUI.Menu2IntroducirCiclosHormigas;

/**
 *
 * @author joseg
 */
public class Menu1AgregarEliminarCargarIniciar extends javax.swing.JFrame {
    
    public static Menu1AgregarEliminarCargarIniciar vMenu1;
    /**
     * Creates new form menuAgregarEliminarCargarIniciar
     */
    public Menu1AgregarEliminarCargarIniciar() {
        initComponents(); 
        this.vMenu1=vMenu1;
        this.setVisible(true); //para que se vea
        
        /*
        this.dispose para borrar una vista
        
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        tituloMenu1 = new javax.swing.JLabel();
        cargarGrafomenu1 = new javax.swing.JButton();
        iniciarSimulaciónmenu1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        eliminarElementosmenu1 = new javax.swing.JButton();
        agregarElementosmenu1 = new javax.swing.JButton();
        verGrafomenu1 = new javax.swing.JButton();
        SalirMenu1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 26, -1, -1));

        tituloMenu1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloMenu1.setText("Simulación de Hormigas");
        getContentPane().add(tituloMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        cargarGrafomenu1.setText("Cargar Grafo");
        cargarGrafomenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarGrafomenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(cargarGrafomenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 140, -1));

        iniciarSimulaciónmenu1.setText("Iniciar simulación");
        iniciarSimulaciónmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSimulaciónmenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSimulaciónmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, 140, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 89, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarElementosmenu1.setText("Eliminar elementos");
        eliminarElementosmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarElementosmenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarElementosmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));

        agregarElementosmenu1.setText("Agregar elementos");
        agregarElementosmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarElementosmenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(agregarElementosmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));

        verGrafomenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/verGrafo1.png"))); // NOI18N
        verGrafomenu1.setText("Ver grafo");
        verGrafomenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGrafomenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(verGrafomenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 140, 210));

        SalirMenu1.setText("Salir");
        SalirMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(SalirMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ANT CARD sunset.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 560, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarGrafomenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarGrafomenu1ActionPerformed
ventanaCargararchivo vCargararchivo=new ventanaCargararchivo(this);
vCargararchivo.setVisible(true);
this.toFront();
    }//GEN-LAST:event_cargarGrafomenu1ActionPerformed

    private void iniciarSimulaciónmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSimulaciónmenu1ActionPerformed
Menu2IntroducirCiclosHormigas vMenu2=new Menu2IntroducirCiclosHormigas(this);
vMenu2.setVisible(true); //hola
this.toFront();
    }//GEN-LAST:event_iniciarSimulaciónmenu1ActionPerformed

    private void verGrafomenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGrafomenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verGrafomenu1ActionPerformed

    private void agregarElementosmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarElementosmenu1ActionPerformed
        ventanaAgregar vAgregar=new ventanaAgregar(this);
        vAgregar.setVisible(true);
        
       getContentPane().add(this);
        this.toFront();
    }//GEN-LAST:event_agregarElementosmenu1ActionPerformed

    private void eliminarElementosmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarElementosmenu1ActionPerformed
    
    ventanaEliminar vEliminar=new ventanaEliminar(this);
    vEliminar.setVisible(true);
    this.toFront();
    }//GEN-LAST:event_eliminarElementosmenu1ActionPerformed

    private void SalirMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenu1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1AgregarEliminarCargarIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1AgregarEliminarCargarIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1AgregarEliminarCargarIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1AgregarEliminarCargarIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1AgregarEliminarCargarIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirMenu1;
    private javax.swing.JButton agregarElementosmenu1;
    private javax.swing.JButton cargarGrafomenu1;
    private javax.swing.JButton eliminarElementosmenu1;
    private javax.swing.JButton iniciarSimulaciónmenu1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloMenu1;
    private javax.swing.JButton verGrafomenu1;
    // End of variables declaration//GEN-END:variables
}
