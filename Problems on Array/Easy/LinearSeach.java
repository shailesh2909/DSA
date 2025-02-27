import java.util.Scanner;

public class LinearSeach {
    static boolean searchInSorted(int arr[], int k) {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==k)
            {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int k = sc.nextInt();
        if(searchInSorted(arr, k))
        {
            System.out.println("Element found in the array");
        }
        else
        {
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}
