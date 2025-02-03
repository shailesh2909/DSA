import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offerFirst(89);
        adq.offerLast(8);

        System.out.println(adq);
        //Peek operations
        System.out.println("peek: " + adq.peek());
        System.out.println("peekFirst: "+adq.peekFirst());
        System.out.println("peekLast: "+ adq.peekLast());

        //Poll operations
        System.out.println("poll: "+adq.poll());
        System.out.println("pollFirst: "+adq.pollFirst());
        System.out.println("pollLast: "+adq.pollLast());
    }
}
