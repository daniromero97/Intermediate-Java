package utils;

public class Barber extends Thread
{
    private String nameBarber;
    private int clients;
    private long time;

    // Constructor
    public Barber(String nameBarber, int clients, long time)
    {
        this.nameBarber = nameBarber;
        this.clients = clients;
        this.time = time;
    }

    // Getters and setters
    public String getNameBarber() {
        return nameBarber;
    }

    public void setNameBarber(String nameBarber) {
        this.nameBarber = nameBarber;
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    @Override
    public void run()
    {
        for (int i=0; i<clients; i++)
        {
            System.out.println("Barber: " + getNameBarber() +
                    ", client: " + i +
                    ", time (seg): " + (System.currentTimeMillis() - getTime()) / 1000);
        }
    }

}