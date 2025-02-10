import java.util.Scanner;

public class SumOfFirstNNum {

    public static int sumOfFirstNNum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return n + sumOfFirstNNum(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(sumOfFirstNNum(n));
        sc.close();
    }
    
}
