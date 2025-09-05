package com.java.leetcode.interview;

public class RemoveDuplicatesNumbers {
    public static void main(String[] args) {
        int nums[]={1};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return nums.length;
        else {
            int k=0;
            for(int i=1;i<nums.length;i++) {
                if (nums[k] != nums[i]){
                    k++;
                    nums[k] = nums[i];
                }
            }
            return k+1;
        }
    }
}
