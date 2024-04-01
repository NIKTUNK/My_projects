public class Comp extends Client
{
    @Override
    public void take(int amount) {
        amount *= 1.1;
        super.take(amount);
    }
}
