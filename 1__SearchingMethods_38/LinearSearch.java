import java.util.*;

public class LinearSearch {
    public static void ls(Scanner sc) {
        int flag = 0;
        int count = 0;

        System.out.print("Input Size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number for index " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                flag = 1;
                System.out.println("Key found at index " + i);
                count++;

                System.out.print("Do you want to continue searching? (yes/no): ");
                String response = sc.next();

                if (response.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println("Key not found in array.");
        } else {
            System.out.println("Key found " + count + " times.");
        }
    }
}
