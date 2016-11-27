package dbstudentsdad;

// @author Pleymo

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class tableView extends AbstractTableModel{
    
    private ResultSet result;
    private ResultSetMetaData metadata; 
    private int column;
    private int row;
    
    public tableView (ResultSet res){
        result = res;
        try {
            metadata = result.getMetaData();
            result.last();
            row = result.getRow();
            column = metadata.getColumnCount();
        } catch (SQLException ex){ }
    }

    @Override
    public Object getValueAt (int rowIndex, int columnIndex) {
        try {
            result.absolute((rowIndex+1));
            Object obj = result.getObject((columnIndex+1));
            return obj;
        } catch (SQLException exception) {
            return "Error en la Vista de la Tabla";
        }
    }
    
    @Override
    public int getRowCount() {
        return row;        
    }

    @Override
    public int getColumnCount() {
        return column;
    }  
    
}
