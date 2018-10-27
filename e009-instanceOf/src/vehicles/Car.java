package vehicles;

public class Car extends Vehicle
{
    private boolean trailer;

    public Car(int wheels, int weight, String brand, boolean trailer)
    {
        super(wheels, weight, brand);
        this.trailer = trailer;
    }

    public boolean useTrailer()
    {
        return trailer;
    }

    public void setTrailer(boolean trailer)
    {
        this.trailer = trailer;
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("and speed up (from the subclass car)");
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nTrailer: " + useTrailer();
    }
}
