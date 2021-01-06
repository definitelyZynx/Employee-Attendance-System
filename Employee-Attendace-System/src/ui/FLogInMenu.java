package ui;

import classes.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FLogInMenu extends javax.swing.JFrame {
    
    private FMain MainInstance = null;
    
    public FLogInMenu(FMain MainInstance_) {
        
        this.MainInstance = MainInstance_;
        
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
                    Day.setText(_dayToText[cal.get(Calendar.DAY_OF_WEEK) - 1]);
                    
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
    private void initComponents()
    {

        Clock = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        LblNotification = new javax.swing.JLabel();
        IDTxtField = new javax.swing.JTextField();
        KeyTxtField = new javax.swing.JTextField();
        BtnLogin = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(460, 630));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clock.setFont(new java.awt.Font("Gotham Black", 0, 30)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("00:00 XX");
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 460, -1));

        Day.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Day.setForeground(new java.awt.Color(255, 255, 255));
        Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Day.setText("DAY");
        getContentPane().add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 200, 460, -1));

        Date.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("MM/DD/YYYY");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 460, -1));

        LblNotification.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        LblNotification.setForeground(new java.awt.Color(255, 51, 51));
        LblNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNotification.setToolTipText("");
        getContentPane().add(LblNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 460, -1));

        IDTxtField.setBackground(new java.awt.Color(18, 18, 18));
        IDTxtField.setForeground(new java.awt.Color(255, 255, 255));
        IDTxtField.setToolTipText("ID Code");
        IDTxtField.setBorder(null);
        IDTxtField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                IDTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                IDTxtFieldFocusLost(evt);
            }
        });
        getContentPane().add(IDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, 30));

        KeyTxtField.setBackground(new java.awt.Color(18, 18, 18));
        KeyTxtField.setForeground(new java.awt.Color(255, 255, 255));
        KeyTxtField.setBorder(null);
        KeyTxtField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                KeyTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                KeyTxtFieldFocusLost(evt);
            }
        });
        getContentPane().add(KeyTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 414, 200, 30));

        BtnLogin.setBackground(null);
        BtnLogin.setForeground(null);
        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginButton.png"))); // NOI18N
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 280, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogInMenuBG.png"))); // NOI18N
        Background.setText("jLabel2");
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTxtFieldFocusGained
        IDTxtField.setText("");
    }//GEN-LAST:event_IDTxtFieldFocusGained

    private void IDTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTxtFieldFocusLost
        if(IDTxtField.getText().isEmpty())
        {
            IDTxtField.setText("ID Code");
            IDTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_IDTxtFieldFocusLost

    private void KeyTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyTxtFieldFocusGained
        KeyTxtField.setText("");
    }//GEN-LAST:event_KeyTxtFieldFocusGained

    private void KeyTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyTxtFieldFocusLost
        if(KeyTxtField.getText().isEmpty())
        {
            KeyTxtField.setText("Key Code");
            KeyTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_KeyTxtFieldFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        MainInstance.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnLoginActionPerformed
    {//GEN-HEADEREND:event_BtnLoginActionPerformed
      
        CEmployee Employee = MainInstance.ChallengeAuth(IDTxtField.getText(), KeyTxtField.getText());
        
        if (Employee == null)
        {
            LblNotification.setText("Invalid Password!");
            return;
        }
        
        MainInstance.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_BtnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JTextField IDTxtField;
    private javax.swing.JTextField KeyTxtField;
    private javax.swing.JLabel LblNotification;
    // End of variables declaration//GEN-END:variables
}
