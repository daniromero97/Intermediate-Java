import utils.DefaultModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener, ListSelectionListener
{
    private String[] columns;
    private Object[][] rows;
    private DefaultModel defaultModel;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private JPanel jPanel;
    private JTextField jTextFieldName, jTextFieldSurname, jTextFieldAge, jTextFieldWorking;
    private JButton jButton;

    public void init()
    {
        instances();
        config();
        actions();

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void instances()
    {
        columns = new String[]{"Name", "Surname", "Age", "Is working?"};
        rows = new Object[][]{
                {"Name1", "Surname1", 21, true},
                {"Name2", "Surname2", 21, true},
                {"Name3", "Surname3", 21, true}};
        defaultModel = new DefaultModel(rows, columns);
        jTable = new JTable(defaultModel);
        jScrollPane = new JScrollPane(jTable);

        jPanel = new JPanel();
        jTextFieldName = new JTextField(10);
        jTextFieldSurname = new JTextField(10);
        jTextFieldAge = new JTextField(10);
        jTextFieldWorking = new JTextField(10);
        jButton = new JButton("Add");
    }

    private void config()
    {
        this.getContentPane().add(jScrollPane, BorderLayout.CENTER);
        this.getContentPane().add(jPanel, BorderLayout.SOUTH);

        jPanel.add(jTextFieldName);
        jPanel.add(jTextFieldSurname);
        jPanel.add(jTextFieldAge);
        jPanel.add(jTextFieldWorking);
        jPanel.add(jButton);
    }

    private void actions()
    {
        ListSelectionModel listSelectionModel = jTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(this);

        jButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try {
            Object[] data = {
                    jTextFieldName.getText(),
                    jTextFieldSurname.getText(),
                    Integer.valueOf(jTextFieldAge.getText()),
                    Boolean.valueOf(jTextFieldWorking.getText())
            };

            if (jTable.getSelectedRow() >= 0)
                defaultModel.insertRow(jTable.getSelectedRow()+1, data);
            else
                defaultModel.addRow(data);
        }
        catch (NumberFormatException e1)
        {
            System.out.println("Error");
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        System.out.println(defaultModel.getValueAt(jTable.getSelectedRow(), jTable.getSelectedColumn()));
    }
}
