import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }

        int fst = fibonacci(n-1);
        int scnd = fibonacci(n-2);

        return fst + scnd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number is: "+fibonacci(n));
        sc.close();
    }
}
