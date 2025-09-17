package com.java.dsa;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={3,0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr));
    }

    private static int maxWater(int[] arr) {

        int capacity=0;
        int left=0;
        int right= arr.length-1;
        int leftmax=arr[left];
        int rightmax=arr[right];
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,arr[left]);
                capacity+=leftmax-arr[left];
            }
            else {
                right--;
                rightmax=Math.max(rightmax,arr[right]);
                capacity+=rightmax-arr[right];
            }
        }
        return capacity;
    }
}
