package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FAdminPanel extends javax.swing.JFrame {

    public FAdminPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        AdminName = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddButton.png"))); // NOI18N
        AddBtn.setBorderPainted(false);
        AddBtn.setContentAreaFilled(false);
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 130, 40));

        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        EditBtn.setBorderPainted(false);
        EditBtn.setContentAreaFilled(false);
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 130, 40));

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.setContentAreaFilled(false);
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, 130, 40));

        AdminName.setFont(new java.awt.Font("Gotham Black", 0, 16)); // NOI18N
        AdminName.setForeground(new java.awt.Color(255, 255, 255));
        AdminName.setText("Firstname Lastname");
        getContentPane().add(AdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        Date.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("MM DD, YYYY");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 100, 20));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ExitButton.png"))); // NOI18N
        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, 40));

        JScrollPane.setBackground(new java.awt.Color(40, 40, 40));
        JScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        JScrollPane.setEnabled(false);

        Table.setBackground(new java.awt.Color(40, 40, 40));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
            new String [] {
                "Employee", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoscrolls(false);
        Table.setGridColor(new java.awt.Color(35, 42, 50));
        Table.setName(""); // NOI18N
        Table.setShowGrid(false);
        Table.setShowHorizontalLines(false);
        Table.setShowVerticalLines(false);
        Table.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
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

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 960, 480));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AdminPanel.png"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AdminName;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Date;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ExitButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JTable Table;
    // End of variables declaration//GEN-END:variables
}
