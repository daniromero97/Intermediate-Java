/*
    Author: Daniel Romero
    Exercise: static
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        System.out.println("Eyes: " + Person.EYES);
        System.out.println("Name: " + new Person("Luis", 25).getName());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
