abstract public class Client
{
    int money;

    public void take (int amount) {
        money -= amount;
    }

    public void put(int amount) {
        money += amount;
    }

    public String getMoney() {
        return (""+money);
    }
}