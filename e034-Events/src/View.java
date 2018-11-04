import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class View extends JFrame
{
    private JToggleButton jToggleButton, jToggleButton2;
    private ButtonGroup buttonGroup;

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
        jToggleButton = new JToggleButton("selected", true);
        jToggleButton2 = new JToggleButton("unselected", false);
        buttonGroup = new ButtonGroup();
    }

    private void content()
    {
        getContentPane().add(jToggleButton, BorderLayout.NORTH);
        getContentPane().add(jToggleButton2, BorderLayout.CENTER);
    }

    private void config()
    {
        buttonGroup.add(jToggleButton);
        buttonGroup.add(jToggleButton2);
    }

    private void events()
    {
        jToggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED)
                    jToggleButton.setText("selected");
                else
                    jToggleButton.setText("unselected");

            }
        });

        jToggleButton2.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange()==ItemEvent.SELECTED)
                jToggleButton2.setText("selected");
            else
                jToggleButton2.setText("unselected");

        }
    });
    }
}
