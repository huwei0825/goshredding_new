/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRD;

import goshredding.data.EventCellRender;
import goshredding.data.EventTableModel;
import goshredding.data.EventVO;
import goshreddingPrototype.MyEventsUI;
import goshreddingPrototype.NotificationCentreUI;
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
public class MainFormUI2 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private ArrayList eventList = new ArrayList();
    private ArrayList recommandEventList = new ArrayList();
    public MainFormUI2() {
        initComponents();
        //eventTable
        eventTable.setRowHeight(75);
        
        eventTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(0, 0));
        eventTable.getTableHeader().setDefaultRenderer(renderer);

        EventVO event1 = new EventVO();
        event1.eventName = "Berrics skating park";
        event1.eventDate = "01/02/2019";
        event1.eventTime = "8:00AM";
        event1.eventPicName="/files/sbEvent1.PNG";
        event1.eventTypePicName="/files/skateboard.png";

        EventVO event2 = new EventVO();
        event2.eventName = "Mountainbikers Heaven-Saalbach";
        event2.eventDate = "02/02/2019";
        event2.eventTime = "3:45PM";
        event2.eventPicName="/files/mtbEvent1.png";
        event2.eventTypePicName="/files/bike-2.png";

        EventVO event3 = new EventVO();
        event3.eventName = "Street ride";
        event3.eventDate = "02/07/2019";
        event3.eventTime = "8:00PM";
        event3.eventPicName="/files/mtbEvent2.png";
        event3.eventTypePicName="/files/bike-2.png";
        
        EventVO event4 = new EventVO();
        event4.eventName = "Hakubavalley winter camp 2020";
        event4.eventDate = "04/02/2019";
        event4.eventTime = "9:20AM";
        event4.eventPicName="/files/snowboardEvent2.PNG";
        event4.eventTypePicName="/files/snowboard.png";
        
        EventVO event5 = new EventVO();
        event5.eventName = "Oakley snowboard meeting";
        event5.eventDate = "08/02/2019";
        event5.eventTime = "9:30AM";
        event5.eventPicName="/files/snowboardEvent1.PNG";
        event5.eventTypePicName="/files/snowboard.png";
        
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
        tc.setCellRenderer(new EventCellRender3());
        
        
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
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        myEventBtn1 = new javax.swing.JButton();
        notificationBtn1 = new javax.swing.JButton();
        myEventBtn2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

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
        greetingTxt.setBounds(470, 20, 140, 16);

        dateTxt.setForeground(new java.awt.Color(68, 114, 196));
        dateTxt.setText("dd/mm/yyyy 9:00 AM");
        jPanel.add(dateTxt);
        dateTxt.setBounds(620, 20, 138, 16);

        jLabel3.setForeground(new java.awt.Color(68, 114, 196));
        jLabel3.setText("\"Do want you can't\" --- Casey Neistat");
        jPanel.add(jLabel3);
        jLabel3.setBounds(30, 20, 320, 16);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel20.setText("Find your next event");
        jPanel.add(jLabel20);
        jLabel20.setBounds(30, 40, 260, 30);

        jButton5.setBackground(new java.awt.Color(72, 124, 175));
        jButton5.setText("search");
        jPanel.add(jButton5);
        jButton5.setBounds(200, 83, 85, 35);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All types", "mountain biking", "skateboarding", "snowboarding", " ", " " }));
        jComboBox1.setToolTipText("");
        jPanel.add(jComboBox1);
        jComboBox1.setBounds(510, 83, 160, 35);

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
        jScrollPane4.setBounds(30, 126, 790, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/profile-3.png"))); // NOI18N
        jPanel.add(jLabel1);
        jLabel1.setBounds(770, 10, 65, 65);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Filter:");
        jPanel.add(jLabel2);
        jLabel2.setBounds(470, 90, 50, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Popularity" }));
        jPanel.add(jComboBox2);
        jComboBox2.setBounds(350, 83, 110, 35);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Sort by:");
        jPanel.add(jLabel4);
        jLabel4.setBounds(290, 90, 60, 20);

        myEventBtn1.setBackground(new java.awt.Color(72, 124, 175));
        myEventBtn1.setText("Advertisement");
        myEventBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myEventBtn1ActionPerformed(evt);
            }
        });
        jPanel.add(myEventBtn1);
        myEventBtn1.setBounds(370, 40, 120, 35);

        notificationBtn1.setBackground(new java.awt.Color(72, 124, 175));
        notificationBtn1.setText("Notification");
        notificationBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtn1ActionPerformed(evt);
            }
        });
        jPanel.add(notificationBtn1);
        notificationBtn1.setBounds(650, 40, 120, 35);

        myEventBtn2.setBackground(new java.awt.Color(72, 124, 175));
        myEventBtn2.setText("My events");
        myEventBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myEventBtn2ActionPerformed(evt);
            }
        });
        jPanel.add(myEventBtn2);
        myEventBtn2.setBounds(510, 40, 120, 35);

        jPanel1.setBackground(new java.awt.Color(204, 218, 243));
        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1, 3, 160, 35);

        jPanel.add(jPanel1);
        jPanel1.setBounds(30, 80, 650, 40);

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

    private void myEventBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myEventBtn1ActionPerformed
        MyEventsUI myFrm = new MyEventsUI();
        myFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myEventBtn1ActionPerformed

    private void notificationBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtn1ActionPerformed
        NotificationCentreUI ncFrm = new NotificationCentreUI();
        ncFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_notificationBtn1ActionPerformed

    private void myEventBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myEventBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myEventBtn2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainFormUI2().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton myEventBtn1;
    private javax.swing.JButton myEventBtn2;
    private javax.swing.JButton notificationBtn1;
    // End of variables declaration//GEN-END:variables
}
