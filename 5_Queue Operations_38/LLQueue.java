public class LLQueue {
    Node H,T;
    static int cnt;
    public LLQueue() {
        H=T=null;
        cnt=1;
    }

    public boolean isEmpty() {
        return H==null;
    }

    public  void enqueue(int x) {
        Node y = new Node(x);
        if(T==null) H=T=y;
        else{
            T.next=y;
            T=T.next;
            cnt++;
        }
    }

    public int  dequeue(){
        if(isEmpty()) return -1;
        int el = H.data;
        H = H.next;
        if(H==null) T=null;
        cnt--;
        return el;
    }

    public int front(){
        if(isEmpty()) return -1;
        return H.data;
    }

    public int rear(){
        if(isEmpty()) return -1;
        return T.data;
    }

    public int size(){
        return cnt;
    }

    public void print(){
        if(isEmpty()) return;
        Node temp = H;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
