import utils.JTreeModel;
import utils.Person;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener
{
    DefaultMutableTreeNode rootTreeNode;
    JTree tree;
    JScrollPane scrollPane;
    JTreeModel jTreeModel;
    JButton jButtonInfo;

    public void init()
    {
        instances();
        treeConfig();
        config();
        actions();

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void instances()
    {
        rootTreeNode = new DefaultMutableTreeNode("Root node");
        tree = new JTree(rootTreeNode);
        scrollPane = new JScrollPane(tree);
        jTreeModel = new JTreeModel();

        jButtonInfo = new JButton("Information");
    }

    private void treeConfig()
    {
        tree.setCellRenderer(jTreeModel);

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode(new Person("Gonzalo","Gomez",25, true));
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode(new Person("Laura","García",32, true));
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode(new Person("David","Herrero",2, false));

        rootTreeNode.add(node1);
        rootTreeNode.add(node2);
        node2.add(node3);
    }

    private void config()
    {
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        this.getContentPane().add(jButtonInfo, BorderLayout.SOUTH);
    }

    private void actions()
    {
        jButtonInfo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if(e.getSource() == jButtonInfo)
        {
            if (defaultMutableTreeNode != null)
                System.out.println(defaultMutableTreeNode);
            else
                System.out.println("Select a node");
        }
    }
}
