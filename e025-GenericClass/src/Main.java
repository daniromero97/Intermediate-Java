/*
    Author: Daniel Romero
    Exercise: generic class
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Exchange<Integer> i = new Exchange<Integer>(10,20);
        Exchange<String> s = new Exchange<String>("Hello", "World");
        i.change();
        s.change();
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}