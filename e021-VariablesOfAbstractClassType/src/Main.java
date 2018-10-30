import utils.Figure;
import utils.Square;

/*
    Author: Daniel Romero
    Exercise: variables of abstract class type
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Figure f = new Square("red", 10, 15);
        System.out.println(f.getColor());

        if (f instanceof Square)
            System.out.println(f.area());
        else
            System.out.println("f is not an instance of Square");
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}