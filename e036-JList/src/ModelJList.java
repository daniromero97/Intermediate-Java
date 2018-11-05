import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModelJList implements ListModel
{
    ArrayList elements;

    public ModelJList(ArrayList arrayList)
    {
        this.elements = arrayList;
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

    @Override
    public void addListDataListener(ListDataListener l)
    {
        elements.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l)
    {
        elements.remove(l);
    }
}
