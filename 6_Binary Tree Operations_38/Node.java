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

    public void PreTT(Node root){
        if(root == null) return;
        System.out.print(root.data +" ");
        PreTT(root.l);
        PreTT(root.r);
    }

    public void PostTT(Node root){
        if(root == null) return;
        PostTT(root.l);
        PostTT(root.r);
        System.out.print(root.data +" ");
    }

    public void InTT(Node root){
        if(root == null) return;
        InTT(root.l);
        System.out.print(root.data +" ");
        InTT(root.r);
    }

    public int size(Node root){
        if(root == null) return 0;
        int l = size(root.l);
        int r = size(root.r);
        return l+r+1;
    }

    public boolean search (Node R,int k){
        Node T = R;
        while (T != null) {
            if (T.data == k) {
                return true;
            } else if (T.data > k) {
                T = T.l;
            } else {
                T = T.r;
            }
        }
        return false;
    }

    public int height(Node root){
        if(root == null) return 0;
        int lh = height(root.l);
        int rh = height(root.r);
        return Math.max(lh, rh) + 1;
    }

    public int sum(Node root){
        if(root == null) return 0;
        int ls = sum(root.l);
        int rs = sum(root.r);
        return ls + rs + root.data;
    }

    public void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int cs = q.size();
            for (int i = 1; i<=cs; i++ ) {
                Node temp = q.remove();
                System.out.print(temp.data +" ");
                if(temp.l != null) q.add(temp.l);
                if(temp.r != null) q.add(temp.r);

            }
            System.out.println();
        }

    }

    public int lln(Node R, boolean left) {
        if (R == null) {
            return 0;
        }

        if (R.l == null && R.r == null && left) {
            return R.data;
        }

        return lln(R.l, true) + lln(R.r, false);
    }

    public int rln(Node R, boolean right) {
        if (R == null) {
            return 0;
        }

        if (R.l == null && R.r == null && right) {
            return R.data;
        }

        return rln(R.l, false) + rln(R.r, true);
    }
}
