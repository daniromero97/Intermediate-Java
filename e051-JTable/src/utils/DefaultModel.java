package utils;

import javax.swing.table.DefaultTableModel;

public class DefaultModel extends DefaultTableModel
{
    Class[] types = new Class[]{String.class, String.class, Integer.class, Boolean.class};
    Boolean[] editable = new Boolean[]{false, false, false, true};

    public DefaultModel(Object[][] rows, Object[] columns)
    {
        super(rows, columns);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return types[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int column)
    {
        return editable[column];
    }
}
