import utils.Car;
import utils.Person;

/*
    Author: Daniel Romero
    Exercise: equals() and toString()
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person p = new Person("Gonzalo", 25);
        Person p2 = new Person("Gonzalo", 28);
        Car c = new Car("Audi", 2010, 28000);
        Car c2 = new Car("Audi", 2013, 28000);
        Car c3 = c;

        System.out.println("Method toString () overwritten\n---------------------");
        System.out.println(p.toString());

        System.out.println("\nMethod toString() without overwriting\n---------------------");
        System.out.println(c.toString());


        System.out.println("\n\n---------------- equals ----------------");
        System.out.println("c.equals(c2): " + c.equals(c2));    //  The references point to different memory areas. (Different objects)
        System.out.println("p.equals(p2)" + p.equals(p2));      //  Method equals() overwritten, they are comparing their names
        System.out.println("c.equals(c3): " + c.equals(c3));    //  References point to the same memory area.

        System.out.println("(c == c2): " + (c == c2));    //  The references point to different memory areas. (Different objects)
        System.out.println("(p == p2)" + (p == p2));      //  The references point to different memory areas. (Different objects)
        System.out.println("(c == c3): " + (c == c3));    //  References point to the same memory area.
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
