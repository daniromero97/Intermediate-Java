import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener
{
    private Container container;
    private JPanel jPanel;
    private JButton jButtonColor;

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
        container = getContentPane();
        jPanel = new JPanel();
        jButtonColor = new JButton("Select a color");
    }

    private void config()
    {
        container.add(jPanel, BorderLayout.CENTER);
        jPanel.add(jButtonColor);

    }

    private void actions()
    {
        jButtonColor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonColor)
        {
            Color c = JColorChooser.showDialog(this,"Select a color", Color.RED);
            System.out.println(c.toString());

            jPanel.setBackground(c);
        }
    }
}
