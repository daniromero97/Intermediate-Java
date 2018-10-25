/*
    Author: Daniel Romero
    Exercise: Enum
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Color hair = Color.BLOND;

        System.out.println("Eumelanin: " + hair.getEumelanin());
        System.out.println("Pheomelanin: " + hair.getPheomelanin());

    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
