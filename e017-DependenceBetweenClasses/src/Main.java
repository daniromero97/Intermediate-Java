import utils.Dog;
import utils.Person;

/*
    Author: Daniel Romero
    Exercise: dependence between classes
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person p = new Person("Daniel", 60, 1.7);
        try {
            System.out.println("p: " + p.getDog().getBreed());
        }catch (NullPointerException e){
            System.out.println("p: Attribute \"Dog\" not defined");
        }

        p.setDog(new Dog("Beagle", 10));
        try {
            System.out.println("p: " + p.getDog().getBreed());
        }catch (NullPointerException e){
            System.out.println("p: Attribute \"Dog\" not defined");
        }


        Person p2 = new Person("David", 65, 1.75, new Dog("Pug", 7));
        try {
            System.out.println("p2: " + p2.getDog().getBreed());
        }catch (NullPointerException e){
            System.out.println("p2: Attribute \"Dog\" not defined");
        }

    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}