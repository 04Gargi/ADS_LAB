import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\nMenu");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Exit");

        while (!exit) {
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    InsertionSort.is(sc);
                    break;
                case 2:
                    QuickSort.qs(sc);
                    break;
                case 3:
                    BubbleSort.bs(sc);
                case 4:
                    System.out.println("Exiting program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
