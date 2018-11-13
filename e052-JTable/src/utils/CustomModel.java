package utils;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CustomModel extends AbstractTableModel
{
    private ArrayList arrayList = new ArrayList();
    private String[] columns =new String[]{"NAME", "SURNAME", "AGE", "IS WORKING?"};
    private Class[] types = new Class[]{String.class, String.class, Integer.class, Boolean.class};

    @Override
    public int getRowCount()
    {
        return arrayList.size();
    }

    @Override
    public int getColumnCount()
    {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Person person = (Person) arrayList.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return person.getName();
            case 1:
                return person.getSurname();
            case 2:
                return person.getAge();
            case 3:
                return person.isWorking();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column)
    {
        return columns[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return types[columnIndex];
    }


    public void addData(Person person)
    {
        arrayList.add(person);
        fireTableDataChanged();
    }

    public void deleteData(int row)
    {
        arrayList.remove(row);
        fireTableDataChanged();
    }

}