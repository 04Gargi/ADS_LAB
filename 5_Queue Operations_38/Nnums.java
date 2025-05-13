import java.util.*;
import java.lang.*;

public class Nnums {
    public static List<Integer> nums(int N) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        que.add(1);
        que.add(2);
        que.add(3);

        while (res.size() < N) {
            int c = que.poll();
            res.add(c);

            que.add(c * 10 + 1);
            que.add(c * 10 + 2);
            que.add(c * 10 + 3);
        }

        return res;
    }
}
