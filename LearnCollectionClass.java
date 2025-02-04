import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<>();

        num.add(98);
        num.add(45);
        num.add(90);
        num.add(932);

        System.out.println("Minimum: "+Collections.min(num));
        System.out.println("Maximum: "+Collections.max(num));
        System.out.println("Frequency of 45: "+Collections.frequency(num, 45));

        Collections.sort(num);

        System.out.println(num);

        Collections.sort(num, Comparator.reverseOrder());

        System.out.println(num);
    }
}
