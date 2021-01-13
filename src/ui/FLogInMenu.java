package ui;

import classes.*;
import instances.Database;
import instances.Forms;
import popups.FirstTimeSetup;
import popups.AdminAccountCreated;
import java.awt.Color;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FLogInMenu extends javax.swing.JFrame
{

    public FLogInMenu()
    {
        initComponents();
    }

    public void ClearFields()
    {
        IDTxtField.setText("ID Code");
        IDTxtField.setForeground(new Color(153, 153, 153));
        
        KeyTxtField.setText("Key Code");
        KeyTxtField.setForeground(new Color(153, 153, 153));
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
    
    private boolean ValidateInput()
    {
        return !IDTxtField.getText().isEmpty() && !IDTxtField.getText().equals("ID Code") && !KeyTxtField.getText().isEmpty() && !KeyTxtField.getText().equals("Key Code");
    }
    
    public void FinalLogin()
    {
        LblNotification.setText("");
        
        CEmployee Employee = Database.Instance.ChallengeAuthentication(IDTxtField.getText(), KeyTxtField.getText());
        
        if (Employee == null)
        {
            LblNotification.setText("Invalid Password!");
            return;
        }
        
        FTimeMenu TimeSessionWindow = new FTimeMenu(this, Employee);
        TimeSessionWindow.setLocationRelativeTo(this);
        TimeSessionWindow.setVisible(true);
        
        this.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblDebug = new javax.swing.JLabel();
        LblNotification = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        IDTxtField = new javax.swing.JTextField();
        KeyTxtField = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        lblDebug.setForeground(new java.awt.Color(255, 0, 0));
        lblDebug.setText("[ DEBUG ]");
        lblDebug.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblDebugMouseClicked(evt);
            }
        });
        getContentPane().add(lblDebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, -1));

        LblNotification.setFont(new java.awt.Font("Gotham Light", 0, 14)); // NOI18N
        LblNotification.setForeground(new java.awt.Color(255, 51, 51));
        LblNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNotification.setToolTipText("");
        getContentPane().add(LblNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 460, -1));

        BtnLogin.setBackground(null);
        BtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(0, 0, 0));
        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LoginButton.png"))); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.setToolTipText("");
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        Forms.Main.setEnabled(false);
    }//GEN-LAST:event_formWindowClosing

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnLoginActionPerformed
    {//GEN-HEADEREND:event_BtnLoginActionPerformed
        // TODO: Change the button font
        
        if (!ValidateInput())
        {
            LblNotification.setText("Invalid Input!");
            return;
        }
        
        // TODO: maybe make this look better
        if (Database.Instance.CountEmployees() == 0)
        {
            Database.Instance.EmployeeRegister("First Name", "Last Name", 1, IDTxtField.getText(), KeyTxtField.getText(), 0, CPrivilege.ALL_PRIVILEGE);
            AdminAccountCreated AccountCreated = new AdminAccountCreated(this);
            AccountCreated.setLocationRelativeTo(this);
            AccountCreated.setVisible(true);
            
            BtnLogin.setText("Login");
            Database.Instance.SaveToFile();
            
            return;
        }
        
        this.FinalLogin();
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        BtnLogin.requestFocus();
        
        // TODO: maybe make this look better
        if (Database.Instance.CountEmployees() == 0)
        {
            FirstTimeSetup DisplayWarning = new FirstTimeSetup();
            DisplayWarning.setLocationRelativeTo(this);
            DisplayWarning.setVisible(true);
            BtnLogin.setText("Register");
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void lblDebugMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblDebugMouseClicked
    {//GEN-HEADEREND:event_lblDebugMouseClicked
        new FDebug().setVisible(true);
    }//GEN-LAST:event_lblDebugMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextField IDTxtField;
    private javax.swing.JTextField KeyTxtField;
    private javax.swing.JLabel LblNotification;
    private javax.swing.JLabel lblDebug;
    // End of variables declaration//GEN-END:variables
}
