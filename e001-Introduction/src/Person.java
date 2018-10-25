// Person Class
class Person
{
    // Properties
    String name;
    double height;
    double weight;
    int age;

    // Constructor
    Person(String name, double height, double weight, int age)
    {
        /*
            With "this" we refer to the current object.
            In this way we match the attributes of our object to the parameters that have passed in the creation of the object.
        */
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;

        System.out.println("------------\nCreated object!!!!");
    }

    // Methods
    void eat()
    {
        System.out.println("Is eating");
    }

    void drink()
    {
        System.out.println("Is drinking");
    }

    void sleep()
    {
        System.out.println("Is sleeping");
    }
}
