import interfaces.IEvent;
import utils.Car;

/*
    Author: Daniel Romero
    Exercise: anonymous classes and event
*/

public class Main
{
    // Methods
    void init()
    {
        IEvent iEvent = new IEvent() {
            @Override
            public boolean cancel(int speed) {
                if (speed>=0)
                    return true;

                return false;
            }

            @Override
            public void make(Object o) {
                Car c = (Car) o;
                System.out.println(c.toString());
            }
        };

        Car c = new Car("Audi");
        c.setSpeed(10);
        c.setSpeedEvent(iEvent);
        c.setSpeed(0);
        c.setSpeed(-10);
        c.setSpeed(0);
        c.setSpeed(15);
        c.setSpeed(30);
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}