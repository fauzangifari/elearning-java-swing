/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.UUID;

import controller.PenugasanController;
import controller.LoginController;
import controller.UserSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.*;

/**
 *
 * @author fauza
 */
public final class MenuDosen extends javax.swing.JFrame {
    int xx, xy;
    /**
         * Creates new form CreateAssignment
         */
    public MenuDosen() {
        initComponents();
        table();
        Database.connect();
        clear();
        labelUser();
    }

    public void labelUser(){
        LoginController loginController = LoginController.getInstance();
        String name = UserSession.getInstance().getUserName();
        JOptionPane.showMessageDialog(null, "Welcome back " + name);
    }
    
    void clear(){
        assignment.setText("");
        dateChooser.setText("");
        deskripsiField.setText("");
    }

    public void table(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Penugasan");
        table.addColumn("Deadline");
        table.addColumn("Title");
        table.addColumn("Deskripsi");
        table.addColumn("Kode Mata Kuliah");
        
        try {
            Statement statement = (Statement) Database.connect().createStatement();
            ResultSet resulset = statement.executeQuery("SELECT * FROM penugasan");
            
            while(resulset.next()){
                table.addRow(new Object[] {
                    resulset.getString("id_tugas"),
                    resulset.getString("deadline"),
                    resulset.getString("title"),
                    resulset.getString("deskripsi"),
                    resulset.getString("matakuliah_kode_matakuliah")
                });
                dataTable.setModel(table);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal! " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new com.raven.datechooser.DateChooser();
        deskripsiName = new javax.swing.JLabel();
        matakuliahName = new javax.swing.JLabel();
        namaTugasName = new javax.swing.JLabel();
        deadlineName = new javax.swing.JLabel();
        assignment = new javax.swing.JTextField();
        dateChooser = new javax.swing.JTextField();
        matakuliah = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        createTugasButton = new javax.swing.JButton();
        deleteTugasButton = new javax.swing.JButton();
        updateTugasButton = new javax.swing.JButton();
        showTugasButton = new javax.swing.JButton();
        closeButton = new javax.swing.JLabel();
        titleDashboard = new javax.swing.JLabel();
        dateButton = new javax.swing.JButton();
        backMenuButton = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsiField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        date.setDateFormat("yyyy-MM-dd");
        date.setTextRefernce(dateChooser);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deskripsiName.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        deskripsiName.setText("Deskripsi Tugas");
        getContentPane().add(deskripsiName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, 30));

        matakuliahName.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        matakuliahName.setText("Mata Kuliah");
        getContentPane().add(matakuliahName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 30));

        namaTugasName.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        namaTugasName.setText("Nama Tugas");
        getContentPane().add(namaTugasName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, 30));

