public class TwiceEle {
    public int singleNumber(int[] nums) {
        
        int xor = 0;
        for(int n: nums)
        {
            xor = xor ^ n;
        }

        return xor;
    }

    public static void main(String[] args) {
        TwiceEle obj = new TwiceEle();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(obj.singleNumber(nums)); // Output: 4
    }

}
