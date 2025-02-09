import java.util.Scanner;

public class CheckArmstrong {
    public static boolean isArmstrong(int n)
    {
        int len = String.valueOf(n).length();

        int temp = n;
        int sum = 0;
        int rem;

        while(n>0)
        {
            rem = n%10;
            sum += Math.pow(rem, len);

            n = n/10;
        }

        return sum == temp; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? n+" is an Armstrong number." : n+" is not an Armstrong number.");
        sc.close();
    }
}
