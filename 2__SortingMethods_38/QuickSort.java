import java.util.*;

public class QuickSort {
    static int comparisons;
    static int swaps;

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        swaps++;
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        int p = start;

        while (i < end) {
            comparisons++;
            if (array[i] < pivot) {
                swap(array, i, p);
                p++;
            }
            i++;
        }

        swap(array, p, end);
        return p;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }
    }

    public static void qs(Scanner sc) {
        comparisons = 0;
        swaps = 0;

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        quickSort(array, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
    }
}
