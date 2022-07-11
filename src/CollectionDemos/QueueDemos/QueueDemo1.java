package CollectionDemos.QueueDemos;

import java.util.PriorityQueue;

public class QueueDemo1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(78);
        pq.offer(18);
        pq.offer(71);
        pq.offer(28);
        pq.offer(45);
        pq.offer(68);
        pq.offer(81);

        // 18, 28, 45, 68, 71, 78, 81

        // some os does not support priority que so sometimes you may
        // not see the printed output sorted
        // internally they are arranged in their respective order only

        System.out.println(pq);

        System.out.println(pq.poll()); // 18
        System.out.println(pq.poll()); // 28
        System.out.println(pq.poll()); // 45
        System.out.println(pq.poll()); // 68
        System.out.println(pq.poll()); // 71
        System.out.println(pq.poll()); // 78
        System.out.println(pq.poll()); // 81







    }
}
