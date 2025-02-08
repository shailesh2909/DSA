import java.util.*;

public class CountDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;

        while(n !=0)
        {
            int d = n % 10;
            System.out.println("Digit: "+d);
            n = n/10;
            count++;
        }

        System.out.println("Number of digits: "+count);
        sc.close();
    }
}