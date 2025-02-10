import java.util.Scanner;

public class StringReverseWithoutRecursion {
    public static boolean isPalindrome(String s) {

        String fil = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder newstr = new StringBuilder(fil);

        String rev = newstr.reverse().toString();

        return fil.equals(rev);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
     }
}
