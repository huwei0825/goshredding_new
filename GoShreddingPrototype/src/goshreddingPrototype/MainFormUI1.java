/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.EventCellRender;
import goshredding.data.EventTableModel;
import goshredding.data.EventVO;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author huwei
 */
public class MainFormUI1 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private ArrayList eventList = new ArrayList();
    private ArrayList recommandEventList = new ArrayList();
    public MainFormUI1() {
        initComponents();
        //eventTable
        eventTable.setRowHeight(75);
        
        eventTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(0, 0));
        eventTable.getTableHeader().setDefaultRenderer(renderer);

        EventVO event1 = new EventVO();
        event1.eventName = "Snow Skating";
        event1.eventDate = "01/02/2019";
        event1.eventTimeRemaining = "03:12;01;57";

        EventVO event2 = new EventVO();
        event2.eventName = "Super bike";
        event2.eventDate = "02/02/2019";
        event2.eventTimeRemaining = "04:02:15:02";

        EventVO event3 = new EventVO();
        event3.eventName = "bikeOlympic";
        event3.eventDate = "02/07/2019";
        event3.eventTimeRemaining = "04:03:01:02";

        EventVO event4 = new EventVO();
        event4.eventName = "Skiing 2020";
        event4.eventDate = "04/02/2019";
        event4.eventTimeRemaining = "06:03:01:02";

        EventVO event5 = new EventVO();
        event5.eventName = "Snow Skating";
        event5.eventDate = "08/02/2019";
        event5.eventTimeRemaining = "10:03:01:02";

        eventList.add(event1);
        eventList.add(event2);
        eventList.add(event3);
        eventList.add(event4);
        eventList.add(event5);

        EventTableModel eventTableModel = new EventTableModel(eventList);
        eventTable.setModel(eventTableModel);
        TableColumnModel tcm = eventTable.getColumnModel();
        TableColumn tc = tcm.getColumn(0);
        tc.setPreferredWidth(200);
        tc.setCellRenderer(new EventCellRender());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel = new javax.swing.JPanel();
        greetingTxt = new javax.swing.JLabel();
        dateTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        notificationBtn = new javax.swing.JButton();
        myEventBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        newGroupBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        myProfileBtn1 = new javax.swing.JButton();
        myProfileBtn2 = new javax.swing.JButton();
        myProfileBtn3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        newGroupBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 246, 254));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 480));

        jPanel.setBackground(new java.awt.Color(239, 246, 254));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel.setPreferredSize(new java.awt.Dimension(850, 480));
        jPanel.setLayout(null);

        greetingTxt.setForeground(new java.awt.Color(68, 114, 196));
        greetingTxt.setText("Good morning, Tony");
        jPanel.add(greetingTxt);
        greetingTxt.setBounds(460, 10, 140, 16);

        dateTxt.setForeground(new java.awt.Color(68, 114, 196));
        dateTxt.setText("dd/mm/yyyy 9:00 AM");
        jPanel.add(dateTxt);
        dateTxt.setBounds(610, 10, 138, 16);

        jLabel3.setForeground(new java.awt.Color(68, 114, 196));
        jLabel3.setText("\"Do want you can't\" --- Casey Neistat");
        jPanel.add(jLabel3);
        jLabel3.setBounds(20, 10, 320, 16);

        notificationBtn.setBackground(new java.awt.Color(72, 124, 175));
        notificationBtn.setText("My Notification");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });
        jPanel.add(notificationBtn);
        notificationBtn.setBounds(650, 300, 190, 35);

        myEventBtn.setBackground(new java.awt.Color(72, 124, 175));
        myEventBtn.setText("My events");
        myEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myEventBtnActionPerformed(evt);
            }
        });
        jPanel.add(myEventBtn);
        myEventBtn.setBounds(650, 260, 190, 30);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel20.setText("Upcoming events");
        jPanel.add(jLabel20);
        jLabel20.setBounds(20, 40, 220, 30);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(jTextField1);
        jTextField1.setBounds(20, 80, 160, 35);

        jButton5.setBackground(new java.awt.Color(72, 124, 175));
        jButton5.setText("search");
        jPanel.add(jButton5);
        jButton5.setBounds(190, 80, 85, 35);

        newGroupBtn.setBackground(new java.awt.Color(72, 124, 175));
        newGroupBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        newGroupBtn.setText("Edit Event");
        newGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGroupBtnActionPerformed(evt);
            }
        });
        jPanel.add(newGroupBtn);
        newGroupBtn.setBounds(650, 390, 190, 30);
        newGroupBtn.getAccessibleContext().setAccessibleName("New Event");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mountain biking", "skateboarding", "snowboarding", "", "" }));
        jComboBox1.setToolTipText("");
        jPanel.add(jComboBox1);
        jComboBox1.setBounds(500, 80, 160, 30);

        eventTable.setBackground(new java.awt.Color(239, 246, 254));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventTable.setGridColor(new java.awt.Color(0, 0, 0));
        eventTable.setIntercellSpacing(new java.awt.Dimension(0, 2));
        jScrollPane4.setViewportView(eventTable);

        jPanel.add(jScrollPane4);
        jScrollPane4.setBounds(20, 126, 600, 340);

        myProfileBtn1.setBackground(new java.awt.Color(72, 124, 175));
        myProfileBtn1.setText("Sort by time");
        myProfileBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileBtn1ActionPerformed(evt);
            }
        });
        jPanel.add(myProfileBtn1);
        myProfileBtn1.setBounds(650, 120, 190, 35);

        myProfileBtn2.setBackground(new java.awt.Color(72, 124, 175));
        myProfileBtn2.setText("Sort by popularity");
        myProfileBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileBtn2ActionPerformed(evt);
            }
        });
        jPanel.add(myProfileBtn2);
        myProfileBtn2.setBounds(650, 170, 190, 35);

        myProfileBtn3.setBackground(new java.awt.Color(72, 124, 175));
        myProfileBtn3.setText("Advertisement");
        myProfileBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileBtn3ActionPerformed(evt);
            }
        });
        jPanel.add(myProfileBtn3);
        myProfileBtn3.setBounds(650, 430, 190, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/profile-3.png"))); // NOI18N
        jPanel.add(jLabel1);
        jLabel1.setBounds(780, 10, 60, 60);

        newGroupBtn1.setBackground(new java.awt.Color(72, 124, 175));
        newGroupBtn1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        newGroupBtn1.setText("New Event");
        newGroupBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGroupBtn1ActionPerformed(evt);
            }
        });
        jPanel.add(newGroupBtn1);
        newGroupBtn1.setBounds(650, 350, 190, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Filter:");
        jPanel.add(jLabel2);
        jLabel2.setBounds(456, 86, 50, 20);

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Popularity" }));
        jPanel.add(jComboBox2);
        jComboBox2.setBounds(340, 80, 110, 35);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Sort by:");
        jPanel.add(jLabel4);
        jLabel4.setBounds(280, 86, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myEventBtnActionPerformed
        MyEventsUI myFrm = new MyEventsUI();
        myFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myEventBtnActionPerformed

    private void newGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGroupBtnActionPerformed
        EventInformationUI eiFrm = new EventInformationUI();
        eiFrm.sourceForm = 1;
        eiFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newGroupBtnActionPerformed

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        NotificationCentreUI ncFrm = new NotificationCentreUI();
        ncFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_notificationBtnActionPerformed

    private void myProfileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myProfileBtn1ActionPerformed

    private void myProfileBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myProfileBtn2ActionPerformed

    private void myProfileBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myProfileBtn3ActionPerformed

    private void newGroupBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGroupBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGroupBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        try{
            UIManager.setLookAndFeel("com.jtatto.plaf.aluminium.AluminiumLookAndFeel");
        }catch(Exception ee){
            
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateTxt;
    private javax.swing.JTable eventTable;
    private javax.swing.JLabel greetingTxt;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton myEventBtn;
    private javax.swing.JButton myProfileBtn1;
    private javax.swing.JButton myProfileBtn2;
    private javax.swing.JButton myProfileBtn3;
    private javax.swing.JButton newGroupBtn;
    private javax.swing.JButton newGroupBtn1;
    private javax.swing.JButton notificationBtn;
    // End of variables declaration//GEN-END:variables
}
