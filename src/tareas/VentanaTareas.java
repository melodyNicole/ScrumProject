/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import historiaUsuario.ConsultasUserStory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sprint.ConsultasSprint;
import sprint.CrearSprintDialogo;

/**
 *
 * @author Nicole
 */
public class VentanaTareas extends javax.swing.JDialog {

    /**
     * Creates new form VentanaTareas
     */
    public VentanaTareas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        tareaButton = new javax.swing.JButton();
        scrollDescripText = new javax.swing.JScrollPane();
        descripcionText = new javax.swing.JTextArea();
        tituloText = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(531, 503));

        tituloLabel.setText("Titulo:");

        descripcionLabel.setText("Descripcion:");

        tareaButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tareaButton.setForeground(new java.awt.Color(0, 153, 153));
        tareaButton.setText("Crear");
        tareaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tareaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tareaButtonActionPerformed(evt);
            }
        });

        scrollDescripText.setMaximumSize(new java.awt.Dimension(32, 32767));

        descripcionText.setColumns(20);
        descripcionText.setRows(5);
        descripcionText.setMinimumSize(new java.awt.Dimension(10, 10));
        descripcionText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionTextKeyTyped(evt);
            }
        });
        scrollDescripText.setViewportView(descripcionText);

        tituloText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloTextActionPerformed(evt);
            }
        });
        tituloText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tituloTextKeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(getHistoriasdeUsuario()));

        jLabel1.setText("Historia de Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tareaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionLabel)
                            .addComponent(tituloLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloText)
                            .addComponent(scrollDescripText, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollDescripText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(tareaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tareaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tareaButtonActionPerformed
        Tarea tarea =new Tarea(tituloText.getText(),descripcionText.getText());
        try {
            ConsultaTareas guardarTarea=new ConsultaTareas();
            int result=guardarTarea.guardarTarea(tarea);
            if(result==1)
            JOptionPane.showMessageDialog(null," TareaCreada");
            this.dispose();
            limpiarCampos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaTareas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaTareas.class.getName()).log(Level.SEVERE, null, ex);
        }
                              

    }//GEN-LAST:event_tareaButtonActionPerformed

    private void descripcionTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionTextKeyTyped
        if( descripcionText.getText().length()==100)  evt.consume();
    }//GEN-LAST:event_descripcionTextKeyTyped

    private void tituloTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloTextActionPerformed

    private void tituloTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tituloTextKeyTyped
        if( tituloText.getText().length()==48)  evt.consume();
    }//GEN-LAST:event_tituloTextKeyTyped
    /* 
    private String[][] getHistoriasdeUsuario() throws ClassNotFoundException, SQLException
     {
         Lista 
         ConsultasUserStory consulta = new ConsultasUserStory();
         =consulta.ObtenerHistorias();
     }
    */
     private void limpiarCampos()
     {
        tituloText.setText("");
        descripcionText.setText("");
       
       
     }
    
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
            java.util.logging.Logger.getLogger(VentanaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaTareas dialog = new VentanaTareas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextArea descripcionText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollDescripText;
    private javax.swing.JButton tareaButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloText;
    // End of variables declaration//GEN-END:variables
}
