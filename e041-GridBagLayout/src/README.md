- The GridBagLayout divides the space into rows and columns depending on the number of elements that are added to the container.
- It is one of the most complete layouts but it is also one of the most difficult to deal with.
- This layout has some constraints that will be attached to each component at the time of adding it to the layout.
- Example:
    ```
    GridBagLayout gridBagLayout = new GridBagLayout();  // Layout
    GridBagConstraints gridBagConstraints = new GridBagConstraints();   // Constraints

    // row 0 column 0
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 0;
    gridBagConstraints.anchor = GridBagConstraints.CENTER;
    gridBagConstraints.insets = new Insets(5,5,5,5);
    this.getContentPane().add(myLabel, gridBagConstraints);

    // row 0 column 1
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.CENTER;
    gridBagConstraints.insets = new Insets(5,5,5,5);
    this.getContentPane().add(myTextField, gridBagConstraints);

    // row 1 column 0 span 2
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.CENTER;
    gridBagConstraints.insets = new Insets(5,5,5,5);
    this.getContentPane().add(myButton, gridBagConstraints);
    ```

- Constraints:

    - gridx / gridy: location of the row / column component.
        - The first row / column is position 0.
        - If it is the last component of the row / column, the GridBagConstrain.RELATIVE value is used.

    - gridWidth / gridHeight: indicates the number of rows or columns that the component will occupy.
        - If it is the last component of the row, the GridBagConstrain.REMAINDER value is used.
        - If it is the first component of the row, the value GridBagConstraint.RELATIVE is used.

    - fill: indicates how the empty space is filled by the component that occupies the layout.
        - This filling can be HORIZONTAL, VERTIAL, BOTH, NONE.

    - weightx / weighty: indicates how weights are distributed along rows or columns when the interface is scaled.
        - The values ​​will be between 0.0 and 1.0.

    - inset: indicates the external padding that will be assigned to each of the elements.
        - It is defined as an individual object: new Inset (1,1,1,1).

    - anchor: indicates the severity of the element within your cell.
        - Values ​​are used: CENTER (the default), PAGE_START, PAGE_END, LINE_START, LINE_END, FIRST_LINE_START, FIRST_LINE_END, LAST_LINE_END, and LAST_LINE_STAR.
