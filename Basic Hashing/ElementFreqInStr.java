import java.util.Scanner;

public class ElementFreqInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        int hash[] = new int[256];

        for(int i = 0; i<s.length(); i++)
        {
            hash[s.charAt(i)]++;
        }

        System.out.println("Enter how many time do you want to find charcter: ");
        int n = sc.nextInt();

        while (n !=0) {
            
            System.out.println("Enter the character to find frequency: ");
            char c = sc.next().charAt(0);
            System.out.println("Frequency of "+c+" is: "+hash[c]);
            n--;
        }

        sc.close();
    }
}
