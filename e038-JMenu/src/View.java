import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class View extends JFrame
{
    private JMenuBar jMenuBar;
    private JMenu jMenu;
    private JMenu jMenu2;
    private JMenuItem item1;
    private JCheckBoxMenuItem item2;
    private JRadioButtonMenuItem item3;
    private JMenuItem item4;

    public void init()
    {
        instances();
        content();
        config();

        setTitle("Layouts");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        events();
    }

    private void instances()
    {
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("menu 1");
        jMenu2 = new JMenu("menu 2");

        item1 = new JMenuItem("item 1", new ImageIcon(getClass().getResource("resources/icono.png")));
        item2 = new JCheckBoxMenuItem("item 2",false);
        item3 = new JRadioButtonMenuItem("item 3", false);
        item4 = new JMenuItem("item 4");
    }

    private void content()
    {
        setJMenuBar(jMenuBar);
    }

    private void config()
    {
        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu2);

        jMenu.add(item1);

        jMenu2.add(item2);
        jMenu2.add(item3);
        jMenu2.addSeparator();
        jMenu2.add(item4);


        item1.setMnemonic(KeyEvent.VK_1);
    }

    private void events()
    {
        //  jMenu
        jMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e)
            {
                System.out.println("jMenu 1");
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });


        //  JMenuItem
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("item 1");
            }
        });


        //  JCheckBoxMenuItem or JRadioButtonMenuItem
        item2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                System.out.println("item 2");
            }
        });
    }
}

