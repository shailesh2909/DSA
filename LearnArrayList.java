import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Shailesh");
        names.add("sarvesh");
        names.add("Murli");

        System.out.println("Printing names: ");
        System.out.println(names);

        names.remove("sarvesh");
        System.out.println("Printing names after removing sarvesh: ");
        System.out.println(names);

        System.out.println("Printing names using get method: ");
        System.out.println(names.get(1));
        System.out.println(names.getLast());
        System.out.println(names.getFirst());

        System.out.println("Printing names using foreach loop: ");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("Printing names using iterator: ");
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}