import javax.swing.*;
import java.awt.*;

public class View extends JFrame
{
    private Container container;
    private JPanel jPanel, jPanel2;
    private JSplitPane jSplitPane;


    public void init()
    {
        this.setTitle("JSplitPane");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

        instances();
        config();

        this.setVisible(true);
    }

    private void instances()
    {
        container = this.getContentPane();
        jPanel = new JPanel();
        jPanel2 = new JPanel();
        jSplitPane = new JSplitPane();
    }

    private void config()
    {
        container.add(jSplitPane, BorderLayout.CENTER);

        jSplitPane.setLeftComponent(jPanel);
        jSplitPane.setRightComponent(jPanel2);
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);

        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setResizeWeight(0.5);
        jSplitPane.resetToPreferredSizes();     // Reset the initial position of the separator
        jSplitPane.setContinuousLayout(true);   // Renders the movement progressively

        jPanel.setBackground(Color.CYAN);
        jPanel2.setBackground(Color.ORANGE);
    }
}
