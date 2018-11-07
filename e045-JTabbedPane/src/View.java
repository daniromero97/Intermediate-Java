import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame
{
    private Container container;
    private JTabbedPane jTabbedPane;
    private JPanel jPanel, jPanel2, jPanel3;

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
        jTabbedPane = new JTabbedPane(SwingConstants.TOP);  // TOP, RIGHT, LEFT, BOTTOM
        jPanel = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
    }

    private void config()
    {
        container.add(jTabbedPane, BorderLayout.CENTER);
        jPanel.setBackground(Color.CYAN);
        jPanel2.setBackground(Color.RED);
        jPanel3.setBackground(Color.BLUE);

        // title, icon, component and tooltip
        jTabbedPane.addTab("Screen 1", null, jPanel,"S1");
        jTabbedPane.addTab("Screen 2", null, jPanel2,"S2");
        jTabbedPane.addTab("Screen 3", null, jPanel3,"S3");

        jTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        jTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        jTabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        jTabbedPane.setSelectedIndex(1);
    }

    private void actions()
    {
        jTabbedPane.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int index = jTabbedPane.getSelectedIndex();

                System.out.println("Index: " + index);
                System.out.println("Count: " + jTabbedPane.getTabCount());

                if (index == 0)
                    jTabbedPane.setTabPlacement(SwingConstants.LEFT);
                else if(index == 1)
                    jTabbedPane.setTabPlacement(SwingConstants.TOP);
                else
                    jTabbedPane.setTabPlacement(SwingConstants.RIGHT);
            }
        });
    }
}
