import java.util.*;

public class BubbleSort {
    static int comparisons = 0;
    static int swaps = 0;

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bs(Scanner sc) {
        comparisons = 0;
        swaps = 0;

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        bubbleSort(array);

        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
    }
}
