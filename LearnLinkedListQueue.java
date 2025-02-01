import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();

        num.offer(12);
        num.offer(24);
        num.offer(36);
        num.offer(48);
        num.offer(60);

        System.out.println("Printing Queue elements: "+num);

        System.out.println("Deque the element:"+num.poll());

        System.out.println("Printing Queue elements after poll: "+num);

        System.out.println("Head of the queue :"+num.peek());
    }
}
