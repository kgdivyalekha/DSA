package com.java.dsa;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
    int i=0;
    while(i<nums.length)
    {
        if(nums[i]<nums.length && nums[i]!=i)
        {
            swap(nums,i,nums[i]);
        }
        else i++;
    }
    for(int j=0;j<nums.length;j++)
    {
        if(j!=nums[j])
            return j;
    }
    return nums.length;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
