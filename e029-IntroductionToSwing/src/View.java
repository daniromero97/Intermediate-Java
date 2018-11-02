import javax.swing.*;

public class View extends JFrame
{
    public void init()
    {
        setTitle("My first graphic application");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
