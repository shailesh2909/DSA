import java.util.Scanner;

public class PrintNTimesName {
 public static void printNTimes(String name, int n)
 {
    if(n == 0)
    {
        return;
    }
    else
    {
        System.out.println(name);
        printNTimes(name, n-1);
    }
 } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printNTimes(name, n);
        sc.close();
    }  
}
