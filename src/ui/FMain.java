package ui;

import classes.*;
import java.util.*;
import com.google.gson.*;

public class FMain extends javax.swing.JFrame
{
    private ArrayList<CEmployee> EmployeeList = new ArrayList<CEmployee>();
    private Gson gson = new Gson();
    private CEmployee CurrentlyAuthenticatedAccount = null;
    
    public FMain()
    {
        initComponents();
        EmployeeList.add(new CEmployee(
                new CInfoPersonal(null, "Admin", "Debug", 20),
                new CInfoEmployment("0000", "1234", new CSector()),
                new CPrivilege(CPrivilege.ALL_PRIVILEGE)));
    }
    
    public CEmployee ChallengeAuth(String IDCode, String Password)
    {
        for (CEmployee Employee : EmployeeList)
            if (Employee.Employment.CheckCredentials(IDCode, Password))
                return Employee;
        
        return null;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new java.awt.Color(18, 18, 18));
        
        FLogInMenu LoginSessionWindow = new FLogInMenu(this);
        LoginSessionWindow.setLocationRelativeTo(this);
        LoginSessionWindow.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
