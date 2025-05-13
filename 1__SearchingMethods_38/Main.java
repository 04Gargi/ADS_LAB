import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Exit");
            System.out.print("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    LinearSearch.ls(sc);
                    break;
                case 2:
                    BinarySearch.bs(sc);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-3.");
            }
        }

        sc.close();
    }
}
