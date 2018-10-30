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
        Person p2 = p;      // Equalize memory addresses
        Person p3 = (Person) p.clone();     // Use of the clone() method;

        System.out.println(
                "------ original -----\n" + p +
                "\n------ equalize -----\n" + p2 +
                "\n------ clone() ------\n" + p3 +
                "\n---------------------\n");
        p.setWeight(75);
        System.out.println(
                "------ original -----\n" + p +
                "\n------ equalize -----\n" + p2 +
                "\n------ clone() ------\n" + p3 +
                "\n---------------------\n");
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}