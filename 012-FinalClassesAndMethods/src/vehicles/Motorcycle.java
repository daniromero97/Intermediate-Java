package vehicles;

public final class Motorcycle extends Vehicle
{
    private boolean sidecar;

    public Motorcycle(String brand, boolean sidecar)
    {
        super(brand);
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

    /*
    -------- It can not be overwritten --------
    @Override
    public void speedUp()
    {
        System.out.println("Speed up (from the subclass motorcycle)");
    }
    */

    @Override
    public String toString()
    {
        return super.toString() +
                "\nTrailer: " + useSidecar();
    }
}
