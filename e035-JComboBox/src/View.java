import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class View extends JFrame
{
    private JComboBox jComboBox;
    private ModelJComboBox modelJComboBox;

    public void init()
    {
        instances();
        content();
        config();

        setTitle("Layouts");
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();

        events();
    }

    private void instances()
    {
        jComboBox = new JComboBox();

        ArrayList elements = new ArrayList();
        for (int i = 0; i<100; i++)
            elements.add(i);
        modelJComboBox = new ModelJComboBox(elements);

    }

    private void content()
    {
        getContentPane().add(jComboBox, BorderLayout.CENTER);
    }

    private void config()
    {
        jComboBox.setModel(modelJComboBox);
    }

    private void events()
    {
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("getItem: " + e.getItem().toString());

                System.out.println("getSelectedItem: " + modelJComboBox.getSelectedItem());
            }
        });
    }
}

