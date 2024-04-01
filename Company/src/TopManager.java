public class TopManager extends Employee
{


    @Override
    public int getMonthSalary() {
        if (compIncome > 150000)
            return (int)(super.getMonthSalary() * 1.5);
        else
            return super.getMonthSalary();
    }
}
