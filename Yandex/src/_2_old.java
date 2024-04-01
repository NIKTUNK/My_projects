import java.util.ArrayList;
import java.util.Scanner;
public class _2_old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>();
        String[] str = b.split("[<>]");
        int pl = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("left") && arr.size() != 0 && pl > 0) {
                pl = pl - 1;
            } else if (str[i].equals("bspace") && arr.size() != 0 && pl > 0) {
                arr.remove(pl - 1);
                pl-=1;
            } else if (str[i].equals("delete") ) {
                arr.remove(pl);

            }
            else if (str[i].equals("right") && pl != arr.size() + 1) {
                pl = pl + 1;
            }
            else if (str[i].equals(" "))
            {}
            else
            {
                char[] chararr = str[i].toCharArray();
                for (int j = 0; j < chararr.length; j++) {

                    arr.add(pl, chararr[j]);
                    pl++;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++)
        {
            output.append(arr.get(i));
        }
        String text = output.toString();
        if (a.equals(text))
            System.out.print("Yes");
        else System.out.print("No");
    }
}