package vehicles;

public class Motorcycle extends Vehicle
{
    private boolean sidecar;

    public Motorcycle(int wheels, int weight, String brand, boolean sidecar)
    {
        super(wheels, weight, brand);
        this.sidecar = sidecar;
    }

    public boolean useSidecar()
    {
        return sidecar;
    }

    public void setSidecar(boolean sidecar)
    {
        this.sidecar = sidecar;
    }

    @Override
    public void speedUp()
    {
        System.out.println("Speed up (from the subclass motorcycle)");
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nTrailer: " + useSidecar();
    }
}
