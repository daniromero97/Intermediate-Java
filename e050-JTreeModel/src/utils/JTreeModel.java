package utils;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;

public class JTreeModel extends JPanel implements TreeCellRenderer
{
    JLabel name;
    JCheckBox isWorking;
    DefaultTreeCellRenderer defaultModel;

    public JTreeModel()
    {
        this.name = new JLabel();
        this.isWorking = new JCheckBox();
        this.defaultModel = new DefaultTreeCellRenderer();
        this.add(name);
        this.add(isWorking);
        this.setBorder(BorderFactory.createTitledBorder("element"));
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus)
    {
        tree.setRowHeight(36);

        if (row > 0)
        {
            Person p = (Person) ((DefaultMutableTreeNode)value).getUserObject();

            if (leaf)
            {
                if (selected)
                {
                    this.setBackground(Color.ORANGE);
                }
                else this.setBackground(Color.WHITE);

                name.setText(p.getName());
                isWorking.setSelected(p.isWorking());
                return this;

            }
            else
            {
                defaultModel.setIcon(new ImageIcon(getClass().getResource("/resources/icon.png")));
                defaultModel.setText(p.getName());
                return defaultModel;
            }

        }
        else
        {
            defaultModel.setText("Root");
            defaultModel.setIcon(new ImageIcon(getClass().getResource("/resources/icons.png")));
            return defaultModel;
        }
    }
}
