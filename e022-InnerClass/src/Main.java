/*
    Author: Daniel Romero
    Exercise: inner class
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        ExampleClass e = new ExampleClass();
        ExampleClass.cInner i = e.new cInner();
        i.print();

        System.out.println("------------------- or ------------------");

        new ExampleClass().new cInner().print();
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}