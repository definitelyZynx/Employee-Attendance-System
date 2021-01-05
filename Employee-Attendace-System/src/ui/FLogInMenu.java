package ui;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FLogInMenu extends javax.swing.JFrame {
    
    public FLogInMenu() {
        initComponents();
        
        new Thread()
        {
            public void run()
            {
                while(true){
                    Calendar cal = new GregorianCalendar();
                    Date d = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    
                    int hour = cal.get(Calendar.HOUR);
                    int minute = cal.get(Calendar.MINUTE);
                    int period = cal.get(Calendar.AM_PM);
                    int day = cal.get(Calendar.DAY_OF_WEEK);
                    
                    String day_night = "";
                    String hourTxt = "";
                    String minuteTxt = "";
                    String dayText = "";
                    
                    switch(day)
                    {
                        case 1:
                            dayText = "Sunday";
                            break;
                        case 2:
                            dayText = "Monday";
                            break;
                        case 3:
                            dayText = "Tuesday";
                            break;
                        case 4:
                            dayText = "Wednesday";
                            break;
                        case 5:
                            dayText = "Thursday";
                            break;
                        case 6:
                            dayText = "Friday";
                            break;
                        case 7:
                            dayText = "Saturday";
                            break;
                    }
                    
                    //  1 = PM , 0 = AM
                    if(period == 1)
                        day_night = " PM";
                    else
                        day_night = " AM";
                    
                    // Add 0 if hour is < 10
                    if(hour < 10)
                        hourTxt = "0" + hour;
                    else
                        hourTxt = "" + hour;
                    
                    // Add 0 if minute is < 10
                    if(minute < 10)
                        minuteTxt = "0" + minute;
                    else
                        minuteTxt = "" + minute;
                        
                    String time = hourTxt + ":" + minuteTxt + day_night;
                    
                    Date.setText(dateFormat.format(d));
                    Clock.setText(time);
                    Day.setText(dayText);
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
        IDTxtField = new javax.swing.JTextField();
        KeyTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clock.setFont(new java.awt.Font("Gotham Black", 0, 30)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setText("06:22 PM");
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        Day.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Day.setForeground(new java.awt.Color(255, 255, 255));
        Day.setText("Monday");
        getContentPane().add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        Date.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("01/05/2021");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        IDTxtField.setBackground(new java.awt.Color(18, 18, 18));
        IDTxtField.setForeground(new java.awt.Color(255, 255, 255));
        IDTxtField.setToolTipText("ID Code");
        IDTxtField.setBorder(null);
        IDTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDTxtFieldFocusLost(evt);
            }
        });
        getContentPane().add(IDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, 30));

        KeyTxtField.setBackground(new java.awt.Color(18, 18, 18));
        KeyTxtField.setForeground(new java.awt.Color(255, 255, 255));
        KeyTxtField.setBorder(null);
        KeyTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KeyTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                KeyTxtFieldFocusLost(evt);
            }
        });
        getContentPane().add(KeyTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 414, 200, 30));

        jButton1.setBackground(null);
        jButton1.setForeground(null);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 280, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogInMenuBG.png"))); // NOI18N
        Background.setText("jLabel2");
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogInMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JTextField IDTxtField;
    private javax.swing.JTextField KeyTxtField;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
