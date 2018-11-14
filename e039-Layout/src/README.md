### CardLayout

- In charge of managing more than one component (usually a Jpanel that in turn have layouts) where only one of them is displayed and at any time it can be hidden.
- Instance:
    ```
    CardLayout cardLayout = new CardLayout();
    centerPanel.setLayout(cardLayout);
    ```

- Add an element to the cardlayout:
    ```
    centerPanel.add(jPanel1, "p1");
    centerPanel.add(jPanel2, "p2");
    centerPanel.add(jPanel3, "p3");
    centerPanel.add(jPanel4, "p4");
    ```

- Show panel:
    ```
    cardLayout.show(centerPanel, "p1");
    ```
    
- Manage panels:
    ```
    cardLayout.first(centerPanel);
    cardLayout.previous(centerPanel);
    cardLayout.next(centerPanel);
    cardLayout.last(centerPanel);
    ```
    
    
    