package bankproject;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author A.A. Yapan
 */
public class Change_pass_window extends javax.swing.JFrame {

    /**
     * Creates new form Change_pass_window
     */
    
    private static String username;
    private static String password;
    public Change_pass_window(String x, String y) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Current_password_text = new javax.swing.JLabel();
        Current_password = new javax.swing.JPasswordField();
        current_password_separator = new javax.swing.JSeparator();
        New_password_text = new javax.swing.JLabel();
        New_password = new javax.swing.JPasswordField();
        new_password_separator = new javax.swing.JSeparator();
        Confirm_password_text = new javax.swing.JLabel();
        Confirm_password = new javax.swing.JPasswordField();
        confirm_password_separator = new javax.swing.JSeparator();
        Okay_button = new javax.swing.JLabel();
        Exit_button = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 169, 80));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(22, 27, 33));

        Current_password_text.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        Current_password_text.setForeground(new java.awt.Color(240, 240, 240));
        Current_password_text.setText("Current password");

        Current_password.setBackground(new java.awt.Color(22, 27, 33));
        Current_password.setForeground(new java.awt.Color(102, 102, 102));
        Current_password.setText("yourpassword");
        Current_password.setBorder(null);
        Current_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Current_passwordMouseClicked(evt);
            }
        });

        New_password_text.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        New_password_text.setForeground(new java.awt.Color(240, 240, 240));
        New_password_text.setText("New password");

        New_password.setBackground(new java.awt.Color(22, 27, 33));
        New_password.setForeground(new java.awt.Color(102, 102, 102));
        New_password.setText("yourpassword");
        New_password.setBorder(null);
        New_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                New_passwordMouseClicked(evt);
            }
        });

        Confirm_password_text.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        Confirm_password_text.setForeground(new java.awt.Color(240, 240, 240));
        Confirm_password_text.setText("Confirm password");

        Confirm_password.setBackground(new java.awt.Color(22, 27, 33));
        Confirm_password.setForeground(new java.awt.Color(102, 102, 102));
        Confirm_password.setText("yourpassword");
        Confirm_password.setBorder(null);
        Confirm_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Confirm_passwordMouseClicked(evt);
            }
        });
        Confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_passwordActionPerformed(evt);
            }
        });

        Okay_button.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        Okay_button.setForeground(new java.awt.Color(240, 240, 240));
        Okay_button.setText("Okay");
        Okay_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Okay_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Okay_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Okay_buttonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(New_password_text)
                            .addComponent(Current_password_text))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(current_password_separator)
                                .addComponent(Current_password, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(new_password_separator)
                                .addComponent(New_password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Confirm_password_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirm_password_separator)
                            .addComponent(Confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Okay_button)
                .addGap(192, 192, 192))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Current_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Current_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(current_password_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(New_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(New_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_password_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Confirm_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm_password_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Okay_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit_button)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit_button)
                .addGap(4, 4, 4)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_passwordActionPerformed
        
    }//GEN-LAST:event_Confirm_passwordActionPerformed

    private void Okay_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Okay_buttonMouseEntered
        Font f = Okay_button.getFont();
        Okay_button.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
    }//GEN-LAST:event_Okay_buttonMouseEntered

    private void Okay_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Okay_buttonMouseExited
        Font f = Okay_button.getFont();
        Okay_button.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_Okay_buttonMouseExited

    private void Exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseEntered
        Font f = Exit_button.getFont();
        Exit_button.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
    }//GEN-LAST:event_Exit_buttonMouseEntered

    private void Exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseExited
        Font f = Exit_button.getFont();
        Exit_button.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_Exit_buttonMouseExited

    private void Exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_Exit_buttonMouseClicked

    private void Current_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Current_passwordMouseClicked
        Current_password.setText("");
    }//GEN-LAST:event_Current_passwordMouseClicked

    private void New_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_passwordMouseClicked
        New_password.setText("");
    }//GEN-LAST:event_New_passwordMouseClicked

    private void Confirm_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Confirm_passwordMouseClicked
        Confirm_password.setText("");
    }//GEN-LAST:event_Confirm_passwordMouseClicked

    private void Okay_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Okay_buttonMouseClicked
        // TODO add your handling code here:
        String oldPass = new String(Current_password.getPassword());
        String newPass = new String (New_password.getPassword());
        String confirmPass = new String (Confirm_password.getPassword());
        
        
        if(oldPass.equals(password) && newPass.equals(confirmPass)){
            changePassword (newPass);
            Change_Success successPrompt = new Change_Success();
            successPrompt.setLocationRelativeTo(this);
            successPrompt.setVisible(true);
        } else {
            System.out.println("Wrong input....");
        }
        
    }//GEN-LAST:event_Okay_buttonMouseClicked

    private void changePassword (String newPassword){
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientdb", "root", "admin1");
            Statement st = con.createStatement();
            
            st.executeUpdate("UPDATE clientinfo SET Password = " + "'"+newPassword +"'" +" WHERE Name = " + "'" + username +"'");
  
        }catch (SQLException e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Change_pass_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_pass_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_pass_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_pass_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_pass_window(username, password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Confirm_password;
    private javax.swing.JLabel Confirm_password_text;
    private javax.swing.JPasswordField Current_password;
    private javax.swing.JLabel Current_password_text;
    private javax.swing.JLabel Exit_button;
    private javax.swing.JPasswordField New_password;
    private javax.swing.JLabel New_password_text;
    private javax.swing.JLabel Okay_button;
    private javax.swing.JSeparator confirm_password_separator;
    private javax.swing.JSeparator current_password_separator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator new_password_separator;
    // End of variables declaration//GEN-END:variables
}
