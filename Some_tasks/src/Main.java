import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        //
        //
        //
        // We need to reverse our phrase
        //
        //
        //
        String[] rainbow = "No one but you".split(" ");
        String[] reverse = new String[rainbow.length];
        for (int i = rainbow.length-1; i >= 0; i--)
        {
            reverse[rainbow.length-i-1] = rainbow[i];

        }
        for (int i = 0; i < reverse.length; i++)
            System.out.println(reverse[i]);
    }
    //
    //
    //
    // We need to count amount of healthy patients
    //
    //
    //
//    private static final double minTemp = 32;
//    private static final double maxTemp = 40;
//    private static final double patients = 30;
//    private static final double minNormalTemp = 36.2;
//    private static final double maxNormalTemp = 37.0;
//    public static void main(String[] args)
//    {
//        double k = 0;
//        double[] temp = new double[30];
//        for (int i = 0; i < patients; i++)
//        {
//            temp[i] = Math.pow(10,-2) * Math.round(100 * (Math.random() * (maxTemp - minTemp) + minTemp));
//            System.out.println("Temperature of patient №" + (i + 1) + " is " + temp[i]);
//        }
//        for (int i = 0; i < patients; i++)
//        {
//            k += temp[i];
//        }
//
//        double newk = Math.pow(10,-2) * Math.round(100 * k / patients);
//        System.out.println("Average temperature: " + newk);
//        int count = 0;
//        System.out.print("Patients № ");
//        for (int i = 0; i < patients; i++)
//        {
//            if (temp[i]<maxNormalTemp&&temp[i]>minNormalTemp) {
//                System.out.print((i+1) + " ");
//                count++;
//            }
//        }
//        System.out.println("is healthy");
//        System.out.println("Amount of healthy patients: " + count);
//    }

    //
    //
    //
    // We need to draw "X"
    //
    //
    //

//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        String x = "X";
//        for (int i = 0; i < size; i++)
//        {
//            for (int j = 0; j <size; j++)
//            {
//                if (i==j||i==(size-j-1))
//                    System.out.print(x);
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
}