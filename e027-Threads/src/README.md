- The threads allow us to perform several tasks simultaneously.

- To create a thread in java you just have to create a class that inherits from the Thread class and define the run() method.
- Then the class is instantiated and the start() method is called to start the thread.
- Example:
    ```
    // Class ThreadExample
    public class ThreadExample extends Thread
    {
        public void run()
        {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
    }
    ```

    ```
    // Class Main
    public class Main
    {
        // Methods
        void init()
        {
            for (int i=0; i<5; i++)
            {
                ThreadExample threadExample = new ThreadExample();
                threadExample.start();
            }
        }

        // Main method
        public static void main (String args[])
        {
            new Main().init();
        }
    }
    ```


- Another form without inheriting from the "Thread" class is to implement the "Runnable" Interface.
- In this case we can overwrite the methods of the Thread class since we will not use it and we will only have
    to overwrite the run() method so that the processes implemented in that method are executed in a different thread.

- Example:
    ```
    // Class ThreadExample
    public class ThreadExample implements Runnable
    {
        public void run()
        {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
    }
    ```

    ```
    // Class Main
    public class Main
    {
        // Methods
        void init()
        {
            for (int i=0; i<5; i++)
            {
                Thread thread = new Thread(new ThreadExample());
                thread.start();
            }
        }

        // Main method
        public static void main (String args[])
        {
            new Main().init();
        }
    }
    ```
