import java.util.Scanner;

public class IsArraySorted {
        public static boolean check(int[] nums) {

            int count = 0;  
            int n = nums.length;
            for(int i = 1; i<n; i++)
            {
                if(nums[i]>nums[(i+1)%n])
                {
                    count++;
                }   
                
                if(count>1)
                {
                    return false;
                }
            }
            return true;
        }
        
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of the array:");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the array:");
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Is the array sorted: "+check(arr));

            sc.close();
        }
}
