package ui;

import classes.*;
import instances.Forms;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class FTimeMenu extends javax.swing.JFrame
{
    private FLogInMenu LogInInstance = null;
    private CEmployee Employee = null;
    
    public FTimeMenu(FLogInMenu LogInInstance_, CEmployee Employee_)
    {
        this.LogInInstance = LogInInstance_;
        this.Employee      = Employee_;
        initComponents();
        
        new Thread()
        {
            @Override
            public void run()
            {
                final String[] _dayToText = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
                
                while(true)
                {
                    Calendar cal = new GregorianCalendar();
                    
                    Date.setText(new SimpleDateFormat("MM-dd-yyyy").format(new Date()));
                    Clock.setText(String.format("%02d:%02d  %s", cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.AM_PM) == 1 ? "PM" : "AM"));
                    Day.setText(_dayToText[cal.get(Calendar.DAY_OF_WEEK) - 1]);
                    
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {}
                }
            }
            
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

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
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
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

        TimeInOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TimeInOutButton.png"))); // NOI18N
        TimeInOutBtn.setBorderPainted(false);
        TimeInOutBtn.setContentAreaFilled(false);
        getContentPane().add(TimeInOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 270, -1));

        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AdminButton.png"))); // NOI18N
        AdminBtn.setBorderPainted(false);
        AdminBtn.setContentAreaFilled(false);
        AdminBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AdminBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 270, -1));

        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CancelButton.png"))); // NOI18N
        CancelBtn.setBorderPainted(false);
        CancelBtn.setContentAreaFilled(false);
        CancelBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 460, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TimeMenu.png"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelBtnActionPerformed
    {//GEN-HEADEREND:event_CancelBtnActionPerformed
        LogInInstance.ClearFields();
        LogInInstance.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        EmployeeName.setText(String.join(" ", Employee.Personal.GetNames()));
        AdminBtn.setVisible(Employee.Privilege.HasPriviledge(CPrivilege.ACCESS_ATTENDANCE_DATA | CPrivilege.ACCESS_EMPLOYMENT_INFO | CPrivilege.CHANGE_ATTENDANCE_DATA | CPrivilege.CHANGE_BASIC_INFO | CPrivilege.CHANGE_EMPLOYMENT_INFO));
    }//GEN-LAST:event_formWindowOpened

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AdminBtnActionPerformed
    {//GEN-HEADEREND:event_AdminBtnActionPerformed
        FMain.SessionRequestResult Request = Forms.Main.RequestSession(Employee);
        if (Request != FMain.SessionRequestResult.SUCCESS)
        {
            JOptionPane.showMessageDialog(this, "Failed to create session due to: " + Request.name(), "Request Session", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        Forms.Main.setEnabled(true);
        LogInInstance.dispose();
        this.dispose();
    }//GEN-LAST:event_AdminBtnActionPerformed


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
