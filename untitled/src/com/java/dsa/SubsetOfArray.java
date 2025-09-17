package com.java.dsa;
import java.util.Arrays;
public class SubsetOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {1,1};
        System.out.println(isSubset(a, b));
    }
    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        if (b.length == 0)
            return true;
        else if(b.length>a.length)
            return false;
        int i=0;
        int j=0;
        int m=a.length;
        int n= b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<m && j<n)
        {
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]==b[j])
            {
                i++;
                j++;
            }
            else if(a[i]>b[j])
                return false;
        }
        return j >= n;
    }

}
