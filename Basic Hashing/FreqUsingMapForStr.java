import java.util.HashMap;
import java.util.Scanner;

public class FreqUsingMapForStr {
    
    public static int countFreq(String s, char f)
    {
        HashMap<Character, Integer> mp = new HashMap<>();
            
        for (int i = 0; i < s.length(); i++)
        {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        return mp.getOrDefault(f, 0);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("Enter how many time do you want to find charcter: ");

        int n = sc.nextInt();

        while (n !=0) {
            
            System.out.println("Enter the character to find frequency: ");
            char c = sc.next().charAt(0);
            System.out.println("Frequency of "+c+" is: "+countFreq(s, c));
            n--;
        }

        sc.close();
    }

}
