/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.EventCellRender;
import goshredding.data.EventTableModel;
import goshredding.data.GoHelper;
import goshredding.vo.EventVO;
import goshredding.data.RecommandedEventCellRender;
import goshredding.service.GoService;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
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
    ArrayList<EventVO> eventList = new ArrayList<EventVO>();

    public MainFormUI() {
        initComponents();
        if (GoService.currentUserType == 2) {
            newGroupBtn.setVisible(false);
        }else if (GoService.currentUserType == 1) {
            recommandEventLbl.setText("Events by other organizers...");
        }
        myProfileLbl.addMouseListener(new MyMouseAdapter(myProfileLbl));

        //eventTable
        eventTable.setRowHeight(75);

        eventTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(0, 0));
        eventTable.getTableHeader().setDefaultRenderer(renderer);

        if (GoService.currentUserType == 2) {
            try {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (GoService.currentUserType == 1) {
            try {
               eventList = GoService.getInstance().getEventByOrganizerId(GoService.currentUserId);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(eventList.size() == 0){
            EventVO event = new EventVO();
            event.eventName = "You have no events yet";
            eventList.add(event);
        }
        EventTableModel eventTableModel = new EventTableModel(eventList);
        eventTable.setModel(eventTableModel);
        TableColumnModel tcm = eventTable.getColumnModel();
        TableColumn tc = tcm.getColumn(0);
        tc.setPreferredWidth(200);
        tc.setCellRenderer(new EventCellRender());
        
        //display countdowns
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                long currentTimeLong = System.currentTimeMillis();
                for (int i = 0; i < eventList.size(); i++) {
                    EventVO eventVO = (EventVO) eventList.get(i);
                    long eventTimeLong = GoHelper.string2Millis(eventVO.eventDate + " " + eventVO.eventTime, "dd/MM/yyyy hh:mm");
                    if (eventTimeLong > currentTimeLong) {
                        eventVO.eventTimeRemaining = GoHelper.getDistanceTime(currentTimeLong, eventTimeLong);
                        //System.out.println("index " + i + " time remaining is:" + eventVO.eventTimeRemaining);
                    }
                }
                eventTable.repaint();
            }
        }, 1000, 1000);
        
        //double click events
        
        eventTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {//点击几次，这里是双击事件
                    int row = eventTable.getSelectedRow();
                    EventVO event = (EventVO) eventTable.getValueAt(row, 0);
                    if(!event.eventName.equalsIgnoreCase("You have no events yet")){
                    OpenEventsUI oeFrm = new OpenEventsUI();
                    //oeFrm.event = event;
                    oeFrm.sourceForm = 1;
                    oeFrm.setEvent(event);
                    oeFrm.setVisible(true);
                    dispose();
                    }
                    
                    ///to do:open event with event.eventId
                    System.out.println("double click ");
                }
            }
        });

        //recommandedEventTable
        recommandEventTable.setRowHeight(50);

        recommandEventTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
        renderer2.setPreferredSize(new Dimension(0, 0));
        recommandEventTable.getTableHeader().setDefaultRenderer(renderer2);

