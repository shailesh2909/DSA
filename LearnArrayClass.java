import java.util.*;

public class LearnArrayClass {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.binarySearch(num, 4));

        System.out.println(Arrays.toString(num));

        Arrays.fill(num, 0);

        System.out.println(Arrays.toString(num));

        int num1[] = {875, 23, 45, 67, 12, 34, 56, 78, 90, 23};

        Arrays.sort(num1);

    for(int i : num1)
    {
        System.out.print(i+" ");    
    }
}
}
