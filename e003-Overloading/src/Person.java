// Person Class
public class Person
{
    // Properties
    private String name;
    private int age;

    // Constructor
    public Person(String name)
    {
        this.name = name;
        setAge(0);
    }

    public Person(String name, int age)
    {
        this.name = name;
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
        setAge(getAge()+1);
    }

}