import java.util.Objects;

public class Student implements Comparable<Student>{

    String name;
    int roll;

    public Student(String n, int r)
    {
        name = n;
        roll = r;
    }

    @Override
    public String toString()
    {
        return "Student{"+name+", "+roll+"}";
    }
    @Override
    public boolean equals(Object o)
    {
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(roll);
    }

    @Override
    public int compareTo(Student o) {
        return this.roll - o.roll;
    }

}
