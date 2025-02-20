import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    // Brut force
    public static int largestElement(int arr[], int n)
    {
        int large = 0;
        
        for(int ele: arr)
        {
            if(ele>large)
            {
                large = ele;
            }
        }

        return large;
    }

    // better
    public static int largestElementBetter(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element in the array by brut force is: "+largestElement(arr, n));
        System.out.println("Largest element in the array by better approach is: "+largestElementBetter(arr, n));
        sc.close();
    }
}
