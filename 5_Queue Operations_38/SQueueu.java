import java.util.*;

public class SQueueu {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public SQueueu() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public int size() {
        return s1.size() + s2.size();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Stack<Integer> temp = new Stack<>();
        while (!s2.isEmpty()) temp.push(s2.pop());
        for (Integer val : temp) System.out.print(val + " ");
        for (Integer val : s1) System.out.print(val + " ");
        System.out.println();

        while (!temp.isEmpty()) s2.push(temp.pop());
    }
}
