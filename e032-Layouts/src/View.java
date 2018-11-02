import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    private JPanel jPanel1, jPanel2;

    public void init()
    {
        setTitle("Layouts");
        setSize(300, 400);
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
    }

    private void content()
    {
        getContentPane().add(jPanel1, BorderLayout.NORTH);
        getContentPane().add(jPanel2, BorderLayout.CENTER);
    }

    private void config()
    {
        jPanel1.setBackground(Color.CYAN);
        jPanel1.setLayout(new BoxLayout(this.jPanel1, BoxLayout.Y_AXIS));
        jPanel1.add(new Label("element 1"));
        jPanel1.add(Box.createRigidArea(new Dimension(30,30)));
        jPanel1.add(new Label("element 2"));
        jPanel1.add(Box.createRigidArea(new Dimension(50,50)));
        jPanel1.add(new Label("element 3"));
        jPanel1.add(Box.createRigidArea(new Dimension(80,80)));
        jPanel1.add(new Label("element 5"));
        jPanel1.add(new Label("element 6"));


        jPanel2.setBackground(Color.ORANGE);
        jPanel2.setLayout(new BoxLayout(this.jPanel2, BoxLayout.X_AXIS));
        jPanel2.add(new Label("element 1"));
        jPanel2.add(Box.createHorizontalGlue());
        jPanel2.add(new Label("element 2"));
        jPanel2.add(new Label("element 3"));
        jPanel2.add(new Label("element 5"));
        jPanel2.add(new Label("element 6"));
    }
}
