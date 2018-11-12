package utils;

public class Person
{
    private String name, surname;
    private int age;
    private boolean isWorking;

    public Person(String name, String surname, int age, boolean isWorking)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isWorking = isWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nAge: " + getAge() +
                "\nIs working: " + isWorking();
    }
}
