import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

/*
    Author: Daniel Romero
    Exercise: inheritance
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Car c = new Car(4, 1200, "Audi", false);
        Car c2 = new Car(4, 1100, "Honda", false);
        Motorcycle m = new Motorcycle(2, 217, "Honda", false);
        Vehicle v = c2;


        System.out.println("\n--------------- toString() ---------------");
        System.out.println(c.toString());
        System.out.println("---------------");
        System.out.println(m.toString());
        System.out.println("---------------");
        System.out.println(v.toString());
        System.out.println("---------------");


        System.out.println("\n--------------- speedUp() ---------------");
        c.speedUp();
        System.out.println("---------------");
        m.speedUp();
        System.out.println("---------------");
        v.speedUp();
        System.out.println("---------------");


        System.out.println("\n--------------- equals() ---------------");
        System.out.println("c.equals(c2): " + c.equals(c2));
        System.out.println("c.equals(m): " + c.equals(m));
        System.out.println("c2.equals(m): " + c2.equals(m));

        System.out.println("v.equals(c2): " + v.equals(c2));
        System.out.println("v.equals(m): " + v.equals(m));
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}