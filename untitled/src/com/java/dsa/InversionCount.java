package com.java.dsa;

public class InversionCount {
    public static void main(String args[]) {
        int[] arr={2,4,1,3,5};
        System.out.println(inversionCount(arr));
    }
    static int inversionCount(int arr[]) {
        // Code Here
        int left=0;
        int right=1;
        int count=0;
        while(left<right && right<arr.length)
        {
            if(arr[left]>arr[right])
            {
                count++;
              //  right++;
            }
            if(right==arr.length-1)
            {
                left++;
                right=left+1;
            }
            else right++;
        }
        return count;
    }
}
