import java.io.*;

/*
    Author: Daniel Romero
    Exercise: serialization
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        Person person = new Person("Gonzalo", 25);
        System.out.println(person);

        byte[] bytes = writeSerialization(person);
        Person p = (Person) readSerialization(bytes);
        System.out.println(p);
    }

    public byte[] writeSerialization(Object o)
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try
        {
            ObjectOutputStream oost = new ObjectOutputStream(baos);
            oost.writeObject(o);
            oost.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

    public Object readSerialization(byte[] bytes)
    {
        Person p = null;
        try
        {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            p = (Person) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}