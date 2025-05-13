import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static Scanner sc = new Scanner(System.in);

    public static void DFS(ArrayList<ArrayList<Integer>> graph, int s, boolean visited[]) {
        System.out.print(s + " ");
        visited[s] = true;
        ArrayList<Integer> temp = graph.get(s);
        for (int i = 0; i < temp.size(); i++) {
            int nbr = temp.get(i);
            if (!visited[nbr]) {
                DFS(graph, nbr, visited);
            }
        }
    }

    public static void connected(ArrayList<ArrayList<Integer>> graph, int n, boolean visited[]){
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.print("Component " + (components + 1) + ": ");
                DFS(adj, i, visited);
                System.out.println();
                components++;
            }
        }
        System.out.println("Total Connected Components = " + components);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        adj = new ArrayList<>();
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (x y):");
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        sc.nextLine();

        System.out.println("Enter Commands: 'dfs ', 'count the connected graphs', 'exit'");
        while (true) {
            System.out.print("\nEnter Command: ");
            String commandLine = sc.nextLine().trim();
            if (commandLine.equals("")) continue; // skip empty input
            String[] parts = commandLine.split("\\s+");

            if (parts[0].equalsIgnoreCase("dfs")) {
                if (parts.length < 2) {
                    System.out.println("Error: Please specify starting node. Example: dfs 0");
                    continue;
                }
                int start = Integer.parseInt(parts[1]);
                if (start < 0 || start >= n) {
                    System.out.println("Error: Invalid node number!");
                    continue;
                }
                Arrays.fill(visited, false);
                System.out.print("DFS Traversal from node " + start + ": ");
                DFS(adj, start, visited);
                System.out.println();
            }
            else if (parts[0].equalsIgnoreCase("count")) {
                Arrays.fill(visited, false);
                connected(adj,n,visited);

            }
            else if (parts[0].equalsIgnoreCase("exit")) {
                break;
            }
            else {
                System.out.println("Unknown command");
            }
        }

        sc.close();
    }
}
