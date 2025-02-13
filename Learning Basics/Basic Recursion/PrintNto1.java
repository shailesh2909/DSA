import java.util.Scanner;

public class PrintNto1 {
    public static void print1toN(int n)
    {
       if(n == 0)
       {
            return;
       }
       else
       {
           System.out.println(n);
           print1toN(n-1);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        print1toN(n);
        sc.close();
    }
}
