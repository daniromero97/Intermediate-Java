- JProgressBar special component whose execution is done in parallel to the other components.
- If it is executed in the main thread, the interface freezes due to the impossibility of the system to give resources to the components
- Examples of the most used:
    ```
    JProgressBar jProgressBar = new JProgressBar(SwingConstants.HORIZONTAL,0,100);

    jProgressBar.getMaximum();
    jProgressBar.getMinimum();
    jProgressBar.setMaximum(100);
    jProgressBar.setMinimum(0);
    jProgressBar.getValue();
    jProgressBar.setOrientation(SwingConstants.VERTICAL);
    jProgressBar.setStringPainted(true);    // Show the percentage
    jProgressBar.setIndeterminate(true)     // No defaults
    ```

- Event used: ChangeListener
    ```
    jProgressBar.addChangeListener(new ChangeListener() {
        ...
    });
    ```

-  Ways to fill the JProgressBar:

    - In the main thread (not recommended):
	```
    for (int i = jProgressBar.getMinimum(); i<jProgressBar.getMaximum()+1; i++)
    {
        jProgressBar.setValue(i);
        Thread.sleep(100);
    }
	```

    - Through a thread of execution:
	```
    myButton.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Runnable runnable = new Runnable()
            {
                @Override
                public void run()
                {
                    for (int i = jProgressBar.getMinimum(); i<jProgressBar.getMaximum()+1; i++)
                    {
                        jProgressBar.setValue(i);
                        try
                        {
                            Thread.sleep(100);
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }
            };

            Thread t = new Thread(runnable);
            t.start();
        }
    });
	```

    - Using a SwingWorker (it's the best way), a specific object used to work in the background with swing:
	```
    public class Worker extends SwingWorker<Boolean,Integer>
    {
        JProgressBar jProgressBar;

        public Worker(JProgressBar jProgressBar)
        {
            this.jProgressBar = jProgressBar;
        }

        @Override
        protected Boolean doInBackground() throws Exception
        {
            for (int i = jProgressBar.getMinimum(); i <= jProgressBar.getMaximum(); i++)
            {
                publish(i);
                Thread.sleep(100);
            }
            return true;
        }

        @Override
        protected void process(List<Integer> chunks)
        {
            jProgressBar.setValue(chunks.get(chunks.size()-1));
        }

        @Override
        protected void done()
        {
            Toolkit.getDefaultToolkit().beep();
        }
    }
	```

	```
	Worker worker = new Worker(jProgressBar);
    worker.execute();
	```
