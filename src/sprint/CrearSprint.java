/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicole
 */
public class CrearSprint extends javax.swing.JPanel {

    /**
     * Creates new form CrearSprint
     */
    public CrearSprint() {
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

        SprintLabel = new javax.swing.JLabel();
        FechaInicioLabel = new javax.swing.JLabel();
        FechaFinLabel = new javax.swing.JLabel();
        NombreSprintLabel = new javax.swing.JLabel();
        NombreSprintTexto = new javax.swing.JTextField();
        CrearBoton = new javax.swing.JButton();
        FechaInicioJDate = new org.jdesktop.swingx.JXDatePicker();
        FechaFinJDate = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(204, 204, 204));

        SprintLabel.setText("Sprint");

        FechaInicioLabel.setText("Fecha Inicio");

        FechaFinLabel.setText("Fecha Fin");

        NombreSprintLabel.setText("Nombre:");

        CrearBoton.setText("Crear");
        CrearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SprintLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NombreSprintLabel)
                        .addGap(44, 44, 44)
                        .addComponent(NombreSprintTexto)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FechaInicioJDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearBoton))
                    .addComponent(FechaInicioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaFinLabel)
                    .addComponent(FechaFinJDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SprintLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreSprintLabel)
                    .addComponent(NombreSprintTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearBoton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaInicioLabel)
                            .addComponent(FechaFinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaInicioJDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaFinJDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBotonActionPerformed
       try {
            ConsultasSprint consulta = new ConsultasSprint();
            consulta.guardarSprint(new Sprint(NombreSprintTexto.getText(),FechaInicioJDate.getDate(),FechaFinJDate.getDate()));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearSprint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearSprint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearBoton;
    private org.jdesktop.swingx.JXDatePicker FechaFinJDate;
    private javax.swing.JLabel FechaFinLabel;
    private org.jdesktop.swingx.JXDatePicker FechaInicioJDate;
    private javax.swing.JLabel FechaInicioLabel;
    private javax.swing.JLabel NombreSprintLabel;
    private javax.swing.JTextField NombreSprintTexto;
    private javax.swing.JLabel SprintLabel;
    // End of variables declaration//GEN-END:variables
}
