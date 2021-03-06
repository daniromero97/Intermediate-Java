### BoxLayout

- The BoxLayout organizes the elements horizontally or vertically.
- Instance:
    ```
    / *
    First parameter, container
    Second parameter, distribution of the elements
    * /
    BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
    BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
    ```

- In addition you can create an empty area to better organize the space or create a horizontal or vertical restrictions that leave an element fixed.
- Example:
    ```
    getContentPane().add(Box.createRigidArea(new Dimension(100,100)));
    getContentPane().add(Box.createVerticalGlue());
    getContentPane().add(Box.createHorizontalGlue());
    ```
