package sort;

import java.util.*;

public class MergeSort {
    public static void main(String[]a) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] relics = new int[N];
        for (int i = 0; i < N; i++){
            relics[i] = scanner.nextInt();
        }
        Arrays.sort(relics);
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += (i % 2 == 0 ? 1 : -1) * relics[N - 1 - i];
            result[i] = sum;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        scanner.close();

    }
}
