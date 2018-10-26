/*
    Author: Daniel Romero
    Exercise: equals() and toString()
*/


import utils.Car;
import utils.Person;

// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person p = new Person("Gonzalo", 25);
        Person p2 = new Person("Gonzalo", 25);
        Car c = new Car("Audi", 2010, 28000);
        Car c2 = new Car("Bmw", 2013, 31000);

        System.out.println("Method toString () overwritten\n---------------------");
        System.out.println(p.toString());

        System.out.println("\nMethod toString() without overwriting\n---------------------");
        System.out.println(c.toString());



        System.out.println("\n\n---------------- equals ----------------");
        System.out.println(p.equals(p2));

        String s = new String("Gonzalo");
        String s2 = new String("Gonzalo");
        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        String s3 = "hello", s4 = "hello";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
