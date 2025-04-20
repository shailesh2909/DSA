import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;
        System.out.println(longestSubarray(arr, k)); // Output: 3 (subarray [2, 3, 4])
    }
}
