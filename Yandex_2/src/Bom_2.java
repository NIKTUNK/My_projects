
import java.util.*;

public class Bom_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // количество дней
        int K = scanner.nextInt(); // срок хранения рыбы
        int[] prices = new int[N]; // цены на рыбу в каждый день
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] fishToBuy = new int[N]; // количество купленных рыб в каждый из дней

        for (int i = 0; i < N; i++) {
            int minPrice = Integer.MAX_VALUE;
            for (int j = Math.max(0, i - K + 1); j <= i; j++) {
                minPrice = Math.min(minPrice, prices[j]);
            }
            fishToBuy[i] = minPrice;
        }

        int totalCost = 0;
        for (int fish : fishToBuy) {
            totalCost += fish;
        }

        System.out.println(totalCost);

        for (int fish : fishToBuy) {
            System.out.print(fish + " ");
        }
    }
}