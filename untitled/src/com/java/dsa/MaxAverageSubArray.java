package com.java.dsa;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int nums[]={0,1,1,3,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double average=Double.MIN_VALUE;
        int left=0;
        int right=k;
        if(nums.length==1)
            return (double)nums[0];
        while(right<=nums.length)
        {
            double sum=0;
            for(int i=left;i<right;i++)
                sum+=(double)nums[i];
            average=Math.max(average,sum/k);
            left++;
            right++;
        }
        return average;
    }
}
