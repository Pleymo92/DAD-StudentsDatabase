package dbstudentsdad;

//@author Pleymo

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class manageStudents {
    
    private connectionClass clConnect;
    private ResultSet tableContent;
    
    public manageStudents(connectionClass connect) throws SQLException {
        clConnect = connect;
    }
    
    public Student showStudent (String idRegister) throws SQLException {
        Student student = new Student();
        String sql = "select * from alumnos where registro = "+idRegister;
        clConnect.execQuery(sql);
        tableContent = clConnect.getResult(); 
        // 
        tableContent.next();
        student.setRegistry(idRegister);
        student.setDni(tableContent.getString(2));
        student.setName(tableContent.getString("nombre"));
        student.setSurname1(tableContent.getString("apellido1"));
        student.setSurname2(tableContent.getString("apellido2"));
        return student;
    }
    
    public void registerUser (Student student) throws SQLException{
        String sql="INSERT INTO alumnos(dni, nombre, apellido1, apellido2) VALUES "
                                    +"('"+student.getDni()
                                    +"','"+student.getName()
                                    +"','"+student.getSurname1()
                                    +"','"+student.getSurname2()+"');";
        if(clConnect.execQueryUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Alta Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }  
    
    public void deregisterUser (Student student) throws SQLException{
        String sql="delete from alumnos where registro = " + student.getRegistry()+"";
        if (clConnect.execQueryUpdate(sql) > 0) {
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
        if(clConnect.execQueryUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Modificación Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }

    public ResultSet getTableContent() {
        return tableContent;
    }
    
}