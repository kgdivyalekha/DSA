package com.java.dsa;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while(i<arr.length-1)
        {
            //compare first element with it's appropriate index
            if(arr[i]!=i+1)
            {
                swap(arr,i,arr[i]-1);
            }
            else i++;

        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
