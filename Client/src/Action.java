import java.util.Scanner;

public class Action
{
    public static void main(String[] args)
    {
        for(;;)
        {
            System.out.print("Menu:\n1) Phys\n2) Comp\n3) IP\n4) Exit\n\nChoose your type: ");
            Scanner scanner = new Scanner(System.in);
            int input1 = scanner.nextInt();
            if(input1 == 1)
            {
                 Client person  = new Phys();
                 for(;;)
                 {
                     System.out.print("Menu:\n1) Put money\n2) Take money\n" +
                             "3) Show all money\n4) Exit\n\nChoose your action: ");
                     int input2 = scanner.nextInt();
                     if (input2 == 1) {
                         System.out.print("Set the amount of the money: ");
                         int amount = scanner.nextInt();
                         person.put(amount);
                         System.out.println("\n");
                     }
                     if (input2 == 2) {
                         System.out.print("Set the amount of the money: ");
                         int amount = scanner.nextInt();
                         person.take(amount);
                     }
                     if (input2 == 3) {
                         System.out.print("All your money: " + person.getMoney() + "\n");
                     }
                     if (input2 == 4)
                         break;
                 }
            }
            if(input1 == 2)
            {
                Client person  = new Comp();
                for(;;)
                {
                    System.out.print("Menu:\n1) Put money\n2) Take money\n" +
                            "3) Show all money\n4) Exit\n\nChoose your action: ");
                    int input2 = scanner.nextInt();
                    if (input2 == 1) {
                        System.out.print("Set the amount of the money: ");
                        int amount = scanner.nextInt();
                        person.put(amount);
                        System.out.println("\n");
                    }
                    if (input2 == 2) {
                        System.out.print("Set the amount of the money: ");
                        int amount = scanner.nextInt();
                        person.take(amount);
                    }
                    if (input2 == 3) {
                        System.out.print("All your money: " + person.getMoney() + "\n");
                    }
                    if (input2 == 4)
                        break;
                }
            }
            if(input1 == 3)
            {
                Client person  = new IP();
                for(;;)
                {
                    System.out.print("Menu:\n1) Put money\n2) Take money\n" +
                            "3) Show all money\n4) Exit\n\nChoose your action: ");
                    int input2 = scanner.nextInt();
                    if (input2 == 1) {
                        System.out.print("Set the amount of the money: ");
                        int amount = scanner.nextInt();
                        person.put(amount);
                        System.out.println("\n");
                    }
                    if (input2 == 2) {
                        System.out.print("Set the amount of the money: ");
                        int amount = scanner.nextInt();
                        person.take(amount);
                    }
                    if (input2 == 3) {
                        System.out.print("All your money: " + person.getMoney() + "\n");
                    }
                    if (input2 == 4)
                        break;
                }
            }
            if (input1 == 4)
                break;
        }
    }
}