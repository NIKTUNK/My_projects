import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ost = number % 2;
        int itog = 0;
        int arr1[][] = new int[number][number];
        int arr2[][] = new int[number][number];

//        HashMap<Integer,Integer> map1 = new HashMap<>();
//        HashMap<Integer,Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < number/4; i++)
//        {
//            arr[i]
//            map1.put(scanner.nextInt(),scanner.nextInt());
//            map2.put(scanner.nextInt(),scanner.nextInt());
//        }


        for (int i = 0; i < number / 2; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            arr1[a][b] = 1;
            arr2[c][d] = 1;
        }
        if (ost == 1) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr1[a][b] = 1;
        }

//        System.out.println();
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                System.out.print(arr2[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(" " + arr1[0][0] + arr1[1][1] + arr1[2][2] + arr1[3][3] + arr1[4][4] + arr1[5][5]);
        for (int i = 0; i < number; i++) {
//            System.out.println("i =      " + i);
            for (int j = 0; j < number; j++) {
                if ((arr1[i][j] == 1 && arr1[i + 1][j + 1] == 1 && arr1[i + 2][j + 2] == 1
                        && arr1[i + 3][j + 3] == 1 && arr1[i + 4][j + 4] == 1) ||
                        (arr1[i][j] == 1 && arr1[i][j + 1] == 1 && arr1[i][j + 2] == 1
                                && arr1[i][j + 3] == 1 && arr1[i][j + 4] == 1) ||
                        (arr1[i][j] == 1 && arr1[i + 1][j] == 1 && arr1[i + 2][j] == 1
                                && arr1[i + 3][j] == 1 && arr1[i + 4][j] == 1))
                {
                    itog = 1;
                }
                else if ((arr2[i][j] == 1 && arr2[i + 1][j + 1] == 1 && arr2[i + 2][j + 2] == 1
                        && arr2[i + 3][j + 3] == 1 && arr2[i + 4][j + 4] == 1) ||
                        (arr2[i][j] == 1 && arr2[i][j + 1] == 1 && arr2[i][j + 2] == 1
                                && arr2[i][j + 3] == 1 && arr2[i][j + 4] == 1) ||
                        (arr2[i][j] == 1 && arr2[i + 1][j] == 1 && arr2[i + 2][j] == 1
                                && arr2[i + 3][j] == 1 && arr2[i + 4][j] == 1))
                {
                    itog = 2;
                }
            }
            if (itog == 1 || itog == 2)
            {
//                    System.out.println("Reached!");
                    break;
            }
        }
        if (itog != 0 && itog != 1 && itog != 2)
            itog = 3;
        if (itog == 1)
            System.out.println("First");
        else if (itog == 2)
            System.out.println("Second");
        else if (itog == 3)
            System.out.println("Draw");
        else if (itog == 1)
            System.out.println("Inattentiont");
        //System.out.println(itog);
    }
}