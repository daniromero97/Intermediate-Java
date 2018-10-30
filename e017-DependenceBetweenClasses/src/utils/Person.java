package utils;

public class Person
{
    private String name;
    private int weight;
    private double height;
    private Dog dog;

    public Person(String name, int weight, double height, Dog dog) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dog = dog;
    }

    public Person(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
