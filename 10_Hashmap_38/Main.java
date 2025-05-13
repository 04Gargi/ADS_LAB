import java.lang.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Integer> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static int [] A;
    static int [] Q;

    public static void userInput(){
        System.out.println("Enter the number of elements in the array: ");
        A = new int[sc.nextInt()];
        System.out.println("Enter the number of elements in the query: ");
        Q = new int[sc.nextInt()];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the query: ");
        for (int i = 0; i < Q.length; i++) {
            Q[i] = sc.nextInt();
        }
    }

    public static ArrayList<Integer> queryList(){
        for (int i = 0; i < A.length; i++) {
            if(hm.containsKey(A[i])) hm.put(A[i],hm.get(A[i])+1);
            else hm.put(A[i],1);
        }

        for (int i = 0; i < Q.length; i++) {
            if(hm.containsKey(Q[i])) list.add(hm.get(Q[i]));
            else list.add(0);
        }
        return list;
    }
    public static void main(String[] args) {
        userInput();
        System.out.println("The frequencies are "+queryList());
    }
}