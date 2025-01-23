import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> subjects = new Stack<>();

        subjects.push("OOP");
        subjects.push("DSA");
        subjects.push("DBMS");
        subjects.push("OS");

        System.out.println("Printing Stack elements: "+subjects);

        System.out.println("Peeking the top element: "+subjects.peek());

        subjects.pop();
        System.out.println("Printing Stack elements after pop: "+subjects); 
    }
}
