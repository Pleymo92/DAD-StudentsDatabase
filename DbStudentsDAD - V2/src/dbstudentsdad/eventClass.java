package dbstudentsdad;

//@author Pleymo

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class eventClass implements ActionListener, MouseListener, DocumentListener{
    
    private connectionClass clConnect;
    private manageStudents manage;
    private FrmView frm;
    
    public eventClass() throws SQLException {
        clConnect = new connectionClass();
        clConnect.execQuerry("select * from alumnos");
        manage = new manageStudents(clConnect);
        frm = new FrmView(clConnect.getResult(), this);
        frm.setVisible(true);
        //refreshTable();
    }

    public void refreshTable(){
        manage.fillTable("select * from alumnos");
        frm.getStudentTable().setModel(new tableView(manage.getResult()));
    }
    
    public void refreshTableQuerry(String querry) {
        manage.fillTableQuerry(querry);
        frm.getStudentTable().setModel(new tableView(manage.getResult()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            int row = frm.getStudentTable().getSelectedRow();
            String id = String.valueOf(frm.getStudentTable().getValueAt(row, 0));
            //
            Student student = manage.showStudent(id);
            frm.getTxtIDRegister().setText(student.getRegistry());
            frm.getTxtDni().setText(student.getDni());
            frm.getTxtName().setText(student.getName());
            frm.getTxtSurname1().setText(student.getSurname1());
            frm.getTxtSurname2().setText(student.getSurname2());
        } catch (SQLException ex) {
            Logger.getLogger(eventClass.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }    
    
    //TODO: put the events here
    @Override
    public void actionPerformed(ActionEvent events) {
        // button Register
        if(events.getSource()== frm.getBtnRegister()) {
            try {
                Student student = new Student();
                student.setDni(frm.getTxtDni().getText());
                student.setName(frm.getTxtName().getText());
                student.setSurname1(frm.getTxtSurname1().getText());
                student.setSurname2(frm.getTxtSurname2().getText());
                manage.registerUser(student);
            }catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // button Deregister
        if(events.getSource()==frm.getBtnDeRegister()) {
            try {
                Student student= new Student();
                student.setRegistry(frm.getTxtIDRegister().getText());
                manage.deregisterUser(student);
            }catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // button Modify
        if(events.getSource()==frm.getBtnModify()){
            try {
                Student student= new Student();
                student.setRegistry(frm.getTxtIDRegister().getText());
                student.setDni(frm.getTxtDni().getText());
                student.setName(frm.getTxtName().getText());
                student.setSurname1(frm.getTxtSurname1().getText());
                student.setSurname2(frm.getTxtSurname2().getText());
                manage.modify(student);
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // button Exit
        if(events.getSource()==frm.getBtnExit()) { 
            System.exit(frm.DISPOSE_ON_CLOSE); 
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {    }

    @Override
    public void mouseExited(MouseEvent e) {    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        String txtfield="";
        txtfield = frm.getTxtSearcher().getText();
        if(txtfield.equals("")){
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String txtfield="";
        txtfield = frm.getTxtSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        String txtfield="";
        txtfield = frm.getTxtSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }
}
