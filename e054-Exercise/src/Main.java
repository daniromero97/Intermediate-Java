import v1.Controller;
import v1.Model;
import v1.View;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                View v = new View();
                Model m = new Model();
                Controller controller = new Controller(v, m);
            }
        });
    }

}
