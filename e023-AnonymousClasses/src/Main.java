import interfaces.IVehicle;
import utils.Car;

/*
    Author: Daniel Romero
    Exercise: anonymous classes
*/

public class Main
{
    // Methods
    void init()
    {
        IVehicle iVehicle = new IVehicle() {
            @Override
            public int speedUp(int n) {
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
        };

        Car c = new Car("Audi");
        c.setiVehicle(iVehicle);
        System.out.println(c.getBrand() + ", actual speed: " + c.getiVehicle().speedUp(4));
        System.out.println(c.getBrand() + ", actual speed: " + c.getiVehicle().speedUp(5));



        Car c2 = new Car("Bmw");
        c2.setiVehicle(new IVehicle() {
            @Override
            public int speedUp(int n) {
                int sp = 55;
                switch (n)
                {
                    case 1:
                        sp = 15;
                        break;
                    case 2:
                        sp = 35;
                        break;
                    case 3:
                        sp = 55;
                        break;
                    case 4:
                        sp = 75;
                        break;
                    case 5:
                        sp = 105;
                        break;
                    case 6:
                        sp = 125;
                        break;
                }
                return sp;
            }
        });
        System.out.println(c2.getBrand() + ", actual speed: " + c2.getiVehicle().speedUp(4));
        System.out.println(c2.getBrand() + ", actual speed: " + c2.getiVehicle().speedUp(5));
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}