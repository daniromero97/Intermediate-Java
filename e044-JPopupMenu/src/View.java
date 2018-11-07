import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener {
    private Container container;
    private JPanel jPanel;

    private JPopupMenu jPopupMenu;
    JMenuItem jPopupMenuCut;
    JMenuItem jPopupMenuCopy;
    JMenuItem jPopupMenuPaste;

    public void init()
    {
        this.setTitle("JSplitPane");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

        instances();
        config();
        actions();

        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        jPanel = new JPanel();
        jPopupMenu = new JPopupMenu("Edit");
        jPopupMenuCut = new JMenuItem("Cut");
        jPopupMenuCopy = new JMenuItem("Copy");
        jPopupMenuPaste = new JMenuItem("Paste");
    }

    private void config()
    {
        container.add(jPanel, BorderLayout.CENTER);
        jPanel.setBackground(Color.CYAN);

        jPopupMenu.add(jPopupMenuCut);
        jPopupMenu.addSeparator();
        jPopupMenu.add(jPopupMenuCopy);
        jPopupMenu.add(jPopupMenuPaste);
    }

    private void actions()
    {
        jPanel.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON3)
                    jPopupMenu.show(jPanel,e.getX(),e.getY());
            }
        });

        jPopupMenuCut.addActionListener(this);
        jPopupMenuCopy.addActionListener(this);
        jPopupMenuPaste.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jPopupMenuCut)
            System.out.println("Cut");
        else if (e.getSource() == jPopupMenuCopy)
            System.out.println("Copy");
        else if (e.getSource() == jPopupMenuPaste)
            System.out.println("Paste");
    }
}
