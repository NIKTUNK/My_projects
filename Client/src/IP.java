public class IP extends Client
{

    @Override
    public void put(int amount)
    {
        if (amount < 1000)
        {
            amount *= 0.9;
            super.put(amount);
        }
        else
        {
            amount *= 0.95;
            super.put(amount);
        }
    }
}
