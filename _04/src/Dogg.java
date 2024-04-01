public class Dogg
{
    private double energy;
    private double originEnergy = 100;
    private String hair;
    private double weight;
    private String name;

    public void setName (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public Dogg()
    {
        weight = 50 + 100 * originEnergy;
        energy = 50 + 100 * Math.random();
    }
    public String getColor()
    {
        return hair;
    }

    public Dogg(String hair)
    {
        this();
        this.hair = hair;
    }

    public void sleep()
    {
        energy = energy + 1;
    }

    public double getEnergy()
    {
        return energy;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setHair(String hair)
    {
        this.hair = hair;
    }

    public String getHair ()
    {
        return hair;
    }

    public void setTransportType(TransportType type)
    {

    }

    public String getStatus()
    {
        if (energy < originEnergy)
        {
            return "Need too sleep";
        }
        if (energy > originEnergy)
        {
            return "Need to play";
        }
        else
        {
            return "Normal condition";
        }
    }
}

