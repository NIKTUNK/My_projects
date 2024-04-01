import java.util.Scanner;
import java.util.TreeMap;

public class Map
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        TreeMap<Integer, String> phones = new TreeMap<>();
        for(;;)
        {
            System.out.println("Enter phone number: ");
            int number = scanner.nextInt();
            if (number != 4 && phones.containsKey(number))
            {
                System.out.println(number + "=>" + phones.get(number));
            }
            else if (number == 4)
                System.out.println(phones);
            else
            {
                System.out.println("Enter info: ");
                String info = scanner1.nextLine();
                phones.put(number,info);
            }

        }
    }
}
