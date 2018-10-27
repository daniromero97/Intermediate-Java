import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

/*
    Author: Daniel Romero
    Exercise: instanceOf
*/


// Class Main
public class Main
{
    // Methods
    public void init()
    {
        String s = "Hello world";
        if (s instanceof  String)
            System.out.println("s is an instance of the String class");


        Car c = new Car(4, 1150, "Mercedes", false);
        if (c instanceof Vehicle)
            System.out.println("c is a car and also a vehicle");


        Vehicle v = new Car(4, 1200, "Audi", false);
        cast(v);
    }

    public void cast(Vehicle vehicle)
    {
        if (vehicle instanceof Car)
            ((Car)vehicle).speedUp();
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}