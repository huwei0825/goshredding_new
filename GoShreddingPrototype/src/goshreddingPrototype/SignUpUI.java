/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.Definition;
import goshredding.data.Validation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author huwei
 */
public class SignUpUI extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    
    public SignUpUI() {
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

        jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        forenameTxt = new javax.swing.JTextField();
        surnameTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        add1Txt = new javax.swing.JTextField();
        add2Txt = new javax.swing.JTextField();
        postcodeTxt = new javax.swing.JTextField();
        password1Txt = new javax.swing.JTextField();
        password2Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 246, 254));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 480));

        jPanel.setBackground(new java.awt.Color(239, 246, 254));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Sign up");

        forenameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        surnameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        dobTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        add1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        add2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        postcodeTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        password1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        password2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Surname:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Forename:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Postcode:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("DOB(dd/mm/yyyy):");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("I'm a:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Address2:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Address1:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Password:");

        numTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Contact Num:");

        emailTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("email:");

        userTypeComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "participant", "Organizer" }));
        userTypeComboBox.setPreferredSize(new java.awt.Dimension(96, 40));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Confirm password:");

        backBtn.setBackground(new java.awt.Color(72, 124, 175));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(72, 124, 175));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forenameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(surnameTxt)
                    .addComponent(dobTxt)
                    .addComponent(add1Txt)
                    .addComponent(add2Txt)
                    .addComponent(postcodeTxt)
                    .addComponent(numTxt))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTypeComboBox, 0, 253, Short.MAX_VALUE)
                                .addComponent(emailTxt))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(378, 378, 378))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(postcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LoginUI liFrm = new LoginUI();
        liFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String record;
        int userId;
        String forename = forenameTxt.getText();
        String surname = surnameTxt.getText();
        String dob = dobTxt.getText();
        String add1 = add1Txt.getText();
        String add2 = add2Txt.getText();
        String postcode = postcodeTxt.getText();
        String num = numTxt.getText();
        String email = emailTxt.getText();
        String userType = (String) userTypeComboBox.getSelectedItem();
        String password1 = password1Txt.getText();
        String password2 = password2Txt.getText();
        int income = 0;
        String lineRead;
        int lineNum = 0;//stores the number of lines in a file

        boolean validate = true;

        if (Validation.isPresent(forenameTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Forename",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(surnameTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Surname",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(numTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Contact number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isLength(numTxt.getText(), 11) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 11 numbers long", "Contact number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isDate(dobTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Please write a valid date and in the format 'dd/mm/yyyy'", "DOB",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(emailTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Email",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(add1Txt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "address",
                    JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
        }
        if (Validation.isPresent(postcodeTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Postcode",
                    JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
        }
        if ((Validation.isLength(postcodeTxt.getText(), 7) || Validation.isLength(postcodeTxt.getText(), 8)) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 7 or 8 characters long", "Postcode",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isLength(password1Txt.getText(), 8) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 8 characters long", "Password",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isDoubleVerification(password1Txt.getText(), password2Txt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Please confirm the password again", "Passwords don't match",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        try {
            if (validate == true) {
                //store participant information
                if (userType.equalsIgnoreCase("participant")) {
                    //create a file reader object
                    FileReader fr = new FileReader(Definition.PARTICIPANTFILE);
                    BufferedReader br = new BufferedReader(fr);
                    //loop through file until EOF or we find it
                    while ((lineRead = br.readLine()) != null) {
                        lineNum++;
                    }
                    userId = lineNum + 100;
                    record = userId + "," + forename + "," + surname + "," + dob + "," + add1 + "," + add2 + "," + postcode + "," + num
                            + "," + email + "," + password1;
                    //create file writer object
                    FileWriter w = new FileWriter(Definition.PARTICIPANTFILE, true);
                    //write the string record to the file plus end of line
                    w.write(record + System.getProperty("line.separator"));
                    w.close();//close file
                    JOptionPane.showMessageDialog(null, "successful added");
                    MainFormUI mainFrm = new MainFormUI();
                    mainFrm.setVisible(true);
                    this.dispose();
                    String massage = "Successfully signed up! Your user ID is : " + userId + 
                        ", please remember it for the next time you log in (your ID can be found in your profile screen)";
                    JOptionPane.showMessageDialog(null, massage);
                }
                //store organizer information
                if (userType.equalsIgnoreCase("organizer")) {
                    //create a file reader object
                    FileReader fr = new FileReader(Definition.ORGANIZERFILE);
                    BufferedReader br = new BufferedReader(fr);
                    //loop through file until EOF or we find it
                    while ((lineRead = br.readLine()) != null) {
                        lineNum++;
                    }
                    userId = lineNum + 100;
                    record = userId + "," + forename + "," + surname + "," + dob + "," + add1 + "," + add2 + "," + postcode + "," + num
                            + "," + email + "," + password1 + "," + income;
                    //create file writer object
                    FileWriter w = new FileWriter(Definition.ORGANIZERFILE, true);
                    //write the string record to the file plus end of line
                    w.write(record + System.getProperty("line.separator"));
                    w.close();//close file
                    JOptionPane.showMessageDialog(null, "successful added");
                    MainFormUI mainFrm = new MainFormUI();
                    mainFrm.setVisible(true);
                    this.dispose();
                    String massage = "Successfully signed up! Your user ID is : " + userId + 
                        ", please remember it for the next time you log in (your ID can be found in your profile screen)";
                    JOptionPane.showMessageDialog(null, massage);
                }
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error with: " + ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SignUpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add1Txt;
    private javax.swing.JTextField add2Txt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField forenameTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField password1Txt;
    private javax.swing.JTextField password2Txt;
    private javax.swing.JTextField postcodeTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JComboBox<String> userTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
