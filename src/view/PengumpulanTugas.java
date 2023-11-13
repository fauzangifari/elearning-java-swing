/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MatakuliahController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Database;

/**
 *
 * @author fauza
 */
public final class PengumpulanTugas extends javax.swing.JFrame {

    /**
     * Creates new form Penugasan
     */
    public PengumpulanTugas() {
        initComponents();
        Database.connect();
    }

    public void table() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Pengumpulan");
        table.addColumn("Lampiran");
        table.addColumn("Tanggal Pengumpulan");
        table.addColumn("Status");
        table.addColumn("NIM Mahasiswa");
        table.addColumn("ID Penugasan");

        try {
            String selectedMatakuliah = matakuliahChoose.getSelectedItem().toString();
            String kodeMatakuliah = MatakuliahController.getKodeMatakuliah(selectedMatakuliah);

            if (!kodeMatakuliah.isEmpty()) {
                PreparedStatement preparedStatement = Database.connect().prepareStatement("SELECT pt.*\n" +
                    "FROM pengumpulan_tugas pt\n" +
                    "JOIN penugasan p ON pt.penugasan_id_tugas = p.id_tugas\n" +
                    "WHERE p.matakuliah_kode_matakuliah = ?");
                preparedStatement.setString(1, kodeMatakuliah);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    table.addRow(new Object[]{
                            resultSet.getString("id_pengumpulan"),
                            resultSet.getString("lampiran"),
                            resultSet.getString("tanggal_pengumpulan"),
                            resultSet.getString("status"),
                            resultSet.getString("mahasiswa_nim"),
                            resultSet.getString("penugasan_id_tugas"),
                    });
                }
                dataTable.setModel(table);
            } else {
                JOptionPane.showMessageDialog(null, "Kode matakuliah tidak ditemukan.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal! " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backMenuButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        matakuliahChoose = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        closeButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        dataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 880, 300));

        matakuliahChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Mata Kuliah", "Basis Data Lanjut", "Dasar Dasar Pengembangan Perangkat Lunak", "Desain dan Manajemen Jaringan Komputer", "Desain Basis Data", "Interaksi Manusia dan Komputer", "Manajemen Layanan IT", "Manajemen Proses Bisnis Pemrograman Berorientasi Objek", "Riset Operasi" }));
        getContentPane().add(matakuliahChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 30));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 30));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/closeButton.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboardForm.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuButtonMouseClicked
        MenuDosen menuDosen = new MenuDosen();
        menuDosen.setVisible(true);
        menuDosen.pack();
        menuDosen.setLocationRelativeTo(null);
        menuDosen.setDefaultCloseOperation(MenuDosen.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backMenuButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(PengumpulanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengumpulanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengumpulanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengumpulanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengumpulanTugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backMenuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> matakuliahChoose;
    // End of variables declaration//GEN-END:variables
}
