import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisors {
    public static ArrayList<Integer> findDevisors(int n)
    {
        ArrayList<Integer> div = new ArrayList<>();

        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
            {
                div.add(i);
            }
        }

        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        ArrayList<Integer> div = findDevisors(n);
        
        System.out.println(div);
        sc.close();
    }
}
