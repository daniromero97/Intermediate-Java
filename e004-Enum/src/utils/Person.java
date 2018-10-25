package utils;

// utils.Person Class
public class Person
{
    // Properties
    private String name, hairColor;
    private int age;

    // Constructor
    public Person(String name)
    {
        this.name = name;
        setAge(0);
    }

    public Person(String name, int age, String hairColor)
    {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    // getters and setters
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

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    // Methods
    public void turnYears()
    {
        setAge(getAge()+1);
    }

}