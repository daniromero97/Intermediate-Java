package vehicles;

public class Vehicle
{
    private int wheels, weight;
    private String brand;

    protected Vehicle(int wheels, int weight, String brand)
    {
        this.wheels = wheels;
        this.weight = weight;
        this.brand = brand;
    }

    protected int getWheels()
    {
        return wheels;
    }

    protected void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(int weight)
    {
        this.weight = weight;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void speedUp()
    {
        System.out.println("Speed up (from the parent class)");
    }

    @Override
    public boolean equals(Object obj)
    {
        Vehicle m = (Vehicle) obj;
        return m.getBrand().equals(this.getBrand());
    }

    @Override
    public String toString()
    {
        return "Brand: " + getBrand() +
                "\nWeight: " + getWeight() +
                "\nWheels: " + getWheels();
    }
}
