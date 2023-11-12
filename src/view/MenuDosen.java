/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserSession;
import javax.swing.JOptionPane;

/**
 *
 * @author fauza
 */
public final class MenuDosen extends javax.swing.JFrame {

    /**
     * Creates new form MenuDosen
     */
    public MenuDosen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backMenuButton = new javax.swing.JLabel();
        pengumpulanTugasButton = new javax.swing.JLabel();
        penugasanButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backtButton.png"))); // NOI18N
        backMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMenuButtonMouseClicked(evt);
            }
        });
        getContentPane().add(backMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        pengumpulanTugasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/assignmentButton.png"))); // NOI18N
        pengumpulanTugasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengumpulanTugasButtonMouseClicked(evt);
            }
        });
        getContentPane().add(pengumpulanTugasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        penugasanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/examButton.png"))); // NOI18N
        penugasanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penugasanButtonMouseClicked(evt);
            }
        });
        getContentPane().add(penugasanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setText("Buat Penugasan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Lihat Tugas Mahasiswa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboardForm.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuButtonMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        UserSession.getInstance().clearSession();
        this.dispose();
    }//GEN-LAST:event_backMenuButtonMouseClicked

    private void penugasanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penugasanButtonMouseClicked
        Penugasan penugasan = new Penugasan();
        penugasan.setVisible(true);
        penugasan.pack();
        penugasan.setLocationRelativeTo(null);
        penugasan.setDefaultCloseOperation(Penugasan.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_penugasanButtonMouseClicked

    private void pengumpulanTugasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengumpulanTugasButtonMouseClicked
        PengumpulanTugas pengumpulanTugas = new PengumpulanTugas();
        pengumpulanTugas.setVisible(true);
        pengumpulanTugas.pack();
        pengumpulanTugas.setLocationRelativeTo(null);
        pengumpulanTugas.setDefaultCloseOperation(PengumpulanTugas.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pengumpulanTugasButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backMenuButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pengumpulanTugasButton;
    private javax.swing.JLabel penugasanButton;
    // End of variables declaration//GEN-END:variables
}
