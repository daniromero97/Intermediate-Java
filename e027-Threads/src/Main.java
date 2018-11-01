import utils.Barber;

/*
    Author: Daniel Romero
    Exercise: threads
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        long t = System.currentTimeMillis();
        Barber b1 = new Barber("b1", 8, t);
        Barber b2 = new Barber("b2", 15, t);

        b1.start();
        b2.start();
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}

