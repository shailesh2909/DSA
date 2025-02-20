import java.util.Scanner;

public class SecondLargestWithoutSort {
    public static int secondLargestWithoutSort(int arr[], int n)
    {
        int large = arr[0];
        int secondLarge = -1;

        for(int i = 1; i<n;i++)
        {
            if(arr[i]>large)
            {
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i]<large && arr[i]>secondLarge)
            {
                secondLarge = arr[i];
            }   
        }

        return secondLarge;
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

        System.out.println("Second Largest element in the array by optimal approach is: "+secondLargestWithoutSort(arr, n));
        sc.close();
    }
}

