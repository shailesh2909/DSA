import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(25);
        pq.offer(58);
        pq.offer(7);
        pq.offer(59);
        pq.offer(1);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
