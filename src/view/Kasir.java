/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.datacontrollkasir;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class Kasir extends javax.swing.JFrame {

    /**
     * Creates new form Kasir
     */
    datacontrollkasir ks;
    public Kasir() {
        initComponents();
        ks = new datacontrollkasir(this); 
        ks.isitabel();
        DefaultTableModel model;
        getContentPane().setBackground(Color.blue);
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
        tabelbarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelcart = new javax.swing.JTable();
        addbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jformbarang = new javax.swing.JTextField();
        jformid = new javax.swing.JTextField();
        jformkuantitas = new javax.swing.JTextField();
        jformharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        subtotaltxt = new javax.swing.JTextField();
        deletebutton = new javax.swing.JButton();
        stt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jformstock = new javax.swing.JTextField();
        cobutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jformuang = new javax.swing.JTextField();
        kembaliantxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        clearall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelbarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbarang);

        tabelcart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Barang", "Harga", "Jumlah", "Total", "Stock"
            }
        ));
        tabelcart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelcartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelcart);

        addbutton.setBackground(new java.awt.Color(255, 255, 0));
        addbutton.setText("Add");
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
        });
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Barang");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Satuan");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kuantitas");

        jformbarang.setEditable(false);
        jformbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformbarangActionPerformed(evt);
            }
        });

        jformid.setEditable(false);
        jformid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformidActionPerformed(evt);
            }
        });

        jformkuantitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformkuantitasActionPerformed(evt);
            }
        });

        jformharga.setEditable(false);
        jformharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformhargaActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SubTotal : Rp");

        subtotaltxt.setEditable(false);
        subtotaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotaltxtActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(255, 255, 0));
        deletebutton.setText("Delete");
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        stt.setEditable(false);
        stt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sttActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selected : Rp");

        btnHome.setBackground(new java.awt.Color(255, 255, 0));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Stock");

        jformstock.setEditable(false);
        jformstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformstockActionPerformed(evt);
            }
        });

        cobutton.setBackground(new java.awt.Color(255, 255, 0));
        cobutton.setText("Check Out");
        cobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobuttonActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Uang : Rp");

        kembaliantxt.setEditable(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kembalian : Rp");

        clearall.setBackground(new java.awt.Color(255, 255, 0));
        clearall.setText("Clear");
        clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jformuang, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kembaliantxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deletebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jformkuantitas))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jformstock)
                                        .addComponent(jformid, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jformbarang)
                                        .addComponent(jformharga))))
                            .addComponent(clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jformid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jformbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jformharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jformstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jformkuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cobutton)
                            .addComponent(btnHome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearall)))
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(subtotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jformuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(kembaliantxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model;
        int idbar = Integer.parseInt(jformid.getText());
        String tname = (jformbarang.getText());
        int tharga = Integer.parseInt(jformharga.getText());
        int quan = Integer.parseInt(jformkuantitas.getText());
        int stck = Integer.parseInt(jformstock.getText());
        int total = tharga*quan;
        model = (DefaultTableModel)tabelcart.getModel();
        if(quan>stck){
        JOptionPane.showMessageDialog(this, "Stock Barang Kurang / Habis!");
        }else{
        model.addRow(new Object[]{idbar,tname,tharga,quan,total,stck});
        int subtotal = 0;
        for(int i = 0; i<tabelcart.getRowCount();i++){
        subtotal = subtotal + Integer.parseInt(tabelcart.getValueAt(i, 4).toString());}
        subtotaltxt.setText(Integer.toString(subtotal));
        jformkuantitas.setText("");
        jformid.setText("");
        jformbarang.setText("");
        jformharga.setText("");
        jformstock.setText("");
        }
        ks.isitabel();
        
    }//GEN-LAST:event_addbuttonActionPerformed

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked
        // TODO add your handling code here:
        //i cannot delete this help
    }//GEN-LAST:event_addbuttonMouseClicked

    private void jformbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformbarangActionPerformed

    private void jformkuantitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformkuantitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformkuantitasActionPerformed

    private void jformhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformhargaActionPerformed

    private void jformidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformidActionPerformed

    private void tabelbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangMouseClicked
        // TODO add your handling code here:
       int baris = tabelbarang.getSelectedRow();
       jformid.setText(tabelbarang.getValueAt(baris, 0).toString());
       jformbarang.setText(tabelbarang.getValueAt(baris, 1).toString());
       jformharga.setText(tabelbarang.getValueAt(baris, 2).toString());
       jformstock.setText(tabelbarang.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tabelbarangMouseClicked

    private void subtotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotaltxtActionPerformed

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        DefaultTableModel model;
        model = (DefaultTableModel)tabelcart.getModel();
        int subtotal = Integer.parseInt(subtotaltxt.getText());
        int deletetotal = Integer.parseInt(stt.getText());
        int subfinal = subtotal-deletetotal;
        String subfinalstr = Integer.toString(subfinal);
        subtotaltxt.setText(subfinalstr);
        stt.setText("");
        //delete
        if(tabelcart.getSelectedRowCount()==1){
        model.removeRow(tabelcart.getSelectedRow());
        }
        else if(tabelcart.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Cart Kosong!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Pilih 1 barang untuk dihapus!");
        }
        
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void sttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sttActionPerformed

    private void tabelcartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelcartMouseClicked
        // TODO add your handling code here:
        int baris = tabelcart.getSelectedRow();
        stt.setText(tabelcart.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tabelcartMouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        HomeView hv = new HomeView();
        hv.setVisible(true);
        this.dispose();
        hv.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jformstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformstockActionPerformed

    private void cobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobuttonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model;
         model = (DefaultTableModel)tabelcart.getModel();
         int total = Integer.parseInt(subtotaltxt.getText());
         int uang = Integer.parseInt(jformuang.getText());
         if(total>uang){
         JOptionPane.showMessageDialog(this, "Uang kurang!");
         }
         else{
         JOptionPane.showMessageDialog(this, "Transaksi Berhasil!");
         for(int i = 0; i<tabelcart.getRowCount();i++){
         int qty = Integer.parseInt(tabelcart.getValueAt(i, 3).toString());
         int ids = Integer.parseInt(tabelcart.getValueAt(i, 0).toString());
         int stcks = Integer.parseInt(tabelcart.getValueAt(i, 5).toString());
         int price = Integer.parseInt(tabelcart.getValueAt(i, 2).toString());
         int ttl = Integer.parseInt(tabelcart.getValueAt(i, 4).toString());
         stcks = stcks-qty;
         jformid.setText(Integer.toString(ids));
         jformstock.setText(Integer.toString(stcks));
         jformkuantitas.setText(Integer.toString(qty));
         jformbarang.setText(tabelcart.getValueAt(i, 1).toString());
         jformharga.setText(Integer.toString(price));
         stt.setText(Integer.toString(ttl));
         ks.penjualan();
         ks.updatestock();
         jformbarang.setText("");
         jformharga.setText("");
         jformkuantitas.setText("");
         jformid.setText("");
         jformstock.setText("");
         subtotaltxt.setText("");
         jformuang.setText("");
         stt.setText("");
         int kembalian = uang-total;
         kembaliantxt.setText(Integer.toString(kembalian));
         }
         model.setRowCount(0);
         ks.isitabel();
         }
    }//GEN-LAST:event_cobuttonActionPerformed

    private void clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearallActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model;
         model = (DefaultTableModel)tabelcart.getModel();
         jformbarang.setText("");
         jformkuantitas.setText("");
         jformid.setText("");
         jformstock.setText("");
         subtotaltxt.setText("");
         jformuang.setText("");
         model.setRowCount(0);
    }//GEN-LAST:event_clearallActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton clearall;
    private javax.swing.JButton cobutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jformbarang;
    private javax.swing.JTextField jformharga;
    private javax.swing.JTextField jformid;
    private javax.swing.JTextField jformkuantitas;
    private javax.swing.JTextField jformstock;
    private javax.swing.JTextField jformuang;
    private javax.swing.JTextField kembaliantxt;
    private javax.swing.JTextField stt;
    private javax.swing.JTextField subtotaltxt;
    private javax.swing.JTable tabelbarang;
    private javax.swing.JTable tabelcart;
    // End of variables declaration//GEN-END:variables
                
    public JTable getTabelDataBarang() {
        return tabelbarang;
    }

    public void setTabelDataBarang(JTable tabelbarang) {
        this.tabelbarang = tabelbarang;
    }

    public JTextField getJformbarang() {
        return jformbarang;
    }

    public void setJformbarang(JTextField jformbarang) {
        this.jformbarang = jformbarang;
    }

    public JTextField getJformharga() {
        return jformharga;
    }

    public void setJformharga(JTextField jformharga) {
        this.jformharga = jformharga;
    }

    public JTextField getJformid() {
        return jformid;
    }

    public void setJformid(JTextField jformid) {
        this.jformid = jformid;
    }

    public JTextField getJformkuantitas() {
        return jformkuantitas;
    }

    public void setJformkuantitas(JTextField jformkuantitas) {
        this.jformkuantitas = jformkuantitas;
    }

    public JTextField getJformstock() {
        return jformstock;
    }

    public void setJformstock(JTextField jformstock) {
        this.jformstock = jformstock;
    }

    public JTextField getStt() {
        return stt;
    }

    public void setStt(JTextField stt) {
        this.stt = stt;
    }
    
}
