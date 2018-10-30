import vehicles.Car;
import vehicles.Motorcycle;

/*
    Author: Daniel Romero
    Exercise: final classes and methods
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Car c = new Car("Audi", false);
        Motorcycle m = new Motorcycle("Honda", false);

        System.out.println("\n--------------- speedUp() ---------------");
        c.speedUp();
        System.out.println("---------------");
        m.speedUp();
        System.out.println("---------------");

    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}