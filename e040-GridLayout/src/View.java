import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame
{
    private Container container;
    private GridLayout gridLayout;
    private JButton jButton;
    private JTextField jTextField, textName, textSurname;

    public void init()
    {
        this.setTitle("CardLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);

        instances();
        config();
        actions();

        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        gridLayout = new GridLayout(0,2,10,10); // rows, cols, horizontal gap, vertical gap
        jButton = new JButton("concat!!");
        jTextField = new JTextField(10);
        textName = new JTextField(10);
        textSurname = new JTextField(10);
    }

    private void config()
    {
        container.setLayout(gridLayout);
        container.add(new JLabel("Name"));
        container.add(textName);
        container.add(new JLabel("Surname"));
        container.add(textSurname);
        container.add(jButton);
        container.add(jTextField);

        jTextField.setEditable(false);
    }

    private void actions()
    {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(textName.getText() + " " + textSurname.getText());
            }
        });
    }

}
