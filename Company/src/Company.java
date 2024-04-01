import java.util.ArrayList;
import java.util.List;

public class Company
{
    int input;

    public void Company(int compIncome) {
        this.compIncome = compIncome;
    }

    Employee emp;
    int compIncome = 1500;//(int) (100000 + 100000 * Math.random());
    List <Employee> emps = new ArrayList<>();

    public void hire()
    {
        emps.add(emp);
    }

    public void fire()
    {
        emps.remove(input);
    }

    public List <Employee> getEmps() {
        return emps;
    }

    public int getIncome()
    {
        return compIncome;
    }
}