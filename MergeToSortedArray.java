import java.util.Scanner;
import java.util.Arrays;
public class MergeToSortedArray {
    static int[] mergesort(int[] a,int s,int e)
    {
        if(s==e)
            return new int[]{a[s]};
        int mid=s+(e-s)/2;
        int left[]=mergesort(a,s,mid);
        int right[]=mergesort(a,mid+1,e);
        int final1[]=fun(left,right);
        return final1;
    }
    static int[] fun(int[] a, int b[])
    {
        int i=0,j=0,k=0;
        int n=a.length;
        int m=b.length;
        int c[]=new int[n+m];
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i];
                i++;
            }
            else
            {
                c[k++]=b[j];
                j++;
            }
        }
        while(i<n)
        {
            c[k++]=a[i];
            i++;
        }
        while(j<m)
        {
            c[k++]=b[j];
            j++;
        }
        return c;


    }

    public static void main(String[] args) {
        int[] a={5,8,9,6,2,1,4,3};
        for(int i:a)
            System.out.print(i+" ");
        int final1[]=mergesort(a,0,a.length-1);
        System.out.println();
        for(int i:final1)
            System.out.print(i+" ");


    }

}
