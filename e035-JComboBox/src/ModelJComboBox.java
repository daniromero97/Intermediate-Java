import javax.swing.*;
import java.util.ArrayList;

public class ModelJComboBox extends AbstractListModel implements ComboBoxModel
{
    ArrayList elements;
    Object selection;

    public ModelJComboBox(ArrayList arrayList)
    {
        this.elements = arrayList;
    }

    @Override
    public void setSelectedItem(Object anItem)
    {
        selection = anItem;
    }

    @Override
    public Object getSelectedItem()
    {
        return selection;
    }

    @Override
    public int getSize()
    {
        return elements.size();
    }

    @Override
    public Object getElementAt(int index)
    {
        return elements.get(index);
    }
}