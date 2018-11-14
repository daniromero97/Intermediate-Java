package v1;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private Container container;
    private JTextField jTextField;
    private JSpinner jSpinner;
    private SpinnerNumberModel spinnerNumberModel;
    private JButton jButton;

    public View()
    {
        init();
    }

    private void init()
    {
        instances();
        config();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        jTextField = new JTextField(10);
        spinnerNumberModel = new SpinnerNumberModel(0,0,10,1);
        jSpinner = new JSpinner(spinnerNumberModel);
        jButton = new JButton("Click");

        jButton.setActionCommand(StaticVariables.TAG_ACC_B1);
    }

    private void config()
    {
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Example MVC"));
        container.add(jTextField);
        container.add(jSpinner);
        container.add(jButton);
    }


    public JTextField getjTextField() {
        return jTextField;
    }

    public SpinnerNumberModel getSpinnerNumberModel() {

        return spinnerNumberModel;
    }

    public JButton getjButton() {
        return jButton;
    }
}
