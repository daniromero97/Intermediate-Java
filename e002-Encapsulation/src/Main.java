/*
    Author: Daniel Romero
    Exercise: Instance objects with encapsulation
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person personGonzalo = new Person("Gonzalo", 1.78, 74.0, 25);

        System.out.println(personGonzalo.getName());
        personGonzalo.setName("Pedro");
        System.out.println(personGonzalo.getName());


        Person personDavid = new Person("David", 1.74, 70.0, 22);
        System.out.println(personDavid.getWeight());
        personDavid.eat();
        System.out.println(personDavid.getWeight());
        personDavid.drink();
        System.out.println(personDavid.getWeight());
        personDavid.sleep();
        System.out.println(personDavid.getWeight());
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
