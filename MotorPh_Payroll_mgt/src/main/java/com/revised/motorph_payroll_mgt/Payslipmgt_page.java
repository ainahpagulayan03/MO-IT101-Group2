/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.revised.motorph_payroll_mgt;

import java.awt.Font;

/**
 *
 * @author rashni alicando
 */
public class Payslipmgt_page extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Payslipmgt_page() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 38, 36));
        setForeground(new java.awt.Color(35, 38, 36));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1470, 850));
        setResizable(false);
        setSize(new java.awt.Dimension(1470, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 74, 134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MotorPH100.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MOTORPH");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empicon.1.png"))); // NOI18N
        jLabel3.setText("Employee Management");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\calculator-icon-4.1.png")); // NOI18N
        jLabel4.setText("Payroll Calculator");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\Payslip.png")); // NOI18N
        jLabel5.setText("Payslip Management");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PAYROLL MANAGEMENT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 104, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hi USER!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 126, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jLabel8.setText("Log Out");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 800, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1170, 850));
        jPanel2.setMinimumSize(new java.awt.Dimension(1170, 850));
        jPanel2.setPreferredSize(new java.awt.Dimension(1170, 850));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("x");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 14, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("-");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 0, 15, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 51, 93));
        jLabel9.setText("Payslip Management");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 37, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel10.setText("Payroll Summary Report");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel11.setText("Total:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 80, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel14.setText("Gross Income");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel15.setText("Social Security Contribution");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel16.setText("Philhealth Contribution");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel18.setText("Pag-ibig Contribution");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel19.setText("Tax Contribution");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel20.setText("Net Pay");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 710, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 100, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, 100, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, 100, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 90, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 90, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel25.setText("jLabel25");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 710, 90, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete Record");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\search_icon.png")); // NOI18N
        jButton2.setText("Search");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 230, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\OIP.png")); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1170, 860));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // app exit
        
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Go to Pay Calculator
        
        this.dispose();
        payrollcalculator_page1 calculator = new payrollcalculator_page1();
        calculator.setVisible(true);
        calculator.setlocationRelativeto(null);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // Go to empmgt_page
        this.dispose(); // close window
        empmgt_page admin = new empmgt_page(); 
        admin.setVisible(true);
        admin.setlocationRelativeto(null);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\calculator-icon-4.png"));
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\calculator-icon-4.1.png"));
        
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
         jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
         jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\empicon.png"));
         
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
         jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14));
         jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rashni alicand\\Desktop\\Rash Tools\\empicon.1.png"));
         
    }//GEN-LAST:event_jLabel3MouseExited

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
            java.util.logging.Logger.getLogger(Payslipmgt_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payslipmgt_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payslipmgt_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payslipmgt_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payslipmgt_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    void setlocationRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}