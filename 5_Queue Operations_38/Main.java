import java.util.*;
import java.lang.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose Queue Type: 1. LinkedList 2. Array 3. Stack 4.Find the first numbers");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                LLQueue ql = new LLQueue();

                while (true) {
                    System.out.println("Enter a command (enqueue, dequeue, front, isempty, rear, size) or type 'exit' to quit:");
                    String input = sc.nextLine().toLowerCase();
                    if (input.equals("exit")) break;
                    switch (input) {
                        case "enqueue":
                            int x = sc.nextInt();
                            ql.enqueue(x);
                            sc.nextLine();
                            ql.print();
                            break;
                        case "dequeue":
                            System.out.println("dequeue: " + ql.dequeue());
                            ql.print();
                            break;
                        case "front":
                            System.out.println("front: " + ql.front());
                            ql.print();
                            break;
                        case "isempty":
                            System.out.println("Stack is empty: " + ql.isEmpty());
                            ql.print();
                            break;
                        case "rear":
                            System.out.println("rear: " + ql.rear());
                            ql.print();
                            break;
                        case "size":
                            System.out.println("size: " + ql.size());
                            ql.print();
                            break;
                        default:
                            System.out.println("Invalid command");
                    }
                }
                break;
            case 2:
                System.out.println("Enter Size of Queue");
                AQueue q = new AQueue(sc.nextInt());

                while (true) {
                    System.out.println("Enter a command (enqueue, dequeue, front, isempty, rear, size) or type 'exit' to quit:");
                    String input = sc.nextLine().toLowerCase();
                    if (input.equals("exit")) break;
                    switch (input) {
                        case "enqueue":
                            System.out.println("Enter character to push:");
                            int x = sc.nextInt();
                            q.enqueue(x);
                            sc.nextLine();
                            q.print();
                            break;
                        case "dequeue":
                            System.out.println("dequeue: " + q.dequeue());
                            q.print();
                            break;
                        case "front":
                            System.out.println("front: " + q.front());
                            q.print();
                            break;
                        case "isempty":
                            System.out.println("Stack is empty: " + q.isEmpty());
                            q.print();
                            break;
                        case "rear":
                            System.out.println("rear: " + q.rear());
                            q.print();
                            break;
                        case "size":
                            System.out.println("size: " + q.size());
                            q.print();
                            break;
                        default:
                            System.out.println("Invalid command");
                    }
                }
                break;
            case 3:
                SQueueu qs = new SQueueu();

                while (true) {
                    System.out.println("Enter a command (enqueue, dequeue, front, isempty, rear, size) or type 'exit' to quit:");
                    String input = sc.nextLine().toLowerCase();
                    if (input.equals("exit")) break;
                    switch (input) {
                        case "enqueue":
                            System.out.println("Enter character to push:");
                            int x = sc.nextInt();
                            qs.enqueue(x);
                            sc.nextLine();
                            qs.print();
                            break;
                        case "dequeue":
                            System.out.println("dequeue: " + qs.dequeue());
                            qs.print();
                            break;
                        case "front":
                            System.out.println("front: " + qs.front());
                            qs.print();
                            break;
                        case "isempty":
                            System.out.println("Stack is empty: " + qs.isEmpty());
                            qs.print();
                            break;
                        case "rear":
                            System.out.println("rear: " + qs.rear());
                            qs.print();
                            break;
                        case "size":
                            System.out.println("size: " + qs.size());
                            qs.print();
                            break;
                        default:
                            System.out.println("Invalid command");
                    }
                }
                break;
            case 4:
                System.out.println("Enter Number:");
                int n = sc.nextInt();
                System.out.println(Nnums.nums(n));
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        sc.close();
    }
}
