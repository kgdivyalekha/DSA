package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxKSumPairs {
    public static void main(String[] args) {
        int nums[]={3,1,3,4,3};
        int k=6;
        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
       int count=0;
       int left=0;
       int right=nums.length-1;
       Arrays.sort(nums);
       while(left<right)
       {
           if(nums[left]+nums[right]==k)
           {
               count++;
               left++;
               right--;
           }
           else if(nums[left]+nums[right]>k)
               right--;
           else left++;
       }
       return count;
    }
}
