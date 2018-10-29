package utils;

import exceptions.AgeOutOfRangeException;

public class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

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

    public void setAge(int age)
    {
        if(age<0 || age>120)
            throw new AgeOutOfRangeException("The age must be between 0 and 120");

        this.age = age;
    }


    @Override
    public String toString()
    {
        return "Name: " + getName() +
                "\nAge: " + getAge();
    }
}
