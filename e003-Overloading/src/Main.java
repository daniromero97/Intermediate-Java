/*
    Author: Daniel Romero
    Exercise: Overloading methods
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person personGonzalo = new Person("Gonzalo", 20);

        System.out.println(personGonzalo.getAge());
        personGonzalo.turnYears();
        System.out.println(personGonzalo.getAge());


        Person personDavid = new Person("David");

        System.out.println(personDavid.getAge());
        personDavid.turnYears();
        System.out.println(personDavid.getAge());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
