package com.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> list=findDuplicates(nums);
        list.stream().forEach(System.out::print);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> ans = new ArrayList<>();
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                ans.add(nums[j]);
        }
        return ans;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
