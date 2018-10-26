package utils;

public class Car
{
    // Attributes
    private String brand;
    private int yearModel, priceModel;

    // Constructor
    public Car(String brand, int yearModel, int priceModel)
    {
        this.brand = brand;
        this.yearModel = yearModel;
        this.priceModel = priceModel;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(int priceModel) {
        this.priceModel = priceModel;
    }
}
