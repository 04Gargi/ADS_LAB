import java.util.*;
import java.lang.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = new Node(5);
        root.l = new Node(12);
        root.r = new Node(10);
        root.l.l = new Node(4);
        root.l.r = new Node(8);
        root.r.l = new Node(2);
        root.r.r = new Node(15);
        root.l.r.l = new Node(6);
        root.l.r.r = new Node(9);
        root.r.r.l = new Node(29);
        root.r.r.r = new Node(20);
        root.r.r.l.r = new Node(40);

        System.out.println("Menu \nFind the size of the binary tree\n" +
                "Check if a given node value is present in the binary tree\n" +
                "Return the preorder traversal of its nodes' values\n" +
                "Return the inorder traversal of its nodes' values\n" +
                "Return the postorder traversal of its nodes' values\n" +
                "Return the level order traversal of its nodes' values\n" +
                "Return an integer denoting the height of the tree\n" +
                "Return the sum of all the nodes of the binary tree\n" +
                "Return the sum of node values of all left leaves in the tree\n" +
                "Return the sum of node values of all right leaves in the tree \nor type 'exit' to quit:");

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
            switch (input) {
                case "height":
                    System.out.println("The height of tree is :" + root.height(root));
                    break;
                case "levelorder":
                    System.out.println("The Level order Traversal is: ");
                    root.levelOrder(root);
                    break;
                case "inorder":
                    System.out.println("The Inorder Traversal is: ");
                    root.InTT(root);
                    System.out.println("");
                    break;
                case "postorder":
                    System.out.println("The Postorder Traversal is: ");
                    root.PostTT(root);
                    System.out.println("");
                    break;
                case "preorder":
                    System.out.println("The Preorder Traversal is: ");
                    root.PreTT(root);
                    System.out.println("");
                    break;
                case "sum":
                    System.out.println("The sum is: " + root.sum(root));
                    break;
                case "size":
                    System.out.println("The size is: " + root.size(root));
                    break;
                case "leftleafnode":
                    System.out.println("The sum is: " + root.lln(root, true));
                    break;
                case "rightleafnode":
                    System.out.println("The size is: " + root.rln(root, true));
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

    }

}