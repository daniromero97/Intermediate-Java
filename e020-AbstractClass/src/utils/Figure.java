package utils;

public abstract class Figure
{
    private String color;

    protected Figure(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
}
