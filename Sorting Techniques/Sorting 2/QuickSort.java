import java.util.Scanner;

public class QuickSort {

    public static int partition(int arr[], int low, int high) 
    {
    
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) 
        {
            while (arr[i] <= pivot && i < high)
            {
                i++;
            }
            while (arr[j] > pivot && j > low) 
            {
                j--;
            }
            if (i < j) 
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int arr[], int low, int high) 
    {
        if (low < high) 
        {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, n - 1);

        System.out.println("Array after sorting: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
