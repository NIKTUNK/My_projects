import java.util.*;

class Eee_cars
{
    //
    //
    //
    // We need to show all car license plates
    //
    //
    //
    public static void main(String[] args)
    {

        String[] chars = {"A", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            String first = chars[i];
            for (int litter1 = 0; litter1 < 10; litter1++) {
                for (int litter2 = 0; litter2 < 10; litter2++) {
                    for (int litter3 = 0; litter3 < 10; litter3++) {
                        for (int region = 1; region < 198; region++) {

                            list.add(first + litter1 + litter2 + litter3 + first + first + region);
                        }
                    }
                }
            }
        }

//        for (String item : list)
//            System.out.println(item);
        Scanner scanner = new Scanner(System.in);

        for (; ; )
        {
            System.out.print("Введите номер: ");
            String input = scanner.nextLine();

            long start1 = System.nanoTime();
            boolean a = list.contains(input);
            long final1 = System.nanoTime();

            if (a)
                System.out.println("Элемент найден");
            else
            {
                System.out.println("Нет такого номера");
                continue;
            }
// Х999ХХ193
            long start2 = System.nanoTime();
            int binary = Collections.binarySearch(list, input);
            long final2 = System.nanoTime();

            Collections.sort(list);
            long start3 = System.nanoTime();
            int binary2 = Collections.binarySearch(list, input);
            long final3 = System.nanoTime();

            TreeSet<String> tree = new TreeSet<>(list);
            long start4 = System.nanoTime();
            boolean b = tree.contains(input);
            long final4 = System.nanoTime();

            HashSet <String> hash = new HashSet<>(list);
            long start5 = System.nanoTime();
            boolean c = hash.contains(input);
            long final5 = System.nanoTime();

            System.out.println("ArrayList Время 1 = " + (final1 - start1));
            System.out.println("binarySearch Время 2 = " + (final2 - start2));
            System.out.println("sort + binarySearch Время 3 = " + (final3 - start3));
            System.out.println("TreeSet Время 4 = " + (final4 - start4));
            System.out.println("HashSet Время 5 = " + (final5 - start5));
            System.out.println("\n");
        }
    }
}