import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class View extends JFrame
{
    private JSpinner jSpinner;
    private SpinnerDateModel modeloFechas;

    public void init()
    {
        instances();
        content();
        config();

        setTitle("Layouts");
        setSize(200, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        events();
    }

    private void instances()
    {
        jSpinner = new JSpinner();
        modeloFechas = new SpinnerDateModel();
    }

    private void content()
    {
        getContentPane().add(jSpinner, BorderLayout.CENTER);
    }

    private void config()
    {
        jSpinner.setModel(modeloFechas);
    }

    private void events()
    {
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                System.out.println(jSpinner.getModel().getValue());
            }
        });
    }
}

