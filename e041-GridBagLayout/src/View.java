import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame
{
    private Container container;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints gridBagConstraints;

    private JLabel myLabel;
    private JTextField myTextField;
    private JButton myButton;


    public void init()
    {
        this.setTitle("GridBagLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);

        instances();
        config();
        actions();

        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();

        myLabel = new JLabel("Name");
        myTextField = new JTextField(10);
        myButton = new JButton("Print");
    }

    private void config()
    {
        container.setLayout(gridBagLayout);

        // row 0 column 0
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        this.getContentPane().add(myLabel, gridBagConstraints);

        // row 0 column 1
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        this.getContentPane().add(myTextField, gridBagConstraints);

        // row 1 column 0 span 2
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        this.getContentPane().add(myButton, gridBagConstraints);
    }

    private void actions()
    {
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (myTextField.getText().isEmpty())
                    System.out.println("Write a name");
                else
                    System.out.println(myTextField.getText());
            }
        });
    }

}
