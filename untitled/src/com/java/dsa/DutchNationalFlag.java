package com.java.dsa;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr) {
        int left=0;//pointer to track zeros
        int mid=0;//pointer to track 1's
        int right=arr.length-1;//to track 2's
        while(mid<=right)
        {
            if(arr[mid]==0)//case 1: if the digit is zero
            {
                swap(arr,left++,mid++);//swap with left most position
                //left++ and mid++ passed into the argument itself
            }
            else if(arr[mid]==2)//case2: if the digit is 2
            {
                swap(arr,mid,right--);//swap with right most and swap
            }
            else
                mid++;//it's one and is in right position.
        }
    }
    public static void swap(int[] arr, int start, int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
