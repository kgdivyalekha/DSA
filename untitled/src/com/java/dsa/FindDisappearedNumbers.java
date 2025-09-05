package com.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,7,2,3,1};
        List<Integer> list = findDisappearedNumbers(arr);
        list.stream().forEach(System.out::print);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                list.add(j+1);

        }
        return list;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
