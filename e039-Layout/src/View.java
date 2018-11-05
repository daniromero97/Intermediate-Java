import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener
{
    private Container container;
    private CardLayout cardLayout;
    private JButton jButtonNext, jButtonPrevious;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel4, centerPanel, buttonsPanel;

    public void init()
    {
        this.setTitle("CardLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        instances();
        centerConfig();
        bottomConfig();
        actions();

        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        cardLayout = new CardLayout();
        centerPanel = new JPanel();
        buttonsPanel = new JPanel();
        jButtonNext = new JButton("Next");
        jButtonPrevious = new JButton("Previous");
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
    }

    private void centerConfig()
    {
        container.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(cardLayout);
        cardLayout.show(centerPanel, "p1");
        centerPanel.add(jPanel1, "p1");
        centerPanel.add(jPanel2, "p2");
        centerPanel.add(jPanel3, "p3");
        centerPanel.add(jPanel4, "p4");

        jPanel1.setBackground(Color.CYAN);
        jPanel2.setBackground(Color.BLUE);
        jPanel3.setBackground(Color.RED);
        jPanel4.setBackground(Color.GREEN);
    }

    private void bottomConfig()
    {
        container.add(buttonsPanel, BorderLayout.SOUTH);
        buttonsPanel.add(jButtonPrevious);
        buttonsPanel.add(jButtonNext);
    }

    private void actions()
    {
        jButtonPrevious.addActionListener(this);
        jButtonNext.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButtonPrevious)
        {
            if (!jPanel1.isShowing())
                cardLayout.previous(centerPanel);
        }
        else if (e.getSource() == jButtonNext)
        {
            if (!jPanel4.isShowing())
                cardLayout.next(centerPanel);
        }
    }

}
