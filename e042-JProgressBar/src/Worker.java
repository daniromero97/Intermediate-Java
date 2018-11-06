import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Worker extends SwingWorker<Boolean,Integer>
{
    JProgressBar jProgressBar;

    public Worker(JProgressBar jProgressBar)
    {
        this.jProgressBar = jProgressBar;
    }

    @Override
    protected Boolean doInBackground() throws Exception
    {
        for (int i = jProgressBar.getMinimum(); i <= jProgressBar.getMaximum(); i++)
        {
            publish(i);
            Thread.sleep(100);
        }
        return true;
    }

    @Override
    protected void process(List<Integer> chunks)
    {
        jProgressBar.setValue(chunks.get(chunks.size()-1));
    }

    @Override
    protected void done()
    {
        Toolkit.getDefaultToolkit().beep();
    }
}

