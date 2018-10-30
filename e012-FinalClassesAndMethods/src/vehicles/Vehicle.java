package vehicles;

public class Vehicle
{
    // attributes
    private String brand;

    // constructor
    protected Vehicle(String brand)
    {
        this.brand = brand;
    }

    // getters and setters
    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand)
    {
        this.brand = brand;
    }

    // methods
    public final void speedUp()
    {
        System.out.println("Speed up (from the parent class)");
    }

    // override
    @Override
    public boolean equals(Object obj)
    {
        Vehicle m = (Vehicle) obj;
        return m.getBrand().equals(this.getBrand());
    }

    @Override
    public String toString()
    {
        return "Brand: " + getBrand();
    }
}
