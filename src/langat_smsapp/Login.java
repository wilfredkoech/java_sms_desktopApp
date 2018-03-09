
package langat_smsapp;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


      
public class Login extends javax.swing.JFrame {
PreparedStatement pst = null;
ResultSet rs = null;
   
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 8, true), "LOGIN/SIGN-UP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERPASSWORD");

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Stencil Std", 1, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("SIGN-UP");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 102), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if("".equals(jTextField1.getText()) ){
            JOptionPane.showMessageDialog(null, "Name cannot be empty!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(jPasswordField1.getText()) || jPasswordField1.getText().length()<3) {
            JOptionPane.showMessageDialog(null, "password too short. \n provide more than 3 characters!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            int c = JOptionPane.showConfirmDialog(null,"Do you want to register another user?", "REGISTER",JOptionPane.YES_NO_OPTION);
        
        String sql= "INSERT INTO langat_login(username,password) values(?,?)";
         if (c==0){
             try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl="jdbc:sqlserver://localhost:1433;"+
                    "databaseName=Langat;user=sa;password=wilfred.;";
            Connection conn=DriverManager.getConnection(connectionUrl);
            pst=conn.prepareStatement(sql);
            pst.setString (1,jTextField1.getText());
             pst.setString(2,jPasswordField1.getText());
             
       
        
            pst.execute();
            JOptionPane.showMessageDialog(null,"Registered successfully");
             jTextField1.setText("");
        jPasswordField1.setText("");
        
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }                                        
        }                          
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if("".equals(jTextField1.getText()) ){
            JOptionPane.showMessageDialog(null, "Name cannot be empty!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(jPasswordField1.getText()) || jPasswordField1.getText().length()<6) {
            JOptionPane.showMessageDialog(null, "password too short. \n provide more than 6 characters!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else{

            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectionUrl="jdbc:sqlserver://localhost:1433;"+
                "databaseName=Langat;user=sa;password=wilfred.;";
                Connection conn=DriverManager.getConnection(connectionUrl);
                String sql="SELECT * FROM langat_login WHERE username=? and password=?";
                pst=conn.prepareStatement(sql);

                pst.setString (1,jTextField1.getText());
                pst.setString(2,jPasswordField1.getText());

                rs=pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"MATCHES \n JUST PRESS OK TO CONTINUE");
                    sms_page sa = new sms_page();
                    sa.setVisible(true);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Sorry, username and password doesn't match","PASSWORD ERROR",JOptionPane.ERROR_MESSAGE);
                }

                jTextField1.setText("");
                jPasswordField1.setText("");

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if("".equals(jTextField1.getText()) ){
            JOptionPane.showMessageDialog(null, "Name cannot be empty!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(jPasswordField1.getText()) || jPasswordField1.getText().length()<6) {
            JOptionPane.showMessageDialog(null, "password too short. \n provide more than 6 characters!!","error", JOptionPane.ERROR_MESSAGE);
        }
        else{

            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectionUrl="jdbc:sqlserver://localhost:1433;"+
                "databaseName=Langat;user=sa;password=wilfred.;";
                Connection conn=DriverManager.getConnection(connectionUrl);
                String sql="SELECT * FROM langat_login WHERE username=? and password=?";
                pst=conn.prepareStatement(sql);

                pst.setString (1,jTextField1.getText());
                pst.setString(2,jPasswordField1.getText());

                rs=pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"MATCHES \n JUST PRESS OK TO CONTINUE");
                    sms_page sa = new sms_page();
                    sa.setVisible(true);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Sorry, username and password doesn't match","PASSWORD ERROR",JOptionPane.ERROR_MESSAGE);
                }

                jTextField1.setText("");
                jPasswordField1.setText("");

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }}

         }                               
    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
