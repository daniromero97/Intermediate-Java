package utils;

import interfaces.IVehicle;

public class Car
{
    private String brand;
    private IVehicle iVehicle;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public IVehicle getiVehicle() {
        return iVehicle;
    }

    public void setiVehicle(IVehicle iVehicle) {
        this.iVehicle = iVehicle;
    }
/*
    @Override
    public int speedUp(int n)
    {
        int sp = 50;
        switch (n)
        {
            case 1:
                sp = 10;
                break;
            case 2:
                sp = 30;
                break;
            case 3:
                sp = 50;
                break;
            case 4:
                sp = 70;
                break;
            case 5:
                sp = 100;
                break;
            case 6:
                sp = 120;
                break;
        }
        return sp;
    }
*/
}
