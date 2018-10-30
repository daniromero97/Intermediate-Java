package vehicles;

public final class Car extends Vehicle
{
    private boolean trailer;

    public Car(String brand, boolean trailer)
    {
        super(brand);
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

    /*
    -------- It can not be overwritten --------
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("and speed up (from the subclass car)");
    }
    */

    @Override
    public String toString()
    {
        return super.toString() +
                "\nTrailer: " + useTrailer();
    }
}
