package dbstudentsdad;

//@author Pleymo

import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;


public class FrmView extends javax.swing.JFrame {
    
    private tableView tabView = null;
    private eventClass events;
    
    public FrmView (ResultSet table, eventClass event) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            events = event;
            // Buttons Events
            btnRegister.addActionListener(events);
            btnDeRegister.addActionListener(events);
            btnModify.addActionListener(events);
            btnExit.addActionListener(events);
            // View of the table
            tabView = new tableView(table);
            studentTable.setModel(tabView);
            // Table events
            studentTable.addMouseListener(events);
            // Document Event
            txtSearcher.getDocument().addDocumentListener(events);
        } catch (Exception ex) { }
    }
    
    // WARNING: Do NOT modify this code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentScrollPanel = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        StudentFieldsPanel = new javax.swing.JPanel();
        lblIDRegister = new javax.swing.JLabel();
        txtIDRegister = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSurname1 = new javax.swing.JLabel();
        txtSurname1 = new javax.swing.JTextField();
        lblSurname2 = new javax.swing.JLabel();
        txtSurname2 = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        StudentButtonsPanel = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnDeRegister = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblSearcher = new javax.swing.JLabel();
        txtSearcher = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        StudentScrollPanel.setViewportView(studentTable);

        lblIDRegister.setText("Registro");

        lblName.setText("Nombre");

        txtName.setToolTipText("");

        lblSurname1.setText("Apellido1");

        lblSurname2.setText("Apellido2");

        lblDni.setText("Dni");

        javax.swing.GroupLayout StudentFieldsPanelLayout = new javax.swing.GroupLayout(StudentFieldsPanel);
        StudentFieldsPanel.setLayout(StudentFieldsPanelLayout);
        StudentFieldsPanelLayout.setHorizontalGroup(
            StudentFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIDRegister)
                    .addComponent(txtIDRegister)
                    .addComponent(lblName)
                    .addComponent(txtName)
                    .addComponent(lblSurname1)
                    .addComponent(txtSurname1)
                    .addComponent(lblSurname2)
                    .addComponent(txtSurname2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblDni)
                    .addComponent(txtDni))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        StudentFieldsPanelLayout.setVerticalGroup(
            StudentFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFieldsPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblIDRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSurname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSurname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegister.setText("Dar de Alta");
        btnRegister.setMaximumSize(new java.awt.Dimension(90, 25));
        btnRegister.setMinimumSize(new java.awt.Dimension(90, 25));
        btnRegister.setPreferredSize(new java.awt.Dimension(99, 25));

        btnDeRegister.setText("Dar de Baja");
        btnDeRegister.setMinimumSize(new java.awt.Dimension(90, 25));
        btnDeRegister.setPreferredSize(new java.awt.Dimension(70, 25));

        btnModify.setText("Modificar");

        btnExit.setText("Salir");
        btnExit.setMaximumSize(new java.awt.Dimension(90, 25));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 25));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios.png"))); // NOI18N

        javax.swing.GroupLayout StudentButtonsPanelLayout = new javax.swing.GroupLayout(StudentButtonsPanel);
        StudentButtonsPanel.setLayout(StudentButtonsPanelLayout);
        StudentButtonsPanelLayout.setHorizontalGroup(
            StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentButtonsPanelLayout.createSequentialGroup()
                        .addGroup(StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        StudentButtonsPanelLayout.setVerticalGroup(
            StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentButtonsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StudentButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModify)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImage)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblSearcher.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(StudentFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StudentButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(StudentScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearcher)
                .addGap(18, 18, 18)
                .addComponent(txtSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearcher)
                    .addComponent(txtSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StudentScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentFieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StudentButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StudentButtonsPanel;
    private javax.swing.JPanel StudentFieldsPanel;
    private javax.swing.JScrollPane StudentScrollPanel;
    private javax.swing.JButton btnDeRegister;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblIDRegister;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearcher;
    private javax.swing.JLabel lblSurname1;
    private javax.swing.JLabel lblSurname2;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIDRegister;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearcher;
    private javax.swing.JTextField txtSurname1;
    private javax.swing.JTextField txtSurname2;
    // End of variables declaration//GEN-END:variables


    // Buttons getters 
    
    public JButton getBtnRegister() {
        return btnRegister;
    }
    
    public JButton getBtnDeRegister() {
        return btnDeRegister;
    }

    public JButton getBtnModify() {
        return btnModify;
    }

    public JButton getBtnExit() {
        return btnExit;
    }
    
    
    // Text Fields getters

    public JTextField getTxtIDRegister() {
        return txtIDRegister;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtSurname1() {
        return txtSurname1;
    }

    public JTextField getTxtSurname2() {
        return txtSurname2;
    }

    public JTextField getTxtSearcher() {
        return txtSearcher;
    }

    
    // Table getter
    
    public JTable getStudentTable() {
        return studentTable;
    }

    public tableView getTabView() {
        return tabView;
    }
    
}
