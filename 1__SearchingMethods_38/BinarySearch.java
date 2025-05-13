import java.util.*;

public class BinarySearch {
    public static void bs(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        System.out.print("Enter the number to search: ");
        int K = sc.nextInt();

        int start = 0, end = n - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] == K) {
                result = mid;
                break;
            } else if (A[mid] > K) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (result != -1) {
            System.out.println("Number found at index " + result + " (sorted array)");
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
