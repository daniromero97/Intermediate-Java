public enum Color
{
    BROWN(10,5),
    BLOND(8,4),
    BLACK(6,3);

    int eumelanin = 0;
    int pheomelanin = 0;

    public int getEumelanin()
    {
        return eumelanin;
    }

    public int getPheomelanin()
    {
        return pheomelanin;
    }

    Color(int eumelanin, int pheomelanin)
    {
        this.eumelanin = eumelanin;
        this.pheomelanin = pheomelanin;
    }
}