        deadlineName.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        deadlineName.setText("Deadline");
        getContentPane().add(deadlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));
        getContentPane().add(assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 280, 30));

        dateChooser.setToolTipText("");
        dateChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateChooserActionPerformed(evt);
            }
        });
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 280, 30));
        dateChooser.setEditable(false);
        dateChooser.setFocusable(false);

        matakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Mata Kuliah", "Basis Data Lanjut", "Dasar Dasar Pengembangan Perangkat Lunak", "Desain dan Manajemen Jaringan Komputer", "Desain Basis Data", "Interaksi Manusia dan Komputer", "Manajemen Layanan IT", "Manajemen Proses Bisnis Pemrograman Berorientasi Objek", "Riset Operasi" }));
        getContentPane().add(matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 280, 30));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 880, 190));

        createTugasButton.setText("Buat Tugas");
        createTugasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTugasButtonMouseClicked(evt);
            }
        });
        createTugasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTugasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createTugasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 110, -1));

        deleteTugasButton.setText("Hapus Tugas");
        deleteTugasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTugasButtonMouseClicked(evt);
            }
        });
        getContentPane().add(deleteTugasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, -1));

        updateTugasButton.setText("Edit Tugas");
        updateTugasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateTugasButtonMouseClicked(evt);
            }
        });
        getContentPane().add(updateTugasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 110, -1));

        showTugasButton.setText("Tampilin Tugas");
        showTugasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showTugasButtonMouseClicked(evt);
            }
        });
        getContentPane().add(showTugasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/closeButton.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        titleDashboard.setFont(new java.awt.Font("Montserrat Medium", 0, 36)); // NOI18N
        titleDashboard.setForeground(new java.awt.Color(0, 155, 76));
        titleDashboard.setText("Dashboard Dosen");
        getContentPane().add(titleDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 40));

        dateButton.setText("...");
        dateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateButtonMouseClicked(evt);
            }
        });
        getContentPane().add(dateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 30, 30));

        backMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backtButton.png"))); // NOI18N
        backMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMenuButtonMouseClicked(evt);
            }
        });
        getContentPane().add(backMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        usernameLabel.setText("NAMA DOSEN");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 30));

        deskripsiField.setColumns(20);
        deskripsiField.setRows(5);
        jScrollPane2.setViewportView(deskripsiField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 320, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setText("Welcome back!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboardForm.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTugasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTugasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createTugasButtonActionPerformed

    private void createTugasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTugasButtonMouseClicked
        try {
            String kodeMatakuliah = PenugasanController.getIdMatakuliah(matakuliah.getSelectedItem().toString());
            String idPenugasan = "TGS-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase();
            String deadline = dateChooser.getText();
            LocalDate today = LocalDate.now();
            LocalDate deadlineDate = LocalDate.parse(deadline);

            if (deadlineDate.isBefore(today)) {
                JOptionPane.showMessageDialog(null, "Deadline tidak boleh hari ini atau di masa lalu!");
                return;
            }
            String titleTugas = assignment.getText();
            String deskripsi = deskripsiField.getText();

            if (kodeMatakuliah.isEmpty() || deadline.isEmpty() || titleTugas.isEmpty() || deskripsi.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            } else {
                PenugasanController.createTugasButton(idPenugasan, deadline, titleTugas, deskripsi, kodeMatakuliah);
                table();
                clear();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }

    }//GEN-LAST:event_createTugasButtonMouseClicked

    private void deleteTugasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTugasButtonMouseClicked
        try {
            int row = dataTable.getSelectedRow();
            if (row >= 0) {
                DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
                String idPenugasan = model.getValueAt(row, 0).toString();
                String kodeMatakuliah = model.getValueAt(row, 4).toString();

                PenugasanController.deleteTugasButton(idPenugasan, null, null, null, kodeMatakuliah);
                table();
                model.removeRow(row);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Please select a task to delete.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteTugasButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void dateChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserActionPerformed

    private void dateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateButtonMouseClicked
        date.showPopup();
    }//GEN-LAST:event_dateButtonMouseClicked

    private void showTugasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showTugasButtonMouseClicked
        table();
    }//GEN-LAST:event_showTugasButtonMouseClicked

    private void updateTugasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateTugasButtonMouseClicked
        try {
            int row = dataTable.getSelectedRow();
            if (row >= 0) {
                DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
                String idPenugasan = model.getValueAt(row, 0).toString();
                String kodeMatakuliah = model.getValueAt(row, 4).toString();
                String deadline = dateChooser.getText();
                String titleTugas = assignment.getText();
                String description = deskripsiField.getText();

                if (deadline.isEmpty() || titleTugas.isEmpty() || description.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                } else {
                    PenugasanController.updateTugasButton(idPenugasan, deadline, titleTugas, description, kodeMatakuliah);

                    model.setValueAt(deadline, row, 1);
                    model.setValueAt(titleTugas, row, 2);
                    model.setValueAt(description, row, 3);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Please select a task to update.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateTugasButtonMouseClicked

    private void backMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuButtonMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        UserSession.getInstance().clearSession();
        this.dispose();
    }//GEN-LAST:event_backMenuButtonMouseClicked

    /*
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuDosen penugasanForm = new MenuDosen();
                penugasanForm.setVisible(true);
                penugasanForm.pack();
                penugasanForm.setLocationRelativeTo(null);
                penugasanForm.setDefaultCloseOperation(MenuDosen.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assignment;
    private javax.swing.JLabel backMenuButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton createTugasButton;
    private javax.swing.JTable dataTable;
    private com.raven.datechooser.DateChooser date;
    private javax.swing.JButton dateButton;
    private javax.swing.JTextField dateChooser;
    private javax.swing.JLabel deadlineName;
    private javax.swing.JButton deleteTugasButton;
    private javax.swing.JTextArea deskripsiField;
    private javax.swing.JLabel deskripsiName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> matakuliah;
    private javax.swing.JLabel matakuliahName;
    private javax.swing.JLabel namaTugasName;
    private javax.swing.JButton showTugasButton;
    private javax.swing.JLabel titleDashboard;
    private javax.swing.JButton updateTugasButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
