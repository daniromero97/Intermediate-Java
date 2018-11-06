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
    private JProgressBar jProgressBar;

    public void init()
    {
        this.setTitle("GridBagLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 200);
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

        myLabel = new JLabel("Number");
        myTextField = new JTextField(10);
        myButton = new JButton("Execute");
        jProgressBar = new JProgressBar();
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


        // row 2 column 0 span 2
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        this.getContentPane().add(jProgressBar, gridBagConstraints);
    }

    private void actions()
    {
        Worker worker = new Worker(jProgressBar);

        myButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (myTextField.getText().isEmpty())
                    System.out.println("Write a number");
                else
                {
                    try
                    {
                        int n = Integer.parseInt(myTextField.getText());
                        if (n>0 && n<101)
                        {
                            jProgressBar.setMaximum(n);
                            worker.execute();
                        }
                        else System.out.println("Error: Number out of range, write a number between 0 and 100");
                    }
                    catch(NumberFormatException ex)
                    {
                        System.out.println("Error: Write a number");
                    }


                }
            }
        });
    }





}
