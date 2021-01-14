package ui;

import classes.CEmployee;
import classes.CPrivilege;
import classes.CSector;
import instances.Database;

public class FEmployeeEditor extends javax.swing.JFrame
{

    private FAdminPanel PanelInstance = null;
    private CEmployee   Employee      = null;
    
    public FEmployeeEditor(FAdminPanel PanelInstance_, CEmployee Employee_)
    {
        this.Employee      = Employee_;
        this.PanelInstance = PanelInstance_;
        initComponents();
    }

    private void CloseEditor()
    {
        this.PanelInstance.setEnabled(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FirstnameTxt = new javax.swing.JTextField();
        LastnameTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        KeycodeTxt = new javax.swing.JTextField();
        IDCodeTxt = new javax.swing.JTextField();
        TimeInOut = new javax.swing.JCheckBox();
        BasicInfo = new javax.swing.JCheckBox();
        EmploymentInfo = new javax.swing.JCheckBox();
        AttendanceData = new javax.swing.JCheckBox();
        AllAccess = new javax.swing.JCheckBox();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(458, 629));
        setResizable(false);
        setSize(new java.awt.Dimension(458, 629));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstnameTxt.setBackground(new java.awt.Color(40, 40, 40));
        FirstnameTxt.setForeground(new java.awt.Color(255, 255, 255));
        FirstnameTxt.setBorder(null);
        getContentPane().add(FirstnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 20));

