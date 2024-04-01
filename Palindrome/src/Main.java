import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String input = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        char[] array = input.toCharArray();
        for (char i : array)
            list.add(i);
        System.out.println(list);
        ListIterator index = list.listIterator();
        ListIterator reverseindex = list.listIterator(list.size());
        boolean pal = true;
        for (;index.hasNext() && reverseindex.hasPrevious();)
        {
            if (index.next() != reverseindex.previous())
            {
                pal = false;
                break;
            }
        }
        System.out.println(pal);
    }
}