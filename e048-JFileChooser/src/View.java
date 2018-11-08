import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class View extends JFrame implements ActionListener
{
    private Container container;
    private JPanel jPanel;
    private JButton jButtonFile;
    private JFileChooser jFileChooser;

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
        jButtonFile = new JButton("Select file");
        jFileChooser = new JFileChooser();
    }

    private void config()
    {
        container.add(jPanel, BorderLayout.CENTER);
        jPanel.add(jButtonFile);

        FileNameExtensionFilter filt = new FileNameExtensionFilter("XML File", "xml");
        jFileChooser.addChoosableFileFilter(filt);
        jFileChooser.setFileFilter(filt);
    }

    private void actions()
    {
        jButtonFile.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonFile)
        {
            int option = jFileChooser.showDialog(this,"Select file");
            switch (option){
                case JFileChooser.APPROVE_OPTION:
                    File f = jFileChooser.getSelectedFile();
                    System.out.println(f.getParent());
                    System.out.println(f.getName());
                    break;
                case JFileChooser.CANCEL_OPTION:
                    System.out.println("Cancel");
                    break;
            }
        }
    }
}
