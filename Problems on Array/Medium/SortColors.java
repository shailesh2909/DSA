public class SortColors {
    // This function sorts an array of 0s, 1s, and 2s in a single pass using the Dutch National Flag algorithm.
    // It maintains three pointers: low, mid, and high.
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;

        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 0 0 1 1 2 2
        // Explanation: The colors are represented by numbers: 0 = red, 1 = white, 2 = blue.
    }
}
