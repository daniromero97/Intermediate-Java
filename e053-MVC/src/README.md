## Model view controller (MVC)

. The model view controller is one of the most used design patterns in the software architecture, separates the data and the logical part of the graphic representation. 
. The MVC is divided into three distinct parts: the model, the view and the controller.


#### Model

. Representation of the logical part of the application. All the elements that realize the functionality of the application are located.
. Send the requested information to the 'view' to be displayed.
. Generally the methods will have as parameters those data that will be captured from the view.


#### View 

. In this part all the graphic elements of the application are located (Graphical user interface).


#### Controller

. It represents the union between the model and the view.
. Respond to events and invoke requests to the 'model' about the information.
. In this class the listeners will be placed, so it is important that the view has the necessary get methods for each element.
. It will be essential to create two objects of type view and model, which will be implemented in the constructor so they can communicate.



## SwingUtilities.invokeLater()

. An initial thread schedules the GUI creation task by invoking javax.swing.SwingUtilities.invokeLater or javax.swing.SwingUtilities.invokeAndWait . 
. Both of these methods take a single argument: the Runnable that defines the new task. Their only difference is indicated by their names: invokeLater simply schedules the task and returns; invokeAndWait waits for the task to finish before returning.
. Official documentation: 