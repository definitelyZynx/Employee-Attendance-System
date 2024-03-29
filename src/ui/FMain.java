package ui;

import classes.CEmployee;
import instances.Database;
import instances.Forms;

public class FMain extends javax.swing.JFrame
{
    
    public FMain()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee Attendance System");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(18, 18, 18));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void DisplayLogin()
    {
        FLogInMenu LoginSessionWindow = new FLogInMenu();
        LoginSessionWindow.setLocationRelativeTo(this);
        LoginSessionWindow.setVisible(true);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new java.awt.Color(18, 18, 18));
        
        Database.Instance.LoadFromFile();
        
        DisplayLogin();
        this.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Forms.Main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
