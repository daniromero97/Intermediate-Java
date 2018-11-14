- To work with JTree in a more complete way you must create a class that implements the TreeCellRenderer interface.
- This implementation requires to bring the method getTreeCellRendererComponent that is responsible for painting each component of the tree.
- Example:
    ```
    public class utils.JTreeModel implements TreeCellRenderer
    {
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            return null;
        }
    }
    ```
- Parameters:
    - tree: tree on which the component is painted
    - value: node that will represent
    - selected: indicates whether it is selected or not selected
    - expanded: indicates if it is expanded or not expanded
    - leaf: indicates if the node is a leaf
    - row: row of the tree where the node is.
    - hasFocus: indicates if the node has the focus.

- Each node will represent an independent unit of type Component, therefore everything you want to return will have to go in this unit.
- To be able to convert the class into a grouper of components and have all the components that we want to represent, it will extend from JPanel.
