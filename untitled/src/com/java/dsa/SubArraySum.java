package com.java.dsa;

import java.util.ArrayList;


public class SubArraySum {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=15;
        System.out.println(subArraySum(arr,target));
    }

    private static ArrayList<Integer> subArraySum(int[] arr, int target) {
        int sum = 0; // Tracks the current sum of elements in the window.

        int l = 0;   // Left index of the window.
        int r = 0;   // Right index of the window.
        int n=arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        // Loop through the array until the right index reaches the end.
        while (r < n) {

            // Add the current element to the sum.
            sum += arr[r];

            // Check if the sum exceeds the given target 's'.
            while (l < r && sum > target) {

                // reduce the window from left side (to decrease the sum)
                sum -= arr[l];
                l++;

            }

            // If the sum equals the target 's', we've found the subarray.
            // we need to return 1-based indexing as the answer
            if (sum == target) {

                res.add(l + 1);
                res.add(r + 1);
                return res;
            }

            // Increment the right index to expand the window.
            r++;
        }

        // no sub array with sum s was found
        res.add(-1);
        return res;
    }
}
