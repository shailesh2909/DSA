import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArray {
    public static ArrayList<Integer> findIntersection(int a[], int b[])
    {
        int n1 = a.length;
        int n2 = b.length;

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;  

        while(i<n1 && j<n2)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }

            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }

            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else
            {
                list.add(a[i]);
                i++;
                j++;
            }
        }

        return list;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the first array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the first array:");
        int a[] = new int[n1];
        for(int i=0; i<n1; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size of the second array:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the second array:");
        int b[] = new int[n2];
        for(int i=0; i<n2; i++)
        {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> list = findIntersection(a, b);
        System.out.println("Intersection of the two arrays:");

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        
        sc.close();
    }
}
