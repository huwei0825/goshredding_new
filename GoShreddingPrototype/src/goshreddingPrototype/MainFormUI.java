/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.EventCellRender;
import goshredding.data.EventTableModel;
import goshredding.data.EventVO;
import goshredding.data.RecommandedEventCellRender;
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
public class MainFormUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private ArrayList eventList = new ArrayList();
    private ArrayList recommandEventList = new ArrayList();
    public MainFormUI() {
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
        
        //recommandedEventTable
        recommandEventTable.setRowHeight(50);
        
        recommandEventTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
        renderer2.setPreferredSize(new Dimension(0, 0));
        recommandEventTable.getTableHeader().setDefaultRenderer(renderer2);

        EventVO recommandEvent1 = new EventVO();
        recommandEvent1.eventName = "coastal cycling";
        recommandEvent1.eventDate = "03/02/2019";
        recommandEvent1.eventTime = "3:00 PM";
        recommandEvent1.eventType = "snowboarding";

        EventVO recommandEvent2 = new EventVO();
        recommandEvent2.eventName = "Pete skating fest";
        recommandEvent2.eventDate = "03/02/2019";
        recommandEvent2.eventTime = "11:00 AM";
        recommandEvent2.eventType = "stakeboarding";

        EventVO recommandEvent3 = new EventVO();
        recommandEvent3.eventName = "Biking Pedernales state park";
        recommandEvent3.eventDate = "04/02/2019";
        recommandEvent3.eventTime = "11:20 AM";
        recommandEvent3.eventType = "mountain biking";

        EventVO recommandEvent4 = new EventVO();
        recommandEvent4.eventName = "Full park friday";
        recommandEvent4.eventDate = "04/02/2019";
        recommandEvent4.eventTime = "7:00 pM";
        recommandEvent4.eventType = "snowboarding";

        EventVO recommandEvent5 = new EventVO();
        recommandEvent5.eventName = "All levels welcome-Clyne cycling";
        recommandEvent5.eventDate = "04/02/2019";
        recommandEvent5.eventTime = "3:00 pM";
        recommandEvent5.eventType = "mountain biking";

        recommandEventList.add(recommandEvent1);
        recommandEventList.add(recommandEvent2);
        recommandEventList.add(recommandEvent3);
        recommandEventList.add(recommandEvent4);
        recommandEventList.add(recommandEvent5);

        EventTableModel eventTableModel2 = new EventTableModel(recommandEventList);
        recommandEventTable.setModel(eventTableModel2);
        TableColumnModel tcm2 = recommandEventTable.getColumnModel();
        TableColumn tc2 = tcm2.getColumn(0);
        tc2.setPreferredWidth(200);
        tc2.setCellRenderer(new RecommandedEventCellRender());
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        notificationBtn = new javax.swing.JButton();
        myEventBtn = new javax.swing.JButton();
        myProfileBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        newGroupBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        recommandEventTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();

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

        greetingTxt.setText("Good morning, Tony");
        jPanel.add(greetingTxt);
        greetingTxt.setBounds(46, 20, 140, 16);

        dateTxt.setText("dd/mm/yyyy 9:00 AM");
        jPanel.add(dateTxt);
        dateTxt.setBounds(196, 20, 138, 16);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Find your next event");
        jPanel.add(jLabel1);
        jLabel1.setBounds(525, 80, 259, 30);

        jLabel2.setText("Days : hours: minutes : seconds");
        jPanel.add(jLabel2);
        jLabel2.setBounds(206, 80, 230, 16);

        jLabel3.setText("\"Do want you can't\" --- Casey Neistat");
        jPanel.add(jLabel3);
        jLabel3.setBounds(579, 20, 260, 16);

        notificationBtn.setBackground(new java.awt.Color(72, 124, 175));
        notificationBtn.setText("Notification");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });
        jPanel.add(notificationBtn);
        notificationBtn.setBounds(586, 39, 120, 35);

        myEventBtn.setBackground(new java.awt.Color(72, 124, 175));
        myEventBtn.setText("My events");
        myEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myEventBtnActionPerformed(evt);
            }
        });
        jPanel.add(myEventBtn);
        myEventBtn.setBounds(454, 39, 120, 35);

        myProfileBtn.setBackground(new java.awt.Color(72, 124, 175));
        myProfileBtn.setText("My profile");
        myProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileBtnActionPerformed(evt);
            }
        });
        jPanel.add(myProfileBtn);
        myProfileBtn.setBounds(718, 39, 120, 35);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel20.setText("Upcoming events");
        jPanel.add(jLabel20);
        jLabel20.setBounds(50, 50, 220, 30);

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(jTextField1);
        jTextField1.setBounds(454, 116, 293, 35);

        jButton5.setBackground(new java.awt.Color(72, 124, 175));
        jButton5.setText("search");
        jPanel.add(jButton5);
        jButton5.setBounds(753, 117, 91, 35);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel19.setText("You might be interested in...");
        jPanel.add(jLabel19);
        jLabel19.setBounds(460, 160, 259, 19);

        newGroupBtn.setBackground(new java.awt.Color(72, 124, 175));
        newGroupBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        newGroupBtn.setText("Start a new group");
        newGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGroupBtnActionPerformed(evt);
            }
        });
        jPanel.add(newGroupBtn);
        newGroupBtn.setBounds(460, 430, 380, 40);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sort by time", "sort by popularity", "mountain biking", "skateboarding", "snowboarding", " ", " " }));
        jComboBox1.setToolTipText("");
        jPanel.add(jComboBox1);
        jComboBox1.setBounds(710, 160, 130, 27);

        recommandEventTable.setBackground(new java.awt.Color(239, 246, 254));
        recommandEventTable.setModel(new javax.swing.table.DefaultTableModel(
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
        recommandEventTable.setGridColor(new java.awt.Color(0, 0, 0));
        recommandEventTable.setIntercellSpacing(new java.awt.Dimension(0, 2));
        recommandEventTable.setShowGrid(false);
        jScrollPane3.setViewportView(recommandEventTable);

        jPanel.add(jScrollPane3);
        jScrollPane3.setBounds(460, 190, 380, 230);

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
        eventTable.setShowGrid(false);
        jScrollPane4.setViewportView(eventTable);

        jPanel.add(jScrollPane4);
        jScrollPane4.setBounds(20, 110, 411, 356);

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

    private void myProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtnActionPerformed
        myProfileUI mpFrm = new myProfileUI();
        mpFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myProfileBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainFormUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateTxt;
    private javax.swing.JTable eventTable;
    private javax.swing.JLabel greetingTxt;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton myEventBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JButton newGroupBtn;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JTable recommandEventTable;
    // End of variables declaration//GEN-END:variables
}
