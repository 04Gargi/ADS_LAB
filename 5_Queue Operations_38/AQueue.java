public class AQueue {
    int A[],cnt,ms,f,r;

    public AQueue(int x) {
        ms = x;
        A = new int[ms];
        cnt = r=f= 0;
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == ms;
    }

    public void enqueue(int y) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        A[r]=y;
        cnt++;
        r++;
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int el = A[f];
        cnt--;
        f++;
        return el;

    }

    public int front() {
        if(isEmpty()) return -1;
        return A[f];
    }

    public int rear() {
        if(isEmpty()) return -1;
        return A[r-1];
    }

    public int size() {
        return cnt;
    }

    public void print(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return ;
        }
        for(int i=f; i<r; i++) {
            System.out.print(A[i]+" ");
        }
    }

}
