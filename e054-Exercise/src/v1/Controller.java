package v1;

import v1.utils.Person;
import v1.utils.JTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Controller implements ActionListener, ItemListener {
    // Variables
    private View view;
    private Model model;
    private ArrayList<Person> arrayList;
    private Person person;
    private JTextField name, home;
    private JComboBox jComboBoxAge;
    private JCheckBox jCheckBoxLiveAlone;
    private JTableModel jTableModel;
    private JTable jTable;

    private int selectedAge;

    // Constructor
    public Controller(View view, Model model)
    {
        this.view = view;
        this.model = model;
        instances();
        actions();
    }

    private void instances()
    {
        arrayList = new ArrayList<>();
        name = view.getRegistrationPanel().getTextName();
        home = view.getRegistrationPanel().getTextHome();
        jComboBoxAge = view.getRegistrationPanel().getComboAge();
        jCheckBoxLiveAlone = view.getRegistrationPanel().getCheckLiveAlone();
        jTableModel = view.getjTableModel();
        jTable = view.getjTable();
        selectedAge = 18;
    }
    private void actions()
    {
        view.getRegistrationPanel().getBtnAdd().addActionListener(this);
        view.getRegistrationPanel().getBtnDelete().addActionListener(this);
        view.getRegistrationPanel().getComboAge().addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       switch (e.getActionCommand()){
            case "Add record button":
                acBtnAddRec();
                break;
            case "Delete record button":
                acBtnDeleteRec();
                break;
       }
    }


    // Actions methods
        // Add record
        private void acBtnAddRec()
        {
            try
            {
                person = model.add(name, selectedAge, home, jCheckBoxLiveAlone);
                if (!name.getText().trim().equals("") && !home.getText().trim().equals(""))
                {
                    if (model.check(arrayList, person))
                    {
                        arrayList.add(person);
                        jTableModel.addData(person);
                    }
                    else
                        JOptionPane.showMessageDialog(view,"Person already added","ERROR",JOptionPane.ERROR_MESSAGE,null);
                }
                else
                    JOptionPane.showMessageDialog(view,"Complete the data","ERROR",JOptionPane.ERROR_MESSAGE,null);
            }
            catch (NullPointerException ex)
            {
                JOptionPane.showMessageDialog(view,"Complete the data","ERROR",JOptionPane.ERROR_MESSAGE,null);
            }
        }

        // Delete record
        private void acBtnDeleteRec()
        {
            try
            {
                Person person = new Person((String) jTableModel.getValueAt(jTable.getSelectedRow(),0),"home",0,false);
                model.deletePerson(arrayList, person);
                jTableModel.deleteData(jTable.getSelectedRow());
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(view, "Select row", "ERROR", JOptionPane.ERROR_MESSAGE, null);
            }
        }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == view.getRegistrationPanel().getComboAge())
        {
            selectedAge = (int) e.getItem();
            System.out.println(e.getItem());
        }
    }
}
