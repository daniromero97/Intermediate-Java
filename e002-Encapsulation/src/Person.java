// Person Class
class Person
{
    // Properties
    private String name;
    private double height, weight;
    private int age;

    // Constructor
    public Person(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
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

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    private void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    // Methods
    public void eat() {
        System.out.println("Is eating");
        setWeight(getWeight()+0.4);
    }

    public void drink() {
        System.out.println("Is drinking");
        setWeight(getWeight()+0.35);
    }

    public void sleep() {
        System.out.println("Is sleeping");
        setWeight(getWeight()-0.7);
    }

}