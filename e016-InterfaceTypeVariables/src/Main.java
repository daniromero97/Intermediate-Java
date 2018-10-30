import interfaces.Vehicle;
import utils.Car;

/*
    Author: Daniel Romero
    Exercise: interface type variables
*/

public class Main
{
    // Methods
    void init()
    {
        Car c = new Car("Audi");
        Vehicle v = null;
        v = c;

        /*
            Only the members of the interface can be accessed from the "v" variable.
            If from "v" you want to access other members of the "Car" class, you simply have to convert to "Car" in the following way
        */

        if (v instanceof Car)
        {
            String brand = ((Car) v).getBrand();
            System.out.println(brand);
        }
        else System.out.println("v is not an instance of Car");
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}