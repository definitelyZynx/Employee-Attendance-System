package ui;

import classes.CEmployee;
import instances.Database;
import instances.Forms;

public class FMain extends javax.swing.JFrame
{
    
    public enum SessionRequestResult
    {
        SUCCESS,
        ALREADY_LOGGED_IN,
        INSUFFICIENT_CREDENTIALS,
        OCCUPIED_SESSION,
    }
    
    private CEmployee SessionEmployee = null;
    
    public FMain()
    {
        initComponents();
    }
    
    public SessionRequestResult SetSession(CEmployee requester)
    {
        if (requester == SessionEmployee)
            return SessionRequestResult.ALREADY_LOGGED_IN;
        
        if (SessionEmployee != null)
            return SessionRequestResult.OCCUPIED_SESSION;
        
        // TODO: decide whether SetSession should also check for user privilege for added "security"?
        
        SessionEmployee = requester;
        return SessionRequestResult.SUCCESS;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Attendance System");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(18, 18, 18));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new java.awt.Color(18, 18, 18));
        
        Database.Instance.LoadFromFile();
        
        FLogInMenu LoginSessionWindow = new FLogInMenu();
        LoginSessionWindow.setLocationRelativeTo(this);
        LoginSessionWindow.setVisible(true);
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
