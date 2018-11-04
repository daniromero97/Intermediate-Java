import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame
{
    private JPanel jPanel;
    private JTextField jTextField, jTextField2;
    private JButton jButton, jButton2;

    public void init()
    {
        instances();
        content();
        config();

        setTitle("Layouts");
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        events();
    }

    private void instances()
    {
        jPanel = new JPanel();
        jTextField = new JTextField(10);
        jTextField2 = new JTextField(10);
        jButton = new JButton("Copy");
        jButton2 = new JButton("Delete");
    }

    private void content()
    {
        getContentPane().add(jPanel, BorderLayout.CENTER);
        getContentPane().add(jButton, BorderLayout.NORTH);
        getContentPane().add(jButton2, BorderLayout.SOUTH);
    }

    private void config()
    {
        jPanel.setBackground(Color.CYAN);
        jPanel.add(jTextField);
        jPanel.add(jTextField2);

        jTextField.setBackground(Color.YELLOW);
        jTextField.setSelectionColor(Color.ORANGE);
        jTextField.setSelectedTextColor(Color.RED);

        jTextField2.setEditable(false);
        jTextField2.setFocusable(false);
    }

    private void events()
    {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = jTextField.getText();
                value = value.toUpperCase();

                jTextField2.setText(value);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                jTextField2.setText("");
            }
        });
    }
}
