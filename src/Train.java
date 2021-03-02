import java.io.*;
import java.util.*;

class Train{
    public static int find(int a[], int d[], int n)
    {
        int p = 1, result = 1;
        int i = 1, j = 0;
        for (i = 0; i < n; i++) {
            p= 1;
            for (j = i + 1; j < n; j++)
            {
                if ((a[i] >= a[j] && a[i] <= d[j]) || (a[j] >= a[i] && a[j] <= d[i]))
                    p++;
            }
            result = Math.max(result, p);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<6; i++)
        {
            a[i]=sc.nextInt();
        }
        //int a[] = { 900, 940, 950, 1100, 1500, 1800 };
        //int d[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;

        int[] d = new int[6];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<6; i++)
        {
            d[i]=sc.nextInt();
        }

        System.out.println("Minimum Number of Platforms Required = " + find(a, d, n));
    }
}
