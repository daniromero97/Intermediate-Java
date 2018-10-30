import utils.Car;

/*
    Author: Daniel Romero
    Exercise: interfaces
*/

public class Main
{
    // Methods
    void init()
    {
        System.out.println("wheels: " + new Car().WHEELS);
        System.out.println(new Car().speedUp());
        System.out.println(new Car().speedUp(3));
        System.out.println(new Car().turnRight());
        System.out.println(new Car().turnLeft());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}