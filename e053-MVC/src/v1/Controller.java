package v1;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener, ChangeListener
{
    View view;
    Model model;

    public Controller(View view, Model model)
    {
        this.view = view;
        this.model = model;
        actions();
    }

    private void actions()
    {
        view.getjButton().addActionListener(this);
        view.getSpinnerNumberModel().addChangeListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //if (e.getSource() == view.getjButton())
        //{
        //  model.print(view.getjTextField().getText());
        //}

        if (e.getActionCommand() == StaticVariables.TAG_ACC_B1)
        {
            model.print(view.getjTextField().getText());
        }
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        if (e.getSource() == view.getSpinnerNumberModel())
        {
            model.print(view.getSpinnerNumberModel().getValue().toString());
        }
    }
}