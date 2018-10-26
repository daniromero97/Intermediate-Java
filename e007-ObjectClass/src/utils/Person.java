package utils;

public class Person
{
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    private void setAge(int age)
    {
        this.age = age;
    }


    // Methods
    public void turnYears()
    {
        this.age = getAge()+1;
    }


    @Override
    public String toString()
    {
        // return super.toString();
        return "Name: " + name +
                "\nAge: " + age;
    }
}