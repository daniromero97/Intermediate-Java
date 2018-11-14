- They represent data in a structured way with possibilities of personalized representation.
- We must create the table inside a JScrollPane so that it can be completely visible.

- Representations:
    - Simple data (Static data, not recommended):
	```
    String[] columns = new String[]{"Name", "Surname", "Age", "Is working?"};
    Object[][] rows = new Object[][]{
            {"Name1", "Surname1", 21, true},
            {"Name2", "Surname2", 21, true},
            {"Name3", "Surname3", 21, true}};

    JTable jTable = new JTable(rows, columns);
    JScrollPane jScrollPane = new JScrollPane(jTable);
	```

    - Simple model (Dynamic, allows adding, deleting and modifying data):
	```
    String[] columns = new String[]{"Name", "Surname", "Age", "Is working?"};
    Object[][] rows = new Object[][]{
            {"Name1", "Surname1", 21, true},
            {"Name2", "Surname2", 21, true},
            {"Name3", "Surname3", 21, true}};

    DefaultTableModel defaultTableModel = new DefaultTableModel(rows, columns);
    JTable jTable = new JTable(defaultTableModel);
    JScrollPane jScrollPane = new JScrollPane(jTable);
	```

    - Custom model (The most complete option must be extended from DefaultTableModel or from AbstractTableModel):
	```
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
	```

	```
    String[] columns = new String[]{"Name", "Surname", "Age", "Is working?"};
    Object[][] rows = new Object[][]{
            {"Name1", "Surname1", 21, true},
            {"Name2", "Surname2", 21, true},
            {"Name3", "Surname3", 21, true}};

    DefaultModel defaultModel = new DefaultModel(rows, columns);
    JTable jTable = new JTable(defaultModel);
    JScrollPane jScrollPane = new JScrollPane(jTable);
	```

- Data management:
    - Information:
	```
    defaultModel.getColumnCount();
    defaultModel.getRowCount();
    defaultModel.getColumnName(0);
    defaultModel.findColumn("Nombre");
    defaultModel.getSelectedRow();
    defaultModel.fireTableDataChanged();    // Notify a change
    defaultModel.getValueAt(jTable.getSelectedRow(), position);
	```

    - Add rows:
	```
    Object[] data = {"NameX", "SurnameX", 21, true};
    defaultModel.addRow(data);
    defaultModel.insertRow(position, data);
	```

    - Delete rows:
	```
    defaultModel.removeRow(jTable.getSelectedRow());
    defaultModel.removeRow(jTable.getSelectionModel().getLeadSelectionIndex());
	```
