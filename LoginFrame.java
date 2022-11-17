
    import java.awt.HeadlessException;
import javax.swing.JOptionPane;

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */


    public class LoginFrame extends javax.swing.JFrame {
        static String nameCustomar;
        String userName,
                password;
        Long realPassowrd;
        public LoginFrame() {
            initComponents();
        }


        @SuppressWarnings("unchecked")

        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            getUserName = new javax.swing.JTextField();
            getPassword = new javax.swing.JTextField();
            confirmLogin = new javax.swing.JButton();
            Cancel = new javax.swing.JButton();

            setTitle("Login");

            jPanel1.setBackground(new java.awt.Color(0, 3, 5, 255));
            jPanel1.setToolTipText("");

            jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Login Window : ");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(179, 179, 179))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(52, Short.MAX_VALUE))
            );

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel2.setText("User Name : ");

            jLabel3.setBackground(new java.awt.Color(0, 3, 5, 255));
            jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel3.setText("PassWord : ");

            getUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getUserName.setMargin(new java.awt.Insets(5, 5, 5, 5));

            getPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getPassword.setMargin(new java.awt.Insets(5, 5, 5, 5));

            confirmLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            confirmLogin.setForeground(new java.awt.Color(0, 3, 5, 255));
            confirmLogin.setText("Login");
            confirmLogin.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    confirmLoginActionPerformed(evt);
                }
            });

            Cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            Cancel.setForeground(new java.awt.Color(0, 3, 5, 255));
            Cancel.setText("Cancel");
            Cancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CancelActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(getUserName)
                                            .addComponent(getPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(107, Short.MAX_VALUE)
                                    .addComponent(confirmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(166, 166, 166))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(73, 73, 73)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(confirmLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(48, 48, 48))
            );

            pack();
        }

        private void confirmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLoginActionPerformed
            // TODO add your handling code here:
            // Hear To Search The Customar If Exsist OR Not
            try{
                userName = getUserName.getText();
                password = getPassword.getText();
                realPassowrd = Long.parseLong(password);

// Method To Cheack The UserName OR Password Is Right
                int cheack = CheackUserName();
                if(cheack == 1){
                    System.out.print("hi");
                }else if(cheack == 0){
                    System.out.print("hi");
                } else{
                    System.out.print("hi");

                }




            }catch(HeadlessException | NumberFormatException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage()," Error" , 0);
            }

        }//GEN-LAST:event_confirmLoginActionPerformed

        private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
            // TODO add your handling code here:
            // This To Set Visible For The Login Frame

            this.setVisible(false);
        }//GEN-LAST:event_CancelActionPerformed


        public static void main(String args[]) {

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginFrame().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Cancel;
        private javax.swing.JButton confirmLogin;
        private javax.swing.JTextField getPassword;
        private javax.swing.JTextField getUserName;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        // End of variables declaration//GEN-END:variables

        private int CheackUserName() {
            // For One Loops
            for(int i = 0 ; i < ManagerWindow.sizeCustomar; ++i){
                if(ManagerWindow.customar[i].getPassword() == realPassowrd && ManagerWindow.customar[i].getUserName().equals(userName))
                    if( ManagerWindow.customar[i].isIsInsert()){
                        nameCustomar = ManagerWindow.customar[i].getUserName();
                        JOptionPane.showMessageDialog(this, " Welcome  "+ManagerWindow.customar[i].getNameCustomer()," Welcome ",1);
                        CustomarWindow.shopProduct.setEnabled(true);
                        CustomarWindow.viewCart.setEnabled(true);

                    }}
            // For Tow Loops
            for(int i = 0 ; i < ManagerWindow.sizeCustomar; ++i){
                if(ManagerWindow.customar[i].getPassword() == realPassowrd && ManagerWindow.customar[i].getUserName().equals(userName))
                    if(!ManagerWindow.customar[i].isIsInsert()){
                        JOptionPane.showMessageDialog(this, ManagerWindow.customar[i].getNameCustomer() + " \n" + " You Dont Insert ): ", " Error",0);
                        return 0;
                    }}

            // For Three Loops
            for(int i = 0 ; i < ManagerWindow.sizeCustomar; ++i){
                if(!(ManagerWindow.customar[i].getUserName().equals(userName)) || ManagerWindow.customar[i].getPassword() != realPassowrd)
                    JOptionPane.showMessageDialog(this, " The PassWor OR User Name Error ): ", " Eroor",0);
                return -1;

            }
            return -5;

        }
    }

