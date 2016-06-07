package scrumproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import login.DialogoLogin;

import sprint.CrearSprintDialogo;
import historiaUsuario.ListaUserStory;
import historiaUsuario.UserStoryDialogo;
import tareas.VentanaTareas;

/**
 *
 * @author Nicole
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {

        super();
        initComponents();
        login = new DialogoLogin(this, true);
        login.setVisible(true);
        userStory = new UserStoryDialogo(this, true);
        sprint = new CrearSprintDialogo(this, true);
        listahistorias = new ListaUserStory(this, true);
        tareas = new VentanaTareas(this, true);
        tareas.setLocationRelativeTo(this);
        userStory.setVisible(false);
        sprint.setVisible(false);
        listahistorias.setVisible(false);
        tareas.setVisible(false);

        login.aniadirControladorBoton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(login);
                jMenuBar1.setVisible(true);
                pack();
                repaint();

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        tareasMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scrum Proyect");
        setAlwaysOnTop(isOpaque());
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(200, 200, 200));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\scrum-gico04.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Scrum Project");

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 102, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\icon-menu-hover.png")); // NOI18N

        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setForeground(new java.awt.Color(102, 102, 102));
        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenu3.setText("Historias de Usuario");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenuItem2.setText("Crear Historia");
        jMenuItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenuItem3.setText("Ver Historias");
        jMenuItem3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setForeground(new java.awt.Color(102, 102, 102));
        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenu4.setText("Sprints");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenuItem1.setText("Crear Sprint");
        jMenuItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenu1.add(jMenu4);

        tareasMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tareasMenu.setForeground(new java.awt.Color(102, 102, 102));
        tareasMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        tareasMenu.setText("Tareas");
        tareasMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicole\\Documents\\NetBeansProjects\\ScrumProject\\imagenes\\asd-scrum.png")); // NOI18N
        jMenuItem5.setText("Crear Tarea");
        jMenuItem5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        tareasMenu.add(jMenuItem5);

        jMenu1.add(tareasMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(579, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        sprint.setVisible(true);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        sprint.setVisible(true);
        userStory.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        userStory.setVisible(true);
        sprint.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        listahistorias.setVisible(true);
        userStory.setVisible(false);
        sprint.setVisible(false);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        listahistorias.setVisible(false);
        userStory.setVisible(false);
        sprint.setVisible(false);
        tareas.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setLocationRelativeTo(null);
                ventana.pack();
                ventana.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu tareasMenu;
    // End of variables declaration//GEN-END:variables
    private DialogoLogin login;
    private UserStoryDialogo userStory;
    private ListaUserStory listahistorias;
    private CrearSprintDialogo sprint;
    private VentanaTareas tareas;

}
