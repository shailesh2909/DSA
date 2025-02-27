import java.util.Scanner;

public class RotateArrayByKPos {
    
    // brut force approach
    /*public void rotate(int[] nums, int k) {

        k = k%nums.length;
        
        int arrnew[] = new int[k];

        for(int i = 0; i<k; i++)
        {
            arrnew[i] = nums[i];
        }

        for(int i = k; i<nums.length; i++)
        {
            nums[i-k] = nums[i];
        }

        for(int i = nums.length-k; i<nums.length; i++)
        {
            nums[i] = arrnew[i-(nums.length-k)];

        }
    }*/

    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
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
        System.out.println("Enter the number of positions to rotate the array:");
        int k = sc.nextInt();
        rotate(arr, k);
        System.out.println("Array after rotating by "+k+" positions:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
