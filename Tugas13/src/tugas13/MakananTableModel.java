package tugas13;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author audy
 */
public class MakananTableModel extends AbstractTableModel {
    private final ArrayList<Makanan> daftarMkn;
     
    private final String[] columnNames = new String[] {
        "Nama makanan", "Rating"
    };
    
    private final Class[] columnClass = new Class[] {
        String.class, String.class
    };
    
    public MakananTableModel(ArrayList<Makanan> daftarMkn) {
        this.daftarMkn = daftarMkn;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getRowCount() {
        return this.daftarMkn.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Makanan row = daftarMkn.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getNama();
            case 1:
                return row.getRating();
            default:
                return null;
        }
    }
}
