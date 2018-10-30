package utils;

import interfaces.Vehicle;

public class Car implements Vehicle
{
    @Override
    public int speedUp()
    {
        return 10;
    }

    @Override
    public int speedUp(int n)
    {
        int sp = 10;
        switch (n)
        {
            case 1:
                sp = 5;
                break;
            case 2:
                sp = 10;
                break;
            case 3:
                sp = 15;
                break;
            case 4:
                sp = 20;
                break;
        }
        return sp;
    }

    @Override
    public String turnLeft() {
        return "turn left with the car";
    }

    @Override
    public String turnRight() {
        return "turn right with the car";
    }
}
