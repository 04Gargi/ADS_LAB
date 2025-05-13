import java.util.*;

public class InsertionSort {
    static int comparisons = 0;
    static int swaps = 0;

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                    swaps++;
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
    }

    public static void is(Scanner sc) {
        comparisons = 0;
        swaps = 0;

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        insertionSort(array);

        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
    }
}
