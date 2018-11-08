import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener
{
    private Container container;
    private JPanel jPanel;
    private JButton jButtonInfo, jButtonWarning, jButtonError, jButtonOptions, jButtonConfirm, jButtonInput, jButtonSpinner;

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
        jButtonInfo = new JButton("Information");
        jButtonWarning = new JButton("Warning");
        jButtonError= new JButton("Error");
        jButtonOptions = new JButton("Options");
        jButtonConfirm = new JButton("Confirm");
        jButtonInput= new JButton("Input");
        jButtonSpinner= new JButton("Spinner");
    }

    private void config()
    {
        container.add(jPanel, BorderLayout.CENTER);
        jPanel.add(jButtonInfo);
        jPanel.add(jButtonWarning);
        jPanel.add(jButtonError);
        jPanel.add(jButtonOptions);
        jPanel.add(jButtonConfirm);
        jPanel.add(jButtonInput);
        jPanel.add(jButtonSpinner);
    }

    private void actions()
    {
        jButtonInfo.addActionListener(this);
        jButtonWarning.addActionListener(this);
        jButtonError.addActionListener(this);
        jButtonOptions.addActionListener(this);
        jButtonConfirm.addActionListener(this);
        jButtonInput.addActionListener(this);
        jButtonSpinner.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonInfo)
        {
            JOptionPane.showMessageDialog(this,"My information message", "Title", JOptionPane.INFORMATION_MESSAGE,null);
        }
        else if (e.getSource() == jButtonWarning)
        {
            JOptionPane.showMessageDialog(this,"My warning message", "Title", JOptionPane.WARNING_MESSAGE,null);
        }
        else if (e.getSource() == jButtonError)
        {
            JOptionPane.showMessageDialog(this,"My error message", "Title", JOptionPane.ERROR_MESSAGE,null);
        }
        else if (e.getSource() == jButtonOptions)
        {
            String[] options  = {"op 1", "op 2", "op 3"};
            int op = JOptionPane.showOptionDialog(this,"Select a option","Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
            System.out.println(op);
        }
        else if (e.getSource() == jButtonConfirm)
        {
            int i = JOptionPane.showConfirmDialog(this,"My confirm message","Title", JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println(i);
        }
        else if (e.getSource() == jButtonInput)
        {
            String s = JOptionPane.showInputDialog(this,"My input message", "Title", JOptionPane.QUESTION_MESSAGE);
            System.out.println(s);
        }
        else if (e.getSource() == jButtonSpinner)
        {
            Object o = JOptionPane.showInputDialog(this,
                    "My spinner message",
                    "Title", JOptionPane.QUESTION_MESSAGE, null,
                    new String[] { "op 1","op 2", "op 3","op 4","op 5" },"op 1");

            System.out.println(o);
        }
    }
}
