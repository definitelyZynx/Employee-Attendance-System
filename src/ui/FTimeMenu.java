package ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FTimeMenu extends javax.swing.JFrame {
    
    public FTimeMenu() {
        initComponents();
        
        new Thread()
        {
            public void run()
            {
                final String[] _dayToText = new String[]
                {
                    "Sunday",
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday"
                };
                
                while(true){
                    Calendar cal = new GregorianCalendar();
                    
                    Date.setText(new SimpleDateFormat("MM-dd-yyyy").format(new Date()));
                    Clock.setText(String.format("%02d:%02d  %s", cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.AM_PM) == 1 ? "PM" : "AM"));
                    Day.setText(_dayToText[cal.get(Calendar.DAY_OF_WEEK)]);
                    
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {}
                }
            }
            
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clock = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        EmployeeName = new javax.swing.JLabel();
        TimeInOutLabel = new javax.swing.JLabel();
        TimeInOutBtn = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(460, 629));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clock.setFont(new java.awt.Font("Gotham Black", 0, 30)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("00:00 XX");
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 460, -1));

        Day.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Day.setForeground(new java.awt.Color(255, 255, 255));
        Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Day.setText("DAY");
        getContentPane().add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 460, -1));

        Date.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("MM/DD/YYYY");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 460, -1));

        EmployeeName.setFont(new java.awt.Font("Gotham Black", 0, 30)); // NOI18N
        EmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeName.setText("John Doe");
        getContentPane().add(EmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 460, -1));

        TimeInOutLabel.setFont(new java.awt.Font("Gotham Black", 0, 13)); // NOI18N
        TimeInOutLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimeInOutLabel.setText("TIME IN");
        getContentPane().add(TimeInOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 382, 60, 20));

        TimeInOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TimeInOutButton.png"))); // NOI18N
        TimeInOutBtn.setBorderPainted(false);
        TimeInOutBtn.setContentAreaFilled(false);
        getContentPane().add(TimeInOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 270, -1));

        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdminButton.png"))); // NOI18N
        AdminBtn.setBorderPainted(false);
        AdminBtn.setContentAreaFilled(false);
        getContentPane().add(AdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 270, -1));

        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CancelButton.png"))); // NOI18N
        CancelBtn.setBorderPainted(false);
        CancelBtn.setContentAreaFilled(false);
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 460, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TimeMenu.png"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JLabel EmployeeName;
    private javax.swing.JButton TimeInOutBtn;
    private javax.swing.JLabel TimeInOutLabel;
    // End of variables declaration//GEN-END:variables
}