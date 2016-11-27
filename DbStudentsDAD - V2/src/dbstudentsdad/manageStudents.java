package dbstudentsdad;

//@author Pleymo

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class manageStudents {
    
    private connectionClass clConnect;
    private ResultSet result;
    
    public manageStudents(connectionClass connect) throws SQLException {
        clConnect = connect;
    }
    
    public Student showStudent (String idRegister) throws SQLException {
        Student student = new Student();
        String sql = "select * from alumnos where registro = " + idRegister;
        clConnect.execQuerry(sql);
        result = clConnect.getResult(); 
        // 
        result.next();
        student.setRegistry(idRegister);
        student.setDni(result.getString("dni"));
        student.setName(result.getString("nombre"));
        student.setSurname1(result.getString("apellido1"));
        student.setSurname2(result.getString("apellido2"));
        return student;
    }
    
    public void registerUser (Student student) throws SQLException{
        String sql = "INSERT INTO alumnos(dni, nombre, apellido1, apellido2) VALUES "
                                    +"('"+student.getDni()
                                    +"','"+student.getName()
                                    +"','"+student.getSurname1()
                                    +"','"+student.getSurname2()+"');";
        if(clConnect.execQuerryUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Alta Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }  
    
    public void deregisterUser (Student student) throws SQLException{
        String sql = "delete from alumnos where registro = " + student.getRegistry()+"";
        if (clConnect.execQuerryUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Baja Correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public void modify (Student student) throws SQLException {
        String sql = "update alumnos set dni = '" + student.getDni()
                                + "', nombre = '" + student.getName()
                                + "', apellido1 = '" + student.getSurname1()
                                + "', apellido2 = '" + student.getSurname2()
                                + "' where registro = " + student.getRegistry()+"";
        if(clConnect.execQuerryUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Modificación Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public void fillTable(String querry){
        try {
            clConnect.execQuerry(querry);
            result = clConnect.getResult();
        } catch (SQLException exc) {
            Logger.getLogger(manageStudents.class.getName()).log(Level.SEVERE, null, exc);
        }
    }
    
    public void fillTableQuerry(String querry){
        try {
                clConnect.execQuerry("SELECT * from alumnos where registro like '%" + querry
                                                            +"%' or dni like '%" + querry
                                                            +"%' or nombre like '%" + querry
                                                            +"%' or apellido1 like '%" + querry
                                                            +"%' or apellido2 like'%" + querry + "%'");
                result = clConnect.getResult();
        } catch (SQLException exc) {
            Logger.getLogger(manageStudents.class.getName()).log(Level.SEVERE, null, exc);
        }
    }


    public ResultSet getResult() {
        return result;
    }
    
}