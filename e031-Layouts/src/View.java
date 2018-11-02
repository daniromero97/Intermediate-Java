import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    private JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5;

    public void init()
    {
        setTitle("Layouts");
        setSize(200, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        instances();
        content();
        config();
    }

    private void instances()
    {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
    }

    private void content()
    {
        getContentPane().add(jPanel1, BorderLayout.CENTER);
        getContentPane().add(jPanel2, BorderLayout.WEST);
        getContentPane().add(jPanel3, BorderLayout.SOUTH);
        getContentPane().add(jPanel4, BorderLayout.EAST);
        getContentPane().add(jPanel5, BorderLayout.NORTH);
    }

    private void config()
    {
        jPanel1.setBackground(Color.CYAN);
        jPanel2.setBackground(Color.GREEN);
        jPanel3.setBackground(Color.BLUE);
        jPanel4.setBackground(Color.YELLOW);
        jPanel5.setBackground(Color.RED);

        jPanel1.add(new Label("element 1"));
        jPanel1.add(new Label("element 2"));
        jPanel1.add(new Label("element 3"));
        jPanel1.add(new Label("element 4"));
        jPanel1.add(new Label("element 5"));
    }
}
