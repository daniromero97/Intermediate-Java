package v1;

import v1.paneles.RegistrationPanel;
import v1.utils.JTableModel;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    // Variables
    private Container container;
    private JScrollPane jScrollPane;
    private JTable jTable;
    private JTableModel jTableModel;
    private RegistrationPanel registrationPanel;

    // Constructor
    public View()
    {
        init();
    }

    private void init()
    {
        instances();
        config();
        setTitle("Exercise");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    // init methods
    private void instances()
    {
        container = this.getContentPane();
        jTableModel = new JTableModel();
        jTable = new JTable(jTableModel);
        jScrollPane = new JScrollPane(jTable);
        registrationPanel = new RegistrationPanel();
    }

    private void config()
    {
        container.add(jScrollPane, BorderLayout.CENTER);
        container.add(registrationPanel, BorderLayout.SOUTH);
    }

    //getters
    public JTableModel getjTableModel() {
        return jTableModel;
    }
    public JTable getjTable() {
        return jTable;
    }
    public RegistrationPanel getRegistrationPanel() {
        return registrationPanel;
    }
}



