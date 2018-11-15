package v1.paneles;

import v1.StaticVariables;

import javax.swing.*;
import java.awt.*;

public class RegistrationPanel extends JPanel
{
    // Variables
    private JPanel jPanel;
    private GridLayout gridLayout;
    private JLabel lblName, lblAge, lblHome, lblLiveAlone;
    private JTextField textName, textHome;
    private Integer[] ages;
    private JComboBox comboAge;
    private JCheckBox checkLiveAlone;
    private JButton btnAdd, btnDelete;

    // Constructor
    public RegistrationPanel()
    {
        init();
    }

    private void init()
    {
        instances();
        conf();
        assignCommands();
    }

    // init methods
    private void instances()
    {
        jPanel = new JPanel();
        gridLayout = new GridLayout(5,2,5,5);
        lblName = new JLabel("Name");
        lblHome = new JLabel("Home");
        lblAge = new JLabel("Age");
        lblLiveAlone = new JLabel("Live alone?");
        textHome = new JTextField(10);
        textName = new JTextField(10);
        ages = new Integer[]{18,19,20,21,22,23,24,25,26,27,28};
        comboAge = new JComboBox(ages);
        checkLiveAlone = new JCheckBox();
        btnAdd = new JButton("Add record");
        btnDelete = new JButton("Delete record");
    }

    private void conf()
    {
        this.setLayout(gridLayout);
        this.add(lblName);
        this.add(textName);
        this.add(lblAge);
        this.add(comboAge);
        this.add(lblHome);
        this.add(textHome);
        this.add(lblLiveAlone);
        this.add(checkLiveAlone);
        this.add(btnAdd);
        this.add(btnDelete);
    }

    private void assignCommands()
    {
       btnAdd.setActionCommand(StaticVariables.TAG_ACC_RPBA);
       btnDelete.setActionCommand(StaticVariables.TAG_ACC_RPBD);
    }

    //getters
    public JTextField getTextName() {
        return textName;
    }
    public JTextField getTextHome() {
        return textHome;
    }
    public JComboBox getComboAge() {
        return comboAge;
    }
    public JCheckBox getCheckLiveAlone() {
        return checkLiveAlone;
    }
    public JButton getBtnAdd() {
        return btnAdd;
    }
    public JButton getBtnDelete() {
        return btnDelete;
    }
}
