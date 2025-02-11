import java.util.HashMap;
import java.util.Scanner;

public class FreqUsingMAp {
    public static int countFreq(int arr[], int n, int f)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        return mp.getOrDefault(f, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find frequency: ");
        int f = sc.nextInt();
        System.out.println("Frequency of "+f+" is: "+countFreq(arr, n, f));
        sc.close();
    }
}
