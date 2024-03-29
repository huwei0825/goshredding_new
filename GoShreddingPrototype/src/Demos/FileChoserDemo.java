/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demos;

import goshredding.data.GoHelper;
import goshredding.data.PictureViewPanel;
import goshreddingPrototype.MainFormUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author syp386
 */
public class FileChoserDemo extends javax.swing.JFrame {

    /**
     * Creates new form FileChoserDemo
     */
    private PictureViewPanel pictureViewPanel = null;

    public FileChoserDemo() {

        initComponents();
        GoHelper.setBkColor(this.getContentPane());
        
        pictureViewPanel = new PictureViewPanel();
        pictureViewPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        pictureViewPanel.setPreferredSize(new Dimension(400, 300));
        imageViewContainerPanel.setLayout(new java.awt.FlowLayout());
        imageViewContainerPanel.add(pictureViewPanel);
        //Image image = new ImageIcon(getClass().getResource("/files/profile-3.png")).getImage();
        Image image = new ImageIcon("C:\\Users\\SXR\\Documents\\美图图库\\示例图片_03.jpg").getImage();
//        pictureViewPanel.setImage(image);
//        pictureViewPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelectImage = new javax.swing.JButton();
        imageViewContainerPanel = new javax.swing.JPanel();
        btnChangeColorBlue = new javax.swing.JButton();
        btnChangeBkYellow = new javax.swing.JButton();
        btnMainForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSelectImage.setText("Select image");
        btnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageActionPerformed(evt);
            }
        });

        imageViewContainerPanel.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout imageViewContainerPanelLayout = new javax.swing.GroupLayout(imageViewContainerPanel);
        imageViewContainerPanel.setLayout(imageViewContainerPanelLayout);
        imageViewContainerPanelLayout.setHorizontalGroup(
            imageViewContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        imageViewContainerPanelLayout.setVerticalGroup(
            imageViewContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        btnChangeColorBlue.setText("Change Blue");
        btnChangeColorBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColorBlueActionPerformed(evt);
            }
        });

        btnChangeBkYellow.setText("Change Yellow");
        btnChangeBkYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeBkYellowActionPerformed(evt);
            }
        });

        btnMainForm.setText("Open Mainform");
        btnMainForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelectImage)
                        .addGap(38, 38, 38)
                        .addComponent(btnChangeColorBlue)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangeBkYellow)
                        .addGap(18, 18, 18)
                        .addComponent(btnMainForm))
                    .addComponent(imageViewContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectImage)
                    .addComponent(btnChangeColorBlue)
                    .addComponent(btnChangeBkYellow)
                    .addComponent(btnMainForm))
                .addGap(18, 18, 18)
                .addComponent(imageViewContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImageActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();             //设置选择器   
        int returnVal = chooser.showOpenDialog(btnSelectImage);        //是否打开文件选择框  
//        System.out.println("returnVal=" + returnVal);
//        chooser.setAcceptAllFileFilterUsed(false);//取消所有文件过滤器并设置新的图片文件过滤器
//        chooser.setFileFilter(new FileNameExtensionFilter("images", "jpg","jpeg","png"));
        chooser.setFileFilter(new FileFilter() {
            @Override
            public String getDescription() {
                return "images（png;jpg）";
            }

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String fn = f.getName();
                return fn.endsWith(".png") || fn.endsWith(".jpg");
            }
        });

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());  //输出相对路径 
            try {
                Image image = new ImageIcon(file.getAbsolutePath()).getImage();
                pictureViewPanel.setImage(image);
                pictureViewPanel.repaint();
            } catch (Exception e1) {
                e1.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnSelectImageActionPerformed

    private void btnChangeColorBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColorBlueActionPerformed
        // TODO add your handling code here:
        GoHelper.currentBkColor = GoHelper.BK_COLOR_BLUE;

        FileChoserDemo temp = new FileChoserDemo();
        temp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChangeColorBlueActionPerformed

    private void btnChangeBkYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeBkYellowActionPerformed
        // TODO add your handling code here:
        GoHelper.currentBkColor = GoHelper.BK_COLOR_YELLOW;
        FileChoserDemo temp = new FileChoserDemo();
        temp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChangeBkYellowActionPerformed

    private void btnMainFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainFormActionPerformed
        // TODO add your handling code here:
        MainFormUI temp = new MainFormUI();
        temp.setVisible(true);
    }//GEN-LAST:event_btnMainFormActionPerformed

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
            java.util.logging.Logger.getLogger(FileChoserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChoserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChoserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChoserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        GoHelper.changeTheme(Color.BLACK);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FileChoserDemo temp = new FileChoserDemo();
                temp.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeBkYellow;
    private javax.swing.JButton btnChangeColorBlue;
    private javax.swing.JButton btnMainForm;
    private javax.swing.JButton btnSelectImage;
    private javax.swing.JPanel imageViewContainerPanel;
    // End of variables declaration//GEN-END:variables
}
