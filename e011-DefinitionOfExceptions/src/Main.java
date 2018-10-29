import exceptions.AgeOutOfRangeException;
import utils.Person;

/*
    Author: Daniel Romero
    Exercise: creating our own exception
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {

        Person p = new Person("David", 26);

        try {
            p.setAge(140);
        }catch (AgeOutOfRangeException e) {
            System.out.println("ERROR - " + e.getMessage());
        }

        System.out.println("-------------\n" + p + "\n-------------");

        p.setAge(150);
        System.out.println(p);
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}