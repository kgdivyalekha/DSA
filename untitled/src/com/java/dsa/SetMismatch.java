package com.java.dsa;


import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
        int nums[]={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int result[]={-1,-1};
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j+1!=nums[j])
            {
                result[0]=nums[j];
                result[1]=j+1;
            }
        }
        return result;
    }

    public static void swap(int[] nums, int start, int end) {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
