import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;

public class View extends JFrame
{
    private JList jList;
    private ModelJList modelJList;

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
        jList = new JList();

        ArrayList elements = new ArrayList();
        for (int i = 0; i<15; i++)
            elements.add(i);
        modelJList = new ModelJList(elements);

    }

    private void content()
    {
        getContentPane().add(jList, BorderLayout.CENTER);
    }

    private void config()
    {
        jList.setModel(modelJList);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
        jList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        jList.setVisibleRowCount(8);
    }

    private void events()
    {
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                System.out.println(jList.getSelectedValue());
            }
        });
    }
}

