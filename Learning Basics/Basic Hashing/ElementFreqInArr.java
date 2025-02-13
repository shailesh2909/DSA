    import java.util.Scanner;

    public class ElementFreqInArr
    {
        public static int[] hash = new int[1000000];;

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++)
            {
                hash[arr[i]] += 1;
            }

            System.out.println("Enter the element to find frequency: ");
            int ele = sc.nextInt();
            System.out.println("Frequency of "+ele+" is: "+hash[ele]);
            sc.close();

        }
    }