import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener
{
    JTree tree;
    JScrollPane scrollPane;
    JPanel jPanel;
    DefaultMutableTreeNode rootTreeNode;
    JButton jButtonInfo, jButtonAdd, jButtonDelete;
    JTextField jTextFieldAdd, jTextFieldDelete;

    public void init()
    {
        instances();
        treeConfig();
        config();
        actions();

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void instances()
    {
        rootTreeNode = new DefaultMutableTreeNode("Root node");
        tree = new JTree(rootTreeNode);
        scrollPane = new JScrollPane(tree);

        jButtonInfo = new JButton("Information");
        jButtonAdd = new JButton("Add");
        jButtonDelete= new JButton("Delete");
        jTextFieldAdd = new JTextField(10);
        jTextFieldDelete = new JTextField(10);
        jPanel = new JPanel();
    }

    private void treeConfig()
    {
        DefaultMutableTreeNode node01 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node02 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode node03 = new DefaultMutableTreeNode("Node 3");
        DefaultMutableTreeNode node031 = new DefaultMutableTreeNode("Node 3, child node");
        DefaultMutableTreeNode node03Person = new DefaultMutableTreeNode(new Person("Gonzalo","Gomez",25));

        rootTreeNode.add(node01);
        rootTreeNode.add(node02);
        rootTreeNode.add(node03);
        node03.add(node031);
        node03.add(node03Person);
    }

    private void config()
    {
        this.getContentPane().add(scrollPane, BorderLayout.NORTH);
        this.getContentPane().add(jPanel, BorderLayout.CENTER);
        this.getContentPane().add(jButtonInfo, BorderLayout.SOUTH);

        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(jButtonAdd);
        jPanel.add(jTextFieldAdd);
        jPanel.add(jButtonDelete);
        jPanel.add(jTextFieldDelete);
    }

    private void actions()
    {
        jButtonInfo.addActionListener(this);
        jButtonAdd.addActionListener(this);
        jButtonDelete.addActionListener(this);
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
        else if (e.getSource() == jButtonAdd)
        {
            try
            {
                defaultMutableTreeNode.add(new DefaultMutableTreeNode(jTextFieldAdd.getText()));
            }
            catch (NullPointerException ex)
            {
                System.out.println("Select a node");
            }
        }
        else if (e.getSource()==jButtonDelete)
        {
            try
            {
                int n = Integer.parseInt(jTextFieldDelete.getText());
                rootTreeNode.remove(n);
            }
            catch (NumberFormatException e1)
            {
                System.out.println("Write a number");
            }
            catch (ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("Node not found");
            }
        }
    }
}
