import java.util.*;

public class Node {
    int data;
    Node l;
    Node r;

    public Node(int data) {
        this.data = data;
        l = null;
        r = null;
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int cs = q.size();
            for (int i = 0; i < cs; i++) {
                Node temp = q.remove();
                System.out.print(temp.data + " ");
                if (temp.l != null) q.add(temp.l);
                if (temp.r != null) q.add(temp.r);
            }
            System.out.println();
        }
    }

    public boolean search(Node R, int k) {
        while (R != null) {
            if (R.data == k) return true;
            else if (k < R.data) R = R.l;
            else R = R.r;
        }
        return false;
    }

    public Node insert(Node R, int k) {
        if (R == null) return new Node(k);
        if (k < R.data) R.l = insert(R.l, k);
        else if (k > R.data) R.r = insert(R.r, k);
        return R;
    }

    public boolean CBST(Node root, int start, int end) {
        if (root == null) return true;
        if (root.data < start || root.data > end) return false;
        return CBST(root.l, start, root.data - 1) && CBST(root.r, root.data + 1, end);
    }

    public boolean PreTT(int[] A) {
        int n = A.length;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int r = A[0];

        for (int i = 1; i < n; i++) {
            int current = A[i];
            if (current > r) min = r + 1;
            else max = r - 1;

            if (current < min || current > max) return false;
            r = current;
        }
        return true;
    }

    static class KthResult {
        int count = 0;
        int value = -1;
    }

    public void findKth(Node root, int k, KthResult result) {
        if (root == null || result.count >= k) return;
        findKth(root.l, k, result);
        result.count++;
        if (result.count == k) {
            result.value = root.data;
            return;
        }
        findKth(root.r, k, result);
    }
}
