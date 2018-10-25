import enumPackage.Color;
import utils.Person;

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
        // Calling values()
        Color arr[] = Color.values();

        for (Color col : arr)
            System.out.println(col + " -> " + col.ordinal());

        System.out.println(Color.valueOf("BLOND") + "\n----------");

        Person personGonzalo = new Person("Gonzalo");
        System.out.println(personGonzalo.getAge());
        System.out.println(personGonzalo.getHairColor());

        personGonzalo.setHairColor(String.valueOf(Color.valueOf("BROWN")));
        System.out.println(personGonzalo.getHairColor());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
