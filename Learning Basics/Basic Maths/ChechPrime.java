import java.util.Scanner;

public class ChechPrime {
    public static boolean isPrime(int n)
    {
        int count = 0;
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i = 2; i<n; i++)
            {
                if(n%i == 0)
                {
                    count++;
                    break;
                }
            }
        }
        if(count == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
