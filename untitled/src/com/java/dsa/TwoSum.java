package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,13,15};
        int target=9;
        /*int[] result=twoSum(arr,target);
        System.out.println(Arrays.toString(result));*/
        System.out.println(twoSums(arr,target));
    }

    private static int[] twoSum(int[] arr, int target)
    {
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                return new int[]{arr[left],arr[right]};
            }
            else if(sum>target)
                right--;
            else
                left++;
        }
        return new int[]{};
    }
    public static ArrayList<Integer> twoSums(int[] arr, int target) {
        // code here


        int left=0;
        int right=arr.length-1;
        while(right>=0 && left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                return new ArrayList<>(Arrays.asList(left,right));
            }
            else if(sum>target)
                right--;
            else left++;
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}
