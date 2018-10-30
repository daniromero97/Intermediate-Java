/*
    Author: Daniel Romero
    Exercise: clone() and compareTo()
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {

        Person p = new Person("Gonzalo", 70, 1.8);
        Person p3 = new Person("Gonzalo", 80, 1.8);

        System.out.println("------------ compareTo() ------------");
        System.out.println(p.compareTo(p3));
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}