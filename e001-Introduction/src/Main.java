/*
    Author: Daniel Romero
    Exercise: Instance objects
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person personGonzalo = new Person("Gonzalo", 1.78, 74.0, 25);
        System.out.println(personGonzalo.name);
        personGonzalo.eat();
        personGonzalo.sleep();


        Person personDavid = new Person("David", 1.74, 70.0, 22);
        System.out.println(personGonzalo.age);
        personDavid.drink();
        personDavid.sleep();
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
