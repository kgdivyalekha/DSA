package com.java.dsa;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int arr[]={4,0,5,-5,3,3,0,-4,-5};
        int target=-2;
        int closestSum=threeSumClosest(arr,target);
        System.out.println("Closest: "+closestSum);
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[2]; // Initial best guess

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }

                if (sum == target) return target;
                else if (sum < target) left++;
                else right--;
            }
        }

        return result;
    }
}
