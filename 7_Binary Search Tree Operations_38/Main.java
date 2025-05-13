import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(12);
        root.l = new Node(5);
        root.l.l = new Node(2);
        root.l.r = new Node(10);
        root.l.r.l = new Node(6);
        root.l.r.l.r = new Node(8);
        root.l.r.l.r.l = new Node(7);

        root.r = new Node(20);
        root.r.r = new Node(22);
        root.r.r.l = new Node(21);
        root.r.r.r = new Node(25);

        System.out.println("Menu \nAdd an element to bst\n" +
                "Check if it is a Binary Search Tree or Not.\n" +
                "Check if a given Node Value present in the Binary Search Tree,\n" +
                "Given Preorder Traversal of a Binary Tree { 4, 10, 5, 8 }, Check if it is possible that it is also a Preorder Traversal of a\n" +
                "Binary Search Tree, where each internal node (non-leaf nodes) have exactly one child.,\n" +
                "Find the Kth Smallest Element in the Binary Search Tree\n" +
                " or type 'exit' to quit:");

        while (true) {
            System.out.println("Enter a command");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("exit")) break;
            if (input.startsWith("checkif(") && input.endsWith(")")) {
                int k = Integer.parseInt(input.substring(8, input.length() - 1));
                System.out.println("Is the element present in the binary tree? : ");
                System.out.print(root.search(root, k));
                continue;
            }
            if (input.startsWith("add(") && input.endsWith(")")) {
                int k = Integer.parseInt(input.substring(4, input.length() - 1));
                root.insert(root, k);
                root.levelOrder(root);
                continue;
            }
            switch (input) {
                case "bst":
                    System.out.println("Is the tree BST?:" + root.CBST(root, -100, 100));
                    root.levelOrder(root);
                    break;
                case "pre":
                    System.out.println("Enter the number of elements in preorder traversal:");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the preorder traversal order: ");
                    String[] parts = sc.nextLine().split(",");
                    int[] A = new int[n];
                    for (int i = 0; i < n; i++) {
                        A[i] = Integer.parseInt(parts[i]);
                    }
                    System.out.println("Is the tree BST?:" + root.PreTT(A));
                    break;
                case "ksmall":
                    System.out.println("Enter k: ");
                    int k = sc.nextInt();
                    sc.nextLine();
                    Node.KthResult result = new Node.KthResult();
                    root.findKth(root, k, result);
                    if (result.value != -1)
                        System.out.println("The smallest kth node is: " + result.value);
                    else
                        System.out.println("Invalid k.");
                    root.levelOrder(root);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

    }

}
