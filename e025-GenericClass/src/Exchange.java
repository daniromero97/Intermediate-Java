public class Exchange<T>
{
    private T first;
    private T second;

    public Exchange(T first, T second)
    {
        this.first = first;
        this.second = second;
        System.out.println("----------\n" + this.toString());
    }

    public T getFirst()
    {
        return this.first;
    }

    public T getSecond()
    {
        return this.second;
    }

    public Exchange<T> setFirst(T first)
    {
        if(first == null)
            throw new RuntimeException("The value can not be null");

        this.first = first;
        return this;
    }
    public Exchange<T> setSecond(T second)
    {
        if(second == null)
            throw new RuntimeException("The value can not be null");

        this.second = second;
        return this;
    }

    public void change()
    {
        T aux = getFirst();
        setFirst(getSecond());
        setSecond(aux);
        System.out.println("----------\n" + this.toString());
    }


    @Override
    public String toString()
    {
        return "First: " + first +
                "\nsecond: " + second;
    }
}
