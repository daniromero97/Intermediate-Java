package utils;

public class Square extends Figure
{
    private double base;
    private double height;

    public Square(String color, double base, double height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area()
    {
        return (getBase() * getHeight()) / 2;
    }
}