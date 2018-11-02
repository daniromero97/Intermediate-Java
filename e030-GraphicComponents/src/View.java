import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    private JLabel label;
    private JTextField jTextField;
    private JPasswordField jPasswordField;
    private JTextArea jTextArea;
    private JButton jButton;
    private JCheckBox jCheckBox1, jCheckBox2;
    private JRadioButton jRadioButton1, jRadioButton2;
    private ButtonGroup group;
    private JComboBox jComboBox;
    private JList jList;
    private JSpinner jSpinner;

    public void init()
    {
        setTitle("My first graphic application");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        instances();
        content();
        config();
    }

    private void instances()
    {
        label = new JLabel("Hello world");
        jTextField = new JTextField();
        jPasswordField = new JPasswordField();
        jTextArea = new JTextArea();
        jButton = new JButton("Button");
        jCheckBox1 = new JCheckBox("check 1");
        jCheckBox2 = new JCheckBox("check 2");
        jRadioButton1 = new JRadioButton("radio 1", true);
        jRadioButton2 = new JRadioButton("radio 1", true);
        group = new ButtonGroup();

        String[] options = {"op1", "op2", "op3", "etc"};
        jComboBox = new JComboBox(options);

        jList = new JList(options);
        jSpinner = new JSpinner();
    }

    private void content()
    {
        getContentPane().setLayout(null);
        getContentPane().add(label);
        getContentPane().add(jTextField);
        getContentPane().add(jPasswordField);
        getContentPane().add(jTextArea);
        getContentPane().add(jButton);
        getContentPane().add(jCheckBox1);
        getContentPane().add(jCheckBox2);
        getContentPane().add(jRadioButton1);
        getContentPane().add(jRadioButton2);
        getContentPane().add(jComboBox);
        getContentPane().add(jList);
        getContentPane().add(jSpinner);
    }

    private void config()
    {
        label.setBounds(10, 10, 100, 20);

        jTextField.setBounds(120, 10, 100, 20);
        jTextField.setText("text...");

        jPasswordField.setBounds(230, 10, 100, 20);
        jPasswordField.setBackground(Color.YELLOW);
        jPasswordField.setEchoChar('@');

        jTextArea.setBounds(10,40,210,60);
        jTextArea.setLineWrap(true);
        jTextArea.setText("hello");
        jTextArea.append(" world...");
        jTextArea.setBorder(BorderFactory.createTitledBorder(null, "border"));

        jButton.setBounds(230, 40, 100, 60);
        jButton.setFont(new Font("Arial", Font.ITALIC, 10));
        jButton.setFocusable(true);
        jButton.setEnabled(true);

        jCheckBox1.setBounds(10, 110, 100,20);
        jCheckBox2.setBounds(130, 110, 100,20);
        jCheckBox2.setSelected(true);

        jRadioButton1.setBounds(10, 140, 100, 20);
        jRadioButton2.setBounds(130, 140, 100, 20);
        group.add(jRadioButton1);
        group.add(jRadioButton2);

        jComboBox.setBounds(10, 170, 100,20);
        jComboBox.setSelectedIndex(2);
        jComboBox.addItem(new String("..."));

        jList.setBounds(360, 10, 100, 100);
        DefaultListModel defaultListModel = new DefaultListModel();
        defaultListModel.addElement("element 1");
        defaultListModel.addElement("element 2");
        defaultListModel.addElement("element 3");
        defaultListModel.addElement("new element");
        defaultListModel.remove(0);
        jList.setModel(defaultListModel);

        jSpinner.setBounds(10, 200, 100, 20);
        // SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
        // SpinnerListModel spinnerListModel = new SpinnerListModel(options);
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel();
        spinnerNumberModel.setMaximum(100);
        spinnerNumberModel.setMinimum(0);
        spinnerNumberModel.setStepSize(5);
        jSpinner.setModel(spinnerNumberModel);
        jSpinner.setValue(50);

    }
}
