import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void recursiveBubbleSort(int arr[], int n)
    {
        if(n==1)
        {
            return;
        }

        for(int j = 0; j<=n-2; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursiveBubbleSort(arr, n-1);
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
        System.out.println("Array before sorting: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        recursiveBubbleSort(arr, n);

        System.out.println("Array after sorting: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
