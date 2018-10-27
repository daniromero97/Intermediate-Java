import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

import java.lang.reflect.Field;

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
        Vehicle v = new Car(4, 1100, "Honda", false);
        Car c = new Car(4, 1200, "Audi", false);
        Motorcycle m = new Motorcycle(2, 217, "Honda", false);
        Vehicle vehicle = c;

        System.out.println("----------- getName() and getSimpleName() -----------");
        System.out.println(v.getClass().getName());
        System.out.println(v.getClass().getSimpleName());

        System.out.println("-----------------------------");
        System.out.println(c.getClass().getName());
        System.out.println(c.getClass().getSimpleName());

        System.out.println("-----------------------------");
        System.out.println(m.getClass().getName());
        System.out.println(m.getClass().getSimpleName());

        System.out.println("-----------------------------");
        System.out.println(vehicle.getClass().getName());
        System.out.println(vehicle.getClass().getSimpleName());
    }


    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}