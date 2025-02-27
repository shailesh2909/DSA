import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UnionOfArray {

    //brute force approach
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        int n1 = a.length;
        int n2 = b.length;
        
        for(int i = 0; i<n1; i++)
        {
            set.add(a[i]);
        }
        
        for(int i = 0; i<n2; i++)
        {
            set.add(b[i]);
        }
        
        return new ArrayList<>(set);
    }

    //better approach
    public static ArrayList<Integer> findUnion1(int a[], int b[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int n1 = a.length;
        int n2 = b.length;
        
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
                list.add(a[i]);
                i++;
            }
            else if(a[i]>b[j])
            {
                list.add(b[j]);
                j++;
            }
            else
            {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        
        while(i<n1)
        {
            if(i==0 || a[i]!=a[i-1])
            {
                list.add(a[i]);
            }
            i++;
        }
        
        while(j<n2)
        {
            if(j==0 || b[j]!=b[j-1])
            {
                list.add(b[j]);
            }
            j++;
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
        ArrayList<Integer> list = findUnion(a, b);
        System.out.println("Union of the two arrays:");
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
    
}
