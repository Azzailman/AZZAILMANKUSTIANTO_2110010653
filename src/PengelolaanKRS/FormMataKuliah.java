/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanKRS;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JInternalFrame;
import java.io.File;
import java.util.Optional;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author azzailman
 */
public class FormMataKuliah extends javax.swing.JFrame {

    
    private void kosongkan_form(){
    textidmatkul.setEditable(true);
    textidmatkul.setText(null);
    textmatkul.setText(null);
    combowaktu.setSelectedItem(this);
    textsemester.setText(null);
    textdosen.setText(null);
    }
     
     
     private void tampil_data(){
         
         DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. ");
        model.addColumn("ID Mata Kuliah");
        model.addColumn("Mata Kuliah");
        model.addColumn("Waktu");
        model.addColumn("Semester");
        model.addColumn("Nama Dosen");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM form_matakuliah";
            java.sql.Connection conn=(Connection)koneksidb.databaseDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tabelmatkul.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
     }

    /**
     * Creates new form FormMataKuliah
     */
    public FormMataKuliah() {
        initComponents();
        kosongkan_form();
        tampil_data();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textidmatkul = new javax.swing.JTextField();
        textmatkul = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelmatkul = new javax.swing.JTable();
        textdosen = new javax.swing.JTextField();
        textsemester = new javax.swing.JTextField();
        ButtonTambah = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        ButtonBatal = new javax.swing.JButton();
        ButtonKembali = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        combowaktu = new javax.swing.JComboBox<>();
        textcari = new javax.swing.JTextField();
        ButtonCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM MATA KULIAH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel2.setText("ID MATAKULIAH");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel3.setText("WAKTU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel4.setText("MATA KULIAH");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel5.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel5.setText("SEMESTER");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel6.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel6.setText("DOSEN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        jLabel8.setFont(new java.awt.Font("News701 BT", 0, 14)); // NOI18N
        jLabel8.setText("Ketik disni untuk mencari data Mata Kuliah");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));
        jPanel2.add(textidmatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 11, 160, -1));
        jPanel2.add(textmatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 49, 160, -1));

        tabelmatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelmatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmatkulMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelmatkul);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 560, 150));
        jPanel2.add(textdosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 163, 160, -1));
        jPanel2.add(textsemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 125, 160, -1));

        ButtonTambah.setText("TAMBAHKAN");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        ButtonEdit.setText("EDIT");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, -1));

        ButtonHapus.setText("HAPUS");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 93, -1));

        ButtonBatal.setText("BATAL");
        ButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 93, -1));

        ButtonKembali.setText("KEMBALI");
        ButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        ButtonExit.setText("EXIT");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 93, -1));

        combowaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Waktu ---", "08:00 - 09:30", "09:40 - 11:00", "13:00 - 14:30", "14:40 - 16:15", " ", " " }));
        jPanel2.add(combowaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, -1));

        textcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textcariKeyReleased(evt);
            }
        });
        jPanel2.add(textcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 240, -1));

        ButtonCetak.setText("CETAK");
        ButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCetakActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKembaliActionPerformed
        // TODO add your handling code here:
        PengelolaanKRSMenu var;
        var = new PengelolaanKRSMenu();
        var.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonKembaliActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE form_matakuliah SET id_matkul ='"+textidmatkul.getText()
                    +"',mata_kuliah='"+textmatkul.getText()
                    +"',waktu='"+combowaktu.getSelectedItem()
                    +"',semester='"+textsemester.getText()
                    +"',dosen='"+textdosen.getText()
                    +"' WHERE id_matkul= '"
                    +textidmatkul.getText()+"'";
            java.sql.Connection conn= (Connection)koneksidb.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Mata Kuliah Berhasil!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosongkan_form();
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO form_matakuliah VALUES ('"+textidmatkul.getText()+"','"+textmatkul.getText()+"','"+combowaktu.getSelectedItem()+"','"+textsemester.getText()+"','"+textdosen.getText()+"')";
            java.sql.Connection conn = (Connection)koneksidb.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Tambah Data Mata Kuliah Berhasil!");
            tampil_data();
            kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM form_matakuliah WHERE id_matkul='"+textidmatkul.getText()+"'";
            java.sql.Connection conn= (Connection)koneksidb.databaseDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Mata Kuliah Berhasil!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosongkan_form();
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_ButtonBatalActionPerformed

    private void textcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. ");
        model.addColumn("ID Mata Kuliah");
        model.addColumn("Mata Kuliah");
        model.addColumn("Waktu");
        model.addColumn("Semester");
        model.addColumn("Nama Dosen");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM form_matakuliah WHERE mata_kuliah LIKE '%"+textcari.getText()+"%'";
            java.sql.Connection conn=(Connection)koneksidb.databaseDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tabelmatkul.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_textcariKeyReleased

    private void tabelmatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelmatkulMouseClicked
        // TODO add your handling code here:
        int baris = tabelmatkul.rowAtPoint(evt.getPoint());
        
        String idmatkul = tabelmatkul.getValueAt(baris, 1).toString();
        textidmatkul.setText(idmatkul);
        
        String matkul = tabelmatkul.getValueAt(baris, 2).toString();
        textmatkul.setText(matkul);
        
        String waktu = tabelmatkul.getValueAt(baris, 3).toString();
        combowaktu.setSelectedItem(waktu);
        
        String semester = tabelmatkul.getValueAt(baris, 4).toString();
        textsemester.setText(semester);
        
        String dosen = tabelmatkul.getValueAt(baris, 5).toString();
        textdosen.setText(dosen);
    }//GEN-LAST:event_tabelmatkulMouseClicked

    private void ButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCetakActionPerformed
        // TODO add your handling code here:
        java.io.File namafile=new java.io.File("./reportmatakuliah.jasper");
        try{
            net.sf.jasperreports.engine.JasperReport jasper;
            jasper=(net.sf.jasperreports.engine.JasperReport)
            net.sf.jasperreports.engine.util.JRLoader.loadObject(namafile.getPath());
            net.sf.jasperreports.engine.JasperPrint jp;
            jp=net.sf.jasperreports.engine.JasperFillManager.fillReport(jasper, null, koneksidb.databaseDB());
            net.sf.jasperreports.view.JasperViewer.viewReport(jp, false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonCetakActionPerformed

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
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMataKuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBatal;
    private javax.swing.JButton ButtonCetak;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonKembali;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JComboBox<String> combowaktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelmatkul;
    private javax.swing.JTextField textcari;
    private javax.swing.JTextField textdosen;
    private javax.swing.JTextField textidmatkul;
    private javax.swing.JTextField textmatkul;
    private javax.swing.JTextField textsemester;
    // End of variables declaration//GEN-END:variables
}
