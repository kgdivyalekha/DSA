package com.java.dsa;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={5,6, 5, 6, 5, 6, 5, 6, 5, 5, 5,5,5};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr) {
        // code here
        if(arr.length==1)
            return arr[0];
        else if(arr.length == 0)
            return -1;
        Arrays.sort(arr);
        int left=0;
        int right=0; int count=0;int prev=0;int ans=0;int freq=0;
        while(right<arr.length)
        {
            if(left<right && arr[left]==arr[right])
            {
                prev=count;//to track previous highest frequency
                //ans=arr[left];
                count=Math.max(count,right-left+1);//find the greatest frequency
                if(count>prev)
                {
                    ans=arr[left];
                    freq=count;
                    if(freq>arr.length/2)//arr length/2 is done to check if the freq exceeds atleast half
                        return ans;
                }
            }
            else
            {
                left=right;//if not move the window to right
                count=0;//reset counter for next value
            }
            right++;//increment right pointer anyways
        }
        return -1;//if not majority element found, return -1 as default value.
    }
}
