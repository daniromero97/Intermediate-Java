import utils.Square;

/*
    Author: Daniel Romero
    Exercise:
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Square s = new Square("red", 10, 15);
        System.out.println(s.getColor());
        System.out.println(s.area());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}