
//Нужно проверить, можно ли из букв слова str1 составить слово str2, используя букву не больше одного раза

import java.util.HashMap;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String str1 = "jdjjdow";//scanner.nextLine();

        System.out.println("Введите второе слово: ");
        String str2 = "jpow";//scanner.nextLine();

        char a;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i< str1.length(); i++)
        {
            a=str1.charAt(i);
            if (!(map.containsKey(a)))
                map.put(a,1);
            else
                map.put(a,map.get(a)+1);
        }

        System.out.println("Новый map: " + map);
        boolean check = true;
        for (int i=0; i <str2.length(); i++)
        {
            a= str2.charAt(i);

            if (map.containsKey(a) && map.get(a)>0)
            {
                map.put(a,map.get(a)-1);
            }
            else
            {
                System.out.println("Error!!!");
                check = false;
                break;
            }
        }
        System.out.println("Полученный map: " +map);
        if (check)
            System.out.println("Success");
        else
            System.out.println("Fail");
    }
}