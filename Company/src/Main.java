import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> emplo = new ArrayList<>();

        for (int i = 0; i <4; i++) {
            Employee em = new Operator();
            em.salary();
            emplo.add(em);
        }
        for (int i = 0; i < 3; i++) {
            Employee em = new Manager();
            em.salary();
            em.getMonthSalary();
            emplo.add(em);
        }
        for (int i = 0; i < 2; i++) {
            Employee em = new TopManager();
            em.salary();
            em.getMonthSalary();
            emplo.add(em);
        }
        int a = 0;
        for(Employee i : emplo)
        {
            a++;
            System.out.println(a + " " + i.getMonthSalary() + " " + i.getIncome());
        }

//        for (Employee e : emp)
//            System.out.println(e);
    }
}
