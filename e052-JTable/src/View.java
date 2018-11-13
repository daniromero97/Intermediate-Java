import utils.CustomModel;
import utils.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener, ListSelectionListener
{
    private CustomModel customModel;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private JPanel jPanel;
    private JTextField jTextFieldName, jTextFieldSurname, jTextFieldAge, jTextFieldWorking;
    private JButton jButtonAdd, jButtonDelete;

    public void init()
    {
        instances();
        config();
        actions();

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void instances()
    {
        customModel = new CustomModel();
        jTable = new JTable(customModel);
        jScrollPane = new JScrollPane(jTable);

        jPanel = new JPanel();
        jTextFieldName = new JTextField(10);
        jTextFieldSurname = new JTextField(10);
        jTextFieldAge = new JTextField(10);
        jTextFieldWorking = new JTextField(10);
        jButtonAdd = new JButton("Add");
        jButtonDelete = new JButton("Delete");
    }

    private void config()
    {
        this.getContentPane().add(jScrollPane, BorderLayout.CENTER);
        this.getContentPane().add(jPanel, BorderLayout.SOUTH);

        jPanel.add(jTextFieldName);
        jPanel.add(jTextFieldSurname);
        jPanel.add(jTextFieldAge);
        jPanel.add(jTextFieldWorking);
        jPanel.add(jButtonAdd);
        jPanel.add(jButtonDelete);
    }

    private void actions()
    {
        ListSelectionModel listSelectionModel = jTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(this);

        jButtonAdd.addActionListener(this);
        jButtonDelete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonAdd)
        {
            try {
                Person person = new Person(jTextFieldName.getText(),
                        jTextFieldSurname.getText(),
                        Integer.valueOf(jTextFieldAge.getText()),
                        Boolean.valueOf(jTextFieldWorking.getText()));

                customModel.addData(person);
            }
            catch (NumberFormatException e1)
            {
                System.out.println("Error");
            }
        }
        else if(e.getSource() == jButtonDelete)
        {
            try
            {
                customModel.deleteData(jTable.getSelectedRow());
            }
            catch (IndexOutOfBoundsException e1)
            {
                System.out.println("Error");
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        System.out.println(customModel.getValueAt(jTable.getSelectedRow(), jTable.getSelectedColumn()));
    }
}
