public class Employee extends Company
{
    int salary ;
    public void salary()
    {
        salary = 1000;
//        System.out.println(salary);
    }

    public void Employee(int salary) {
        this.salary = salary;
    }

    public int getMonthSalary()
    {
        return salary;
    }
}

