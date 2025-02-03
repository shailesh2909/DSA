import java.util.HashSet;

public class StudentSet {
    public static void main(String[] args) {
        
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Shailesh", 22478));
        students.add(new Student("Sarvesh", 22479));
        students.add(new Student("Murli", 22467));
        students.add(new Student("Virendra", 22470));
        students.add(new Student("Vedant", 22470));

        System.out.println(students);
    }
}