        LastnameTxt.setBackground(new java.awt.Color(40, 40, 40));
        LastnameTxt.setForeground(new java.awt.Color(255, 255, 255));
        LastnameTxt.setBorder(null);
        getContentPane().add(LastnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 20));

        AgeTxt.setBackground(new java.awt.Color(40, 40, 40));
        AgeTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgeTxt.setBorder(null);
        getContentPane().add(AgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 250, 30, 20));

        KeycodeTxt.setBackground(new java.awt.Color(40, 40, 40));
        KeycodeTxt.setForeground(new java.awt.Color(255, 255, 255));
        KeycodeTxt.setBorder(null);
        getContentPane().add(KeycodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 130, 20));

        IDCodeTxt.setBackground(new java.awt.Color(40, 40, 40));
        IDCodeTxt.setForeground(new java.awt.Color(255, 255, 255));
        IDCodeTxt.setBorder(null);
        getContentPane().add(IDCodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 130, 20));

        TimeInOut.setBackground(new java.awt.Color(40, 40, 40));
        TimeInOut.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        TimeInOut.setForeground(new java.awt.Color(255, 255, 255));
        TimeInOut.setText("Time In / Time Out");
        TimeInOut.setContentAreaFilled(false);
        getContentPane().add(TimeInOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 140, 30));

        BasicInfo.setBackground(new java.awt.Color(40, 40, 40));
        BasicInfo.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        BasicInfo.setForeground(new java.awt.Color(255, 255, 255));
        BasicInfo.setText("Basic Info");
        BasicInfo.setContentAreaFilled(false);
        getContentPane().add(BasicInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 140, 30));

        EmploymentInfo.setBackground(new java.awt.Color(40, 40, 40));
        EmploymentInfo.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        EmploymentInfo.setForeground(new java.awt.Color(255, 255, 255));
        EmploymentInfo.setText("Employment Info");
        EmploymentInfo.setContentAreaFilled(false);
        getContentPane().add(EmploymentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 140, 30));

        AttendanceData.setBackground(new java.awt.Color(40, 40, 40));
        AttendanceData.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        AttendanceData.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceData.setText("Attendance Data");
        AttendanceData.setContentAreaFilled(false);
        getContentPane().add(AttendanceData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 140, 30));

        AllAccess.setBackground(new java.awt.Color(40, 40, 40));
        AllAccess.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        AllAccess.setForeground(new java.awt.Color(255, 255, 255));
        AllAccess.setText("All Access");
        AllAccess.setContentAreaFilled(false);
        getContentPane().add(AllAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 140, 30));

        ConfirmButton.setFont(new java.awt.Font("Gotham Black", 0, 10)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(0, 0, 0));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SmallAddButton.png"))); // NOI18N
        ConfirmButton.setText("ADD");
        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 100, -1));

        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SmallCancelButton.png"))); // NOI18N
        CancelButton.setBorderPainted(false);
        CancelButton.setContentAreaFilled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 100, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddBG.png"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        String Mode = this.Employee == null ? "ADD" : "EDIT";
        this.setTitle(Mode + " Employee");
        ConfirmButton.setText(Mode);
        
        // Load data to forms
        if (this.Employee != null)
        {
            String Name[] = Employee.Personal.GetNames();
            FirstnameTxt.setText(Name[0]);
            LastnameTxt.setText(Name[1]);
            
            AgeTxt.setText(Employee.Personal.GetAge() + "");
            
            IDCodeTxt.setText(Employee.Employment.GetIDCode(Employee));
            KeycodeTxt.setText(Employee.Employment.GetPassword(Employee));
            
            TimeInOut.setSelected(Employee.Privilege.HasPriviledge(CPrivilege.TIME_IN | CPrivilege.TIME_OUT));
            BasicInfo.setSelected(Employee.Privilege.HasPriviledge(CPrivilege.ACCESS_BASIC_INFO | CPrivilege.CHANGE_BASIC_INFO));
            EmploymentInfo.setSelected(Employee.Privilege.HasPriviledge(CPrivilege.ACCESS_EMPLOYMENT_INFO | CPrivilege.CHANGE_EMPLOYMENT_INFO));
            AttendanceData.setSelected(Employee.Privilege.HasPriviledge(CPrivilege.ACCESS_ATTENDANCE_DATA | CPrivilege.CHANGE_ATTENDANCE_DATA));
            AllAccess.setSelected(Employee.Privilege.GetFlag() == CPrivilege.ALL_PRIVILEGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        this.CloseEditor();
    }//GEN-LAST:event_formWindowClosing

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
        this.CloseEditor();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmButtonActionPerformed
    {//GEN-HEADEREND:event_ConfirmButtonActionPerformed
        
        // TODO: add checks
        
        int Privilege = 0;
            
        if (TimeInOut.isSelected())
            Privilege |= CPrivilege.TIME_IN | CPrivilege.TIME_OUT;
            
        if (BasicInfo.isSelected())
            Privilege |= CPrivilege.ACCESS_BASIC_INFO | CPrivilege.CHANGE_BASIC_INFO;
            
        if (EmploymentInfo.isSelected())
            Privilege |= CPrivilege.ACCESS_EMPLOYMENT_INFO | CPrivilege.CHANGE_EMPLOYMENT_INFO;
            
        if (AttendanceData.isSelected())
            Privilege |= CPrivilege.ACCESS_ATTENDANCE_DATA | CPrivilege.CHANGE_ATTENDANCE_DATA;
            
        if (AllAccess.isSelected())
            Privilege = CPrivilege.ALL_PRIVILEGE;
        
        if (this.Employee == null)
        {
            Database.Instance.EmployeeRegister(FirstnameTxt.getText(), LastnameTxt.getText(), Integer.parseInt(AgeTxt.getText()), IDCodeTxt.getText(), KeycodeTxt.getText(), 0, Privilege);
        }
        else
        {
            Employee.Personal.ModifyValues(Employee, FirstnameTxt.getText(), LastnameTxt.getText(), Integer.parseInt(AgeTxt.getText()));
            Employee.Employment.ModifyValues(Employee, IDCodeTxt.getText(), KeycodeTxt.getText(), new CSector(0));
            Employee.Privilege = new CPrivilege(Privilege);
        }
        
        Database.Instance.SaveToFile();
        this.PanelInstance.LoadToTable();
        this.CloseEditor();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JCheckBox AllAccess;
    private javax.swing.JCheckBox AttendanceData;
    private javax.swing.JLabel Background;
    private javax.swing.JCheckBox BasicInfo;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JCheckBox EmploymentInfo;
    private javax.swing.JTextField FirstnameTxt;
    private javax.swing.JTextField IDCodeTxt;
    private javax.swing.JTextField KeycodeTxt;
    private javax.swing.JTextField LastnameTxt;
    private javax.swing.JCheckBox TimeInOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
