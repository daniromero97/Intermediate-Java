/*
    Author: Daniel Romero
    Exercise: comparison of String, StringBuffer and StringBuilder
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        string(10000);  // 10.000
        stringBuilder(10000000);    // 10.000.000
        stringBuffer(10000000);     // 10.000.000
    }

    public void string(int turns)
    {
        String string = "Hello world";
        long startTime = System.currentTimeMillis();

        for (int i=0; i<turns; i++)
            string += "Hello world";

        long endTime = System.currentTimeMillis();
        System.out.println("Time of String: " + (endTime - startTime));
    }

    public void stringBuilder(int turns)
    {
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        long startTime = System.currentTimeMillis();

        for (int i=0; i<turns; i++)
            stringBuilder.append("Hello world");

        long endTime = System.currentTimeMillis();
        System.out.println("Time of StringBuilder: " + (endTime - startTime));
    }

    public void stringBuffer(int turns)
    {
        StringBuffer stringBuffer = new StringBuffer("Hello world");
        long startTime = System.currentTimeMillis();

        for (int i=0; i<turns; i++)
            stringBuffer.append("Hello world");

        long endTime = System.currentTimeMillis();
        System.out.println("Time of StringBuffer: " + (endTime - startTime));
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}