public class Person implements Cloneable
{
    private String name;
    private int weight;
    private double height;

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

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nWeight: " + getWeight() +
                "\nHeight: " + getHeight();
    }


    @Override
    protected Object clone()
    {
        Object o = null;
        try {
            o = super.clone();
        }catch (CloneNotSupportedException e)
        {
            System.out.println("Error, you can not clone");
        }

        return o;
    }
}
