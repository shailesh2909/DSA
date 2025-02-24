import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates1(int[] nums) {
        
        int i = 0;

        for(int j = 1; j<nums.length; j++)
        {
            if(nums[j]!=nums[i])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }

        return (i+1);
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
        System.out.println("Length of the array after removing duplicates: "+removeDuplicates1(arr));
        sc.close();
     }
}
