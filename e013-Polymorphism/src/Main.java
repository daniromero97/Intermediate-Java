import vehicles.Car;
import vehicles.Motorcycle;

/*
    Author: Daniel Romero
    Exercise: polymorphism
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Object[] o = {
                new Object(),
                new Car("Audi", false),
                new Motorcycle("Honda", false)
        };

        for (int i=0; i<o.length; i++)
        {
            System.out.println("---------- "+i+" -----------");
            System.out.println(o[i].toString());
            System.out.println("----------------------------");
        }
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}