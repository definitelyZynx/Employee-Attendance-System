package ui;

import classes.CAttendance;
import classes.CAttendanceData;
import classes.CAttendanceSegment;
import classes.CEmployee;
import helper.Utils;
import instances.Database;
import instances.Forms;
import java.util.Arrays;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class FAdminPanel extends javax.swing.JFrame
{

    public int DateFilterMonth = 0;
    public int DateFilterYear  = 0;
    
    public enum SessionRequestResult
    {
        SUCCESS,
        ALREADY_LOGGED_IN,
        INSUFFICIENT_CREDENTIALS,
        OCCUPIED_SESSION,
    }
    
    private CEmployee SessionEmployee = null;
    
    public FAdminPanel(CEmployee SessionEmployee_)
    {
        this.SessionEmployee = SessionEmployee_;
        initComponents();
    }

    public SessionRequestResult RequestSession(CEmployee requester)
    {
        if (requester == SessionEmployee)
            return SessionRequestResult.ALREADY_LOGGED_IN;
        
        if (SessionEmployee != null)
            return SessionRequestResult.OCCUPIED_SESSION;
        
        SessionEmployee = requester;
        return SessionRequestResult.SUCCESS;
    }
    
    private void EndSession()
    {
        Forms.Main.DisplayLogin();
        this.dispose();
    }
    
    public void UpdateDateFilter(int Month, int Year)
    {
        this.DateFilterMonth = Month;
        this.DateFilterYear  = Year;
        this.UpdateDateFilter();
    }
    
    public void UpdateDateFilter()
    {
        Date.setText(String.format("%s, %04d", Utils.MonthToText[this.DateFilterMonth - 1], this.DateFilterYear));
        this.LoadToTable();
    }
    
    public void LoadToTable()
    {
        DefaultTableModel TableModel = (DefaultTableModel)Table.getModel();
        TableModel.setRowCount(0);
        
        for (Map.Entry<String, CEmployee> EmployeeKVP : Database.Instance.GetAllEmployees().entrySet())
        {
            CEmployee CurrentEmployee = EmployeeKVP.getValue();
            
            String AttDisplay[] = new String[32];
            Arrays.fill(AttDisplay, "Ø");
            
            AttDisplay[0] = String.join(" ", CurrentEmployee.Personal.GetNames());
            
            CAttendanceData AttData = CurrentEmployee.Attendance.GetAllAttendance().get(this.DateFilterYear);
            
            if (AttData != null)
            {
                CAttendanceSegment AttMonth[][] = AttData.Segments[this.DateFilterMonth];
                for (int Day = 0; Day < 31; Day++)
                {
                    if (AttMonth[Day][CAttendance.TIME_IN] != null && AttMonth[Day][CAttendance.TIME_OUT] == null)
                        AttDisplay[Day + 1] = "?";
                    else if (AttMonth[Day][CAttendance.TIME_IN] != null && AttMonth[Day][CAttendance.TIME_OUT] != null)
                        AttDisplay[Day + 1] = "O";
                }
            }
            
            TableModel.addRow(AttDisplay);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        AdminName = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        SearchTxtfield = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Attendance Panel");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(9999, 9999));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        setType(java.awt.Window.Type.POPUP);
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
        getContentPane().setLayout(null);

        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddButton.png"))); // NOI18N
        AddBtn.setBorderPainted(false);
        AddBtn.setContentAreaFilled(false);
        getContentPane().add(AddBtn);
        AddBtn.setBounds(820, 630, 130, 40);

        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        EditBtn.setBorderPainted(false);
        EditBtn.setContentAreaFilled(false);
        getContentPane().add(EditBtn);
        EditBtn.setBounds(960, 630, 130, 40);

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.setContentAreaFilled(false);
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(1100, 630, 130, 40);

        AdminName.setFont(new java.awt.Font("Gotham Black", 0, 16)); // NOI18N
        AdminName.setForeground(new java.awt.Color(255, 255, 255));
        AdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminName.setText("Firstname Lastname");
        getContentPane().add(AdminName);
        AdminName.setBounds(5, 280, 200, 21);

        Date.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("MM, YYYY");
        Date.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DateMouseClicked(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(1080, 25, 120, 20);

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ExitButton.png"))); // NOI18N
        ExitButton.setAlignmentY(0.0F);
        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        ExitButton.setFocusable(false);
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ExitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(1230, 18, 33, 40);

        SearchTxtfield.setBackground(new java.awt.Color(18, 18, 18));
        SearchTxtfield.setForeground(new java.awt.Color(255, 255, 255));
        SearchTxtfield.setBorder(null);
        getContentPane().add(SearchTxtfield);
        SearchTxtfield.setBounds(300, 640, 210, 16);

        JScrollPane.setBackground(new java.awt.Color(40, 40, 40));
        JScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        JScrollPane.setEnabled(false);

        Table.setBackground(new java.awt.Color(40, 40, 40));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Employee", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoscrolls(false);
        Table.setGridColor(new java.awt.Color(35, 42, 50));
        Table.setName(""); // NOI18N
        Table.setShowGrid(false);
        Table.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0)
        {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(700);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(1).setPreferredWidth(75);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(2).setPreferredWidth(75);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(3).setPreferredWidth(75);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(4).setPreferredWidth(75);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(5).setPreferredWidth(75);
            Table.getColumnModel().getColumn(6).setResizable(false);
            Table.getColumnModel().getColumn(6).setPreferredWidth(75);
            Table.getColumnModel().getColumn(7).setResizable(false);
            Table.getColumnModel().getColumn(7).setPreferredWidth(75);
            Table.getColumnModel().getColumn(8).setResizable(false);
            Table.getColumnModel().getColumn(8).setPreferredWidth(75);
            Table.getColumnModel().getColumn(9).setResizable(false);
            Table.getColumnModel().getColumn(9).setPreferredWidth(75);
            Table.getColumnModel().getColumn(10).setResizable(false);
            Table.getColumnModel().getColumn(11).setResizable(false);
            Table.getColumnModel().getColumn(12).setResizable(false);
            Table.getColumnModel().getColumn(13).setResizable(false);
            Table.getColumnModel().getColumn(14).setResizable(false);
            Table.getColumnModel().getColumn(15).setResizable(false);
            Table.getColumnModel().getColumn(16).setResizable(false);
            Table.getColumnModel().getColumn(17).setResizable(false);
            Table.getColumnModel().getColumn(18).setResizable(false);
            Table.getColumnModel().getColumn(19).setResizable(false);
            Table.getColumnModel().getColumn(20).setResizable(false);
            Table.getColumnModel().getColumn(21).setResizable(false);
            Table.getColumnModel().getColumn(22).setResizable(false);
            Table.getColumnModel().getColumn(23).setResizable(false);
            Table.getColumnModel().getColumn(24).setResizable(false);
            Table.getColumnModel().getColumn(25).setResizable(false);
            Table.getColumnModel().getColumn(26).setResizable(false);
            Table.getColumnModel().getColumn(27).setResizable(false);
            Table.getColumnModel().getColumn(28).setResizable(false);
            Table.getColumnModel().getColumn(29).setResizable(false);
            Table.getColumnModel().getColumn(30).setResizable(false);
            Table.getColumnModel().getColumn(31).setResizable(false);
        }

        getContentPane().add(JScrollPane);
        JScrollPane.setBounds(270, 140, 960, 480);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AdminPanel.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        this.setSize(1296, 759);
        Utils.CenterForm(this);
        
        int now[] = Utils.GetDateDMY();
        this.UpdateDateFilter(now[1], now[2]);
        
        AdminName.setText(String.join(" ", SessionEmployee.Personal.GetNames()));
    }//GEN-LAST:event_formWindowOpened

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ExitButtonMouseClicked
    {//GEN-HEADEREND:event_ExitButtonMouseClicked
        this.EndSession();
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        this.EndSession();
    }//GEN-LAST:event_formWindowClosing

    private void DateMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_DateMouseClicked
    {//GEN-HEADEREND:event_DateMouseClicked
        FSelectorMMYYYY DateSelector = new FSelectorMMYYYY(this);
        DateSelector.setLocationRelativeTo(this);
        DateSelector.setVisible(true);
        
        this.setEnabled(false);
    }//GEN-LAST:event_DateMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AdminName;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Date;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ExitButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JTextField SearchTxtfield;
    private javax.swing.JTable Table;
    // End of variables declaration//GEN-END:variables
}
