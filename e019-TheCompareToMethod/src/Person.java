public class Person implements Comparable<Person>
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
    public int compareTo(Person o)
    {
        int r = 0;

        if (this.weight<o.getWeight()) r = -1;
        else if (this.weight>o.getWeight()) r = 1;
        else
        {
            if (this.height<o.getHeight()) r = -1;
            else if (this.height>o.getHeight()) r = 1;
            else r = this.name.compareTo(o.getName());
        }

        return r;
    }
}
