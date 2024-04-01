import java.util.Scanner;

public class _1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
            char[] str = scanner.nextLine().toCharArray();

            boolean up = false;
            boolean low = false;
            boolean number = false;
            for (int i = 0; i < str.length; i++)
            {
                if (up == false && (int) str[i] > 64 && (int) str[i] < 91)
                    up = true;
                if (number == false && (int) str[i] > 47 && (int) str[i] < 58)
                    number = true;
                if (low == false && (int) str[i] > 96 && (int) str[i] < 123)
                    low = true;
            }
            if (str.length > 7 && up && number && low)
                System.out.println("YES");
            else
                System.out.println("NO");
    }
}