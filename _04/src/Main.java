import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        //
        // Need to set to each letter its code
        //
        String auf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        System.out.println("Длина строчки: " + auf.length());
        for (int i = 0 ; i < auf.length(); i++)
        {
            char c = auf.charAt(i);
            int a = auf.charAt(i);
            System.out.println("Код элемента " + i + " (" + c + ")" + ": " + a);
        }
        //
//        // Need to sum up salary of all friends
//        //
//        System.out.println("\n********* NEW PROGRAM *********\n");
//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        String itog1 = text.substring(15, 19);
//        String itog2 = text.substring(35, 39);
//        String itog3 = text.substring(56, 61);
//        int itog = Integer.parseInt(itog1) + Integer.parseInt(itog2) + Integer.parseInt(itog3);
//        System.out.println(itog);
//        //
//        // Need to sum up salary of all friends
//        //
//        System.out.println("\n********* NEW PROGRAM *********\n");
//        Scanner scanner = new Scanner (System.in);
//        String fio = scanner.nextLine();
//        int fam = fio.indexOf(' ');
//        int imia = fio.lastIndexOf(' ');
//
//        String f = fio.substring(0 + fam);
//        String i = fio.substring(fam, imia);
//        String o = fio.substring(imia + 1);
//
//        System.out.println("Фамилия: " + f);
//        System.out.println("Имя: " + i);
//        System.out.println("Отчество: " + o);
//        //
//        //
//        //
//        System.out.println("\n********* NEW PROGRAM *********\n");
          //
          //
          //
//        int summ = 0;
//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        String[] a = text.replaceAll("[^0-9 | /s]","").replaceAll(" +"," ").split(" ");
//        for (String i : a)
//            System.out.println(i);
//        for (String i : a)
//        {
//            summ += Integer.parseInt(i);
//        }
//        System.out.println(summ);

    }
}