//        EventVO recommandEvent1 = new EventVO();
//        recommandEvent1.eventName = "coastal cycling";
//        recommandEvent1.eventDate = "03/02/2019";
//        recommandEvent1.eventTime = "3:00 PM";
//        recommandEvent1.eventType = "snowboarding";
//
//        EventVO recommandEvent2 = new EventVO();
//        recommandEvent2.eventName = "Pete skating fest";
//        recommandEvent2.eventDate = "03/02/2019";
//        recommandEvent2.eventTime = "11:00 AM";
//        recommandEvent2.eventType = "stakeboarding";
//
//        EventVO recommandEvent3 = new EventVO();
//        recommandEvent3.eventName = "Biking Pedernales state park";
//        recommandEvent3.eventDate = "04/02/2019";
//        recommandEvent3.eventTime = "11:20 AM";
//        recommandEvent3.eventType = "mountain biking";
//
//        EventVO recommandEvent4 = new EventVO();
//        recommandEvent4.eventName = "Full park friday";
//        recommandEvent4.eventDate = "04/02/2019";
//        recommandEvent4.eventTime = "7:00 pM";
//        recommandEvent4.eventType = "snowboarding";
//
//        EventVO recommandEvent5 = new EventVO();
//        recommandEvent5.eventName = "All levels welcome-Clyne cycling";
//        recommandEvent5.eventDate = "04/02/2019";
//        recommandEvent5.eventTime = "3:00 pM";
//        recommandEvent5.eventType = "mountain biking";
//
//        recommandEventList.add(recommandEvent1);
//        recommandEventList.add(recommandEvent2);
//        recommandEventList.add(recommandEvent3);
//        recommandEventList.add(recommandEvent4);
//        recommandEventList.add(recommandEvent5);
        ArrayList<EventVO> recommandEventList = new ArrayList<EventVO>();
        try {
            recommandEventList = GoService.getInstance().getEventsByOtherOrganizers(GoService.currentUserId);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        EventTableModel eventTableModel2 = new EventTableModel(recommandEventList);
        recommandEventTable.setModel(eventTableModel2);
        TableColumnModel tcm2 = recommandEventTable.getColumnModel();
        TableColumn tc2 = tcm2.getColumn(0);
        tc2.setPreferredWidth(200);
        tc2.setCellRenderer(new RecommandedEventCellRender());
        recommandEventTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = recommandEventTable.getSelectedRow();
                    EventVO event = (EventVO) recommandEventTable.getValueAt(row, 0);
                    if(!event.eventName.equalsIgnoreCase("You have no events yet")){
                    OpenEventsUI oeFrm = new OpenEventsUI();
                    //oeFrm.event = event;
                    oeFrm.sourceForm = 1;
                    oeFrm.setEvent(event);
                    oeFrm.setVisible(true);
                    dispose();
                    }
                    
                    ///to do:open event with event.eventId
                    System.out.println("double click ");
                }
            }
        });
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
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        recommandEventLbl = new javax.swing.JLabel();
        newGroupBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        recommandEventTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        myProfileLbl = new javax.swing.JLabel();

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
        dateTxt.setText("08/12/2019 9:00 AM");
        jPanel.add(dateTxt);
        dateTxt.setBounds(610, 20, 134, 16);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Find your next event");
        jPanel.add(jLabel1);
        jLabel1.setBounds(525, 80, 259, 30);

        jLabel2.setText("Days : hours: minutes : seconds");
        jPanel.add(jLabel2);
        jLabel2.setBounds(230, 90, 210, 16);

        jLabel3.setForeground(new java.awt.Color(68, 114, 196));
        jLabel3.setText("\"Do what you can't\" --- Casey Neistat");
        jPanel.add(jLabel3);
        jLabel3.setBounds(30, 20, 260, 16);

        notificationBtn.setBackground(new java.awt.Color(72, 124, 175));
        notificationBtn.setText("Notification");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });
        jPanel.add(notificationBtn);
        notificationBtn.setBounds(610, 40, 140, 35);

        myEventBtn.setBackground(new java.awt.Color(72, 124, 175));
        myEventBtn.setText("My events");
        myEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myEventBtnActionPerformed(evt);
            }
        });
        jPanel.add(myEventBtn);
        myEventBtn.setBounds(460, 40, 140, 35);

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

        recommandEventLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        recommandEventLbl.setText("You might be interested in...");
        jPanel.add(recommandEventLbl);
        recommandEventLbl.setBounds(460, 160, 259, 19);

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sort by time", "sort by popularity", "filter by biking", "filter by skateboarding", "filter by snowboarding" }));
        jComboBox1.setToolTipText("");
        jPanel.add(jComboBox1);
        jComboBox1.setBounds(690, 160, 150, 27);

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
        jScrollPane4.setViewportView(eventTable);

        jPanel.add(jScrollPane4);
        jScrollPane4.setBounds(20, 110, 411, 356);

        myProfileLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/profile-3.png"))); // NOI18N
        myProfileLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileLblMouseClicked(evt);
            }
        });
        jPanel.add(myProfileLbl);
        myProfileLbl.setBounds(770, 14, 60, 60);

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
    class MyMouseAdapter extends java.awt.event.MouseAdapter {

        JLabel label;
        //private int type, value;

        public MyMouseAdapter(final JLabel label) {//, final int type, final int value
            this.label = label;
//                this.type = type;
//                this.value = value;
        }

        public void mouseEntered(java.awt.event.MouseEvent me) {

            label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0xAA, 0xAA, 0xAA)));
        }

        public void mouseExited(java.awt.event.MouseEvent me) {

            label.setBorder(null);
        }
    }
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

    private void myProfileLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileLblMouseClicked
        myProfileUI mpFrm = new myProfileUI();
        mpFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myProfileLblMouseClicked

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
        try {
            UIManager.setLookAndFeel("com.jtatto.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception ee) {

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
    private javax.swing.JLabel myProfileLbl;
    private javax.swing.JButton newGroupBtn;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel recommandEventLbl;
    private javax.swing.JTable recommandEventTable;
    // End of variables declaration//GEN-END:variables
}
