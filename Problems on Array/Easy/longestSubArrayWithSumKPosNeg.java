public class longestSubArrayWithSumKPosNeg {
    public static int longestSubarray(int arr[], int k)
    {
        int left = 0;
        int right = 0;

        long sum = arr[0];
        int maxLen = 0;

        int n = arr.length;

        while (right<n) {
            while (left <=right && sum >k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k)
            {
                maxLen = Math.max(maxLen, right - left +1);
            }
            right++;
            if(right<n)
            {
                sum += arr[right];
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -4};
        int k = 9;
        System.out.println(longestSubarray(arr, k)); // Output: 3 (subarray [2, 3, 4])
    }
}
