import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // PriorityQueue with lower the number highest the priority 
        PriorityQueue<Integer> Lpq = new PriorityQueue<>();

        Lpq.offer(25);
        Lpq.offer(58);
        Lpq.offer(7);
        Lpq.offer(59);
        Lpq.offer(1);

        System.out.println(Lpq);

        Lpq.poll();

        System.out.println(Lpq);

        System.out.println(Lpq.peek());

         // PriorityQueue with highest the number highest the priority 

        PriorityQueue<Integer> Upq = new PriorityQueue<>(Comparator.reverseOrder());

        Upq.offer(25);
        Upq.offer(58);
        Upq.offer(7);
        Upq.offer(59);
        Upq.offer(1);

        System.out.println(Upq);

        Upq.poll();

        System.out.println(Upq);

        System.out.println(Upq.peek());
    }
}
