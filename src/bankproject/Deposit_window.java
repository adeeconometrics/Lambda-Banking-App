/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

import bankproject.Accounts.SavingsAccount;
import bankproject.Accounts.receiptInfo;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author A.A. Yapan
 */
public class Deposit_window extends javax.swing.JFrame {

    /**
     * Creates new form Profile_window
     */
    
    private static String username;
    private static String password;
    
    public Deposit_window(String x, String y) {
        username = x;
        password = y;
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

        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Exit_button = new javax.swing.JLabel();
        value_Decimal = new javax.swing.JTextField();
        value_Actual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit_Button = new javax.swing.JLabel();

        jButton2.setText("jButton1");

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton12.setText("jButton1");

        jButton13.setText("jButton1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 169, 80));
        jLabel3.setText("P");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 169, 80));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(22, 27, 33));

        Exit_button.setForeground(new java.awt.Color(240, 240, 240));
        Exit_button.setText("X");
        Exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseExited(evt);
            }
        });

        value_Decimal.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        value_Decimal.setForeground(new java.awt.Color(244, 169, 80));
        value_Decimal.setText("00");
        value_Decimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                value_DecimalMouseClicked(evt);
            }
        });
        value_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_DecimalActionPerformed(evt);
            }
        });

        value_Actual.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        value_Actual.setForeground(new java.awt.Color(244, 169, 80));
        value_Actual.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        value_Actual.setText("0");
        value_Actual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                value_ActualMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 169, 80));
        jLabel1.setText(".");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 169, 80));
        jLabel2.setText("Deposit");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 169, 80));
        jLabel4.setText("P");

        submit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankproject/Resources/icons8_ok_100px.png"))); // NOI18N
        submit_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submit_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submit_ButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(value_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(value_Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit_button)
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(value_Decimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(value_Actual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseExited
        Font f = Exit_button.getFont();
        Exit_button.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_Exit_buttonMouseExited

    private void Exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseEntered
        Font f = Exit_button.getFont();
        Exit_button.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
    }//GEN-LAST:event_Exit_buttonMouseEntered

    private void Exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_Exit_buttonMouseClicked

    private void value_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_DecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value_DecimalActionPerformed

    private void submit_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_ButtonMouseEntered
        // TODO add your handling code here:
       
        submit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankproject/Resources/icons8_ok_100px_1.png")));
    }//GEN-LAST:event_submit_ButtonMouseEntered

    private void submit_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_ButtonMouseExited
        // TODO add your handling code here:
        submit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankproject/Resources/icons8_ok_100px.png")));
        
    }//GEN-LAST:event_submit_ButtonMouseExited

    private void submit_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_ButtonMouseClicked
        // TODO add your handling code here:
        
       try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientdb", "root", "admin1");
            Statement st = con.createStatement();
            
            SavingsAccount user = new SavingsAccount (this.username, this.password, st);
            
            String stringVal = value_Actual.getText() +"."+ value_Decimal.getText();
            
            double val = Double.parseDouble(stringVal);
             
            System.out.println(val);
            user.deposit(st, val);
            
            receiptInfo ri = user.getReceipt(val, st);
            
            Reciept_window receipt = new Reciept_window(ri, 2);
            receipt.setLocationRelativeTo(this);
            receipt.setVisible(true);
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_submit_ButtonMouseClicked

    private void value_ActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_value_ActualMouseClicked
        // TODO add your handling code here:
        value_Actual.setText("");
    }//GEN-LAST:event_value_ActualMouseClicked

    private void value_DecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_value_DecimalMouseClicked
        // TODO add your handling code here:
        value_Decimal.setText("");
    }//GEN-LAST:event_value_DecimalMouseClicked

    
   
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
            java.util.logging.Logger.getLogger(Deposit_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Deposit_window(username, password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit_button;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel submit_Button;
    private javax.swing.JTextField value_Actual;
    private javax.swing.JTextField value_Decimal;
    // End of variables declaration//GEN-END:variables
}
