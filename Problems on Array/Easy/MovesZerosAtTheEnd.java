//import java.util.ArrayList;

import java.util.Scanner;

public class MovesZerosAtTheEnd {
    // brute force approach
    /*public static void moveZeroes(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;

        for(int i = 0 ; i<n; i++)
        {
            if(nums[i]!=0)
            {
                list.add(nums[i]);
            }
        }

        for(int i = 0; i<list.size(); i++)
        {
            nums[i] = list.get(i);
        }

        for(int i = n-list.size()+1; i<n; i++)
        {
            nums[i] = 0;
        }
    }*/

    //optimal approach

    public static void moveZeroes(int[] nums) {
        
        int j = -1;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }
    
        if(j == -1)
        {
            return;
        }
    
        for(int i = j+1; i<n; i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
    
                j++;
            }
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
        moveZeroes(arr);
        System.out.println("Array after moving zeros to the end:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
