import java.util.Scanner;

public class ConsecutiveOnes {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int count = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
                maxi = Math.max(maxi, count); 
            }
            else
            {
                count = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (0s and 1s):");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findMaxConsecutiveOnes(nums)); 
    }
}
