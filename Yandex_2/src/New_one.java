import java.util.Scanner;

public class New_one
{
        public static void main(String[] args)
        {
            boolean che = false;
            int count1 = 0;
            int count2 = 0;
            int tempcount1 = 0;
            int tempcount2 = 0;
            int ti = 0;
            int tj = 0;
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int ost = number % 2;
            int num =0;
            int itog = 0;
            int arr1[][] = new int[number][number];
            int arr2[][] = new int[number][number];
            if(number/2%2==0)
                num = number/2;
            else
                num = number/2+1;
            for (int r = 0; r < num ; r++)
            {
                System.out.println("\n-----------------------------------");
                        System.out.println();
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < number; j++) {
                            System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }


                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                arr1[a][b] = 1;
                arr2[c][d] = 1;

//            if (ost == 1)
//            {
//                int e = scanner.nextInt();
//                int f = scanner.nextInt();
//                arr1[e][f] = 1;
//            }

            for (int i = 0; i < number; i++)
            {

                for (int j = 0; j < number; j++)
                {
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
                    if (arr1[i][j] == 1)
                    {
                        tempcount1++;
                    }
                    if (arr2[i][j] == 1)
                    {
                        tempcount2++;
                    }
                    if ((itog == 1 || itog == 2))
                    {
                        ti = i;
                        tj = j;
                        che = true;
                        break;
                    }
                }
                if ((itog == 1 || itog == 2))
                    break;
            }
        }


            for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                if (arr1[i][j] == 1) {
                    count1++;
                }
            }
        }

            for (int i = 0; i < number; i++) {

                for (int j = 0; j < number; j++) {
                    if (arr2[i][j] == 1) {
                        count2++;
                    }
                }
            }
            System.out.println(" " + count1 + " " +  count2 + " " + tempcount1 +" " + tempcount2);
            if (tempcount1<count1||tempcount2<count2 )
                itog = 4;
            if (itog != 0 && itog != 1 && itog != 2 && itog !=4)
                itog = 3;
            if (itog == 1)
                System.out.println("First");
            else if (itog == 2)
                System.out.println("Second");
            else if (itog == 3)
                System.out.println("Draw");
            else if (itog == 4)
                System.out.println("Inattentiont");
            else
                System.out.println("error ");
        }
}