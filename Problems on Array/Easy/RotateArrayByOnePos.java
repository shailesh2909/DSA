import java.util.Scanner;

public class RotateArrayByOnePos {
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

        int temp = arr[0];

        for(int i = 1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        System.out.println("Array after rotating by one position:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
