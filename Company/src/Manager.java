public class Manager extends Employee
{


    @Override
    public int getMonthSalary() {
        return (int) (super.getMonthSalary() + 0.05 * compIncome);
    }
}
