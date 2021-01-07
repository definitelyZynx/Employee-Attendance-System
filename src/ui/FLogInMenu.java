package ui;

import classes.*;
import instances.Database;
import java.awt.Color;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class FLogInMenu extends javax.swing.JFrame {
    
    private FMain MainInstance = null;
    
    public FLogInMenu(FMain MainInstance_)
    {
        this.MainInstance = MainInstance_;    
        initComponents();
    }

    public void ClearFields()
    {
        IDTxtField.setText("");
        KeyTxtField.setText("");
    }
    
    private void HandleInputPostEvent(java.awt.event.FocusEvent event, String subtext)
    {
        JTextField Sender = (JTextField)event.getComponent();
        
        if (event.getID() == FocusEvent.FOCUS_LOST && (Sender.getText().isEmpty() || Sender.getText().equals(subtext)))
        {
            Sender.setText(subtext);
            Sender.setForeground(new Color(153, 153, 153));
        }
        else if (event.getID() == FocusEvent.FOCUS_GAINED && Sender.getText().equals(subtext))
        {
            Sender.setText("");
            Sender.setForeground(new Color(255, 255, 255));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LblNotification = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        IDTxtField = new javax.swing.JTextField();
        KeyTxtField = new javax.swing.JTextField();
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
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNotification.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        LblNotification.setForeground(new java.awt.Color(255, 51, 51));
        LblNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNotification.setToolTipText("");
        getContentPane().add(LblNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 460, -1));

        BtnLogin.setBackground(null);
        BtnLogin.setForeground(null);
        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LoginButton.png"))); // NOI18N
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

        IDTxtField.setBackground(new java.awt.Color(18, 18, 18));
        IDTxtField.setForeground(new java.awt.Color(153, 153, 153));
        IDTxtField.setText("ID Code");
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
        KeyTxtField.setForeground(new java.awt.Color(153, 153, 153));
        KeyTxtField.setText("Key Code");
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

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogInMenu.PNG"))); // NOI18N
        Background.setText("jLabel2");
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTxtFieldFocusGained
        HandleInputPostEvent(evt, "ID Code");
    }//GEN-LAST:event_IDTxtFieldFocusGained

    private void IDTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTxtFieldFocusLost
        HandleInputPostEvent(evt, "ID Code");
    }//GEN-LAST:event_IDTxtFieldFocusLost

    private void KeyTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyTxtFieldFocusGained
        HandleInputPostEvent(evt, "Key Code");
    }//GEN-LAST:event_KeyTxtFieldFocusGained

    private void KeyTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyTxtFieldFocusLost
        HandleInputPostEvent(evt, "Key Code");
    }//GEN-LAST:event_KeyTxtFieldFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        MainInstance.setEnabled(false);
    }//GEN-LAST:event_formWindowClosing

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnLoginActionPerformed
    {//GEN-HEADEREND:event_BtnLoginActionPerformed
        CEmployee Employee = Database.Instance.ChallengeAuthentication(IDTxtField.getText(), KeyTxtField.getText());
        
        if (Employee == null)
        {
            LblNotification.setText("Invalid Password!");
            return;
        }
        
        FTimeMenu TimeSessionWindow = new FTimeMenu(MainInstance, this, Employee);
        TimeSessionWindow.setLocationRelativeTo(this);
        TimeSessionWindow.setVisible(true);
        
        this.setEnabled(false);
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        BtnLogin.requestFocus();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextField IDTxtField;
    private javax.swing.JTextField KeyTxtField;
    private javax.swing.JLabel LblNotification;
    // End of variables declaration//GEN-END:variables
}
