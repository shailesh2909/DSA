import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr, int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        else
        {
            swap(arr, start, end);
            reverseArray(arr, start+1, end-1);
        }
    }

    public static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n-1);
        System.out.println("Reversed Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
