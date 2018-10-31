package utils;

import interfaces.IEvent;

public class Car
{
    private String brand;
    private int speed;
    private IEvent speedEvent = null;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed)
    {
        if (getSpeedEvent()!=null && getSpeedEvent().cancel(speed))
        {
            this.speed = speed;
            getSpeedEvent().make(this);
        }
    }

    public IEvent getSpeedEvent() {
        return speedEvent;
    }

    public void setSpeedEvent(IEvent speedEvent) {
        this.speedEvent = speedEvent;
    }

    @Override
    public String toString() {
        return "-------------------\nBrand: " + getBrand() +
                "\nSpeed: " + getSpeed();
    }
}
