package dbstudentsdad;

//@author Pleymo 

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbStudentsDAD {

    public static void main(String[] args) {
        try {
            eventClass clEvent;
            clEvent = new eventClass();
        } catch (SQLException ex) {
            Logger.getLogger(DbStudentsDAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
