import java.util.Scanner;

public class SelectionSort {
    
    public static int[] selectionSort(int arr[], int n)
    {
        for(int i = 0; i<=n-2; i++)
        {
            int minIndex = i;
            for(int j = i; j<=n-1; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        }

        return arr;
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
        arr = selectionSort(arr, n);

        System.out.println("Array after sorting: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

}
