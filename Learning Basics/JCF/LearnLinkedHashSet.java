import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(89);
        set.add(9);
        set.add(22);
        set.add(9);
        set.add(4);

        System.out.println(set);
        System.out.println(set.remove(9));
        System.out.println(set);
        System.out.println(set.contains(6));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
