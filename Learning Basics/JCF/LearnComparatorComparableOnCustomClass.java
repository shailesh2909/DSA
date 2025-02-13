import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparatorComparableOnCustomClass {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("Shailesh", 5));
        students.add(new Student("Vedant", 1));
        students.add(new Student("Virendra", 20));
        students.add(new Student("Murli", 9));
        students.add(new Student("Sarvesh", 23));
        students.add(new Student("Vaibhav", 22));
        students.add(new Student("Shekhar", 8));

        System.out.println(students);

        Collections.sort(students);

        System.out.println("Sorting on the basis of Roll numbers: ");
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            
            public int compare(Student o1, Student o2)
            {
               return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("Sorting on the basis of Names: ");
        System.out.println(students);

    }
}
