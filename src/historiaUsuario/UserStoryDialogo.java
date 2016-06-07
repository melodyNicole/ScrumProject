/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historiaUsuario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicole
 */
public class UserStoryDialogo extends javax.swing.JDialog {

    /**
     * Creates new form UserStoryDialogo
     */
    public UserStoryDialogo(java.awt.Frame parent, boolean modal) {
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

        boton_anadir = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        label_desc = new javax.swing.JLabel();
        label_criterio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_desc = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        text_criterio = new javax.swing.JTextArea();
        text_titulo = new javax.swing.JTextField();
        text_comp = new javax.swing.JComboBox<>();
        text_priori = new javax.swing.JComboBox<>();
        label_priori = new javax.swing.JLabel();
        label_comp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Historia de Usuario");

        boton_anadir.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        boton_anadir.setForeground(new java.awt.Color(0, 153, 153));
        boton_anadir.setText("Añadir");
        boton_anadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anadirActionPerformed(evt);
            }
        });

        label_titulo.setText("Titulo:");

        label_desc.setText("Descripcion:");

        label_criterio.setText("Criterios de Aceptacion: ");

        text_desc.setColumns(20);
        text_desc.setRows(5);
        text_desc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_desc.setCaretColor(new java.awt.Color(0, 153, 204));
        jScrollPane2.setViewportView(text_desc);

        text_criterio.setColumns(20);
        text_criterio.setRows(5);
        text_criterio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_criterio.setCaretColor(new java.awt.Color(0, 153, 204));
        jScrollPane3.setViewportView(text_criterio);

        text_titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_titulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_titulo.setCaretColor(new java.awt.Color(0, 153, 204));
        text_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tituloActionPerformed(evt);
            }
        });

        text_comp.setBackground(new java.awt.Color(204, 204, 204));
        text_comp.setMaximumRowCount(10);
        text_comp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        text_comp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_compActionPerformed(evt);
            }
        });

        text_priori.setBackground(new java.awt.Color(204, 204, 204));
        text_priori.setMaximumRowCount(10);
        text_priori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        text_priori.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_priori.setText("Prioridad:");

        label_comp.setText("Complejidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_criterio)
                                    .addComponent(label_desc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_priori)
                                            .addComponent(label_comp))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text_comp, 0, 45, Short.MAX_VALUE)
                                            .addComponent(text_priori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_titulo)
                                        .addGap(18, 18, 18)
                                        .addComponent(text_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(boton_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo)
                    .addComponent(text_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(label_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label_criterio)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_priori)
                    .addComponent(text_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_comp)
                    .addComponent(text_priori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(boton_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anadirActionPerformed
        try {
            ConsultasUserStory consulta = new ConsultasUserStory();
          int result =  consulta.guardarHistoria(new UserStory(text_titulo.getText(), text_desc.getText(), text_criterio.getText(), Integer.parseInt((String)text_comp.getSelectedItem()), Integer.parseInt((String)text_priori.getSelectedItem())));
           if(result==1)
                JOptionPane.showMessageDialog(this, "Historia Añadida");
                this.dispose();
                limpiarCampos();
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserStoryDialogo.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (SQLException ex) {
            Logger.getLogger(UserStoryDialogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_anadirActionPerformed

    private void text_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tituloActionPerformed

    private void text_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_compActionPerformed
     private void limpiarCampos()
     {
        text_titulo.setText("");
        text_desc.setText("");
        text_criterio.setText("");
      
       
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
            java.util.logging.Logger.getLogger(UserStoryDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserStoryDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserStoryDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserStoryDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserStoryDialogo dialog = new UserStoryDialogo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton boton_anadir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_comp;
    private javax.swing.JLabel label_criterio;
    private javax.swing.JLabel label_desc;
    private javax.swing.JLabel label_priori;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JComboBox<String> text_comp;
    private javax.swing.JTextArea text_criterio;
    private javax.swing.JTextArea text_desc;
    private javax.swing.JComboBox<String> text_priori;
    private javax.swing.JTextField text_titulo;
    // End of variables declaration//GEN-END:variables
}