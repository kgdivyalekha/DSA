package com.java.hackerrank.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsArray {
    public static void main(String[] args) {
        int[] arr={7, 1, 3, 2, 4, 5, 6};
        System.out.println(minimumSwaps(arr));
    }

    private static int minimumSwaps(int[] arr) {
        int n = arr.length;

        // Array to Keep track of those elements
        // who already been included in the cycle.
        boolean[] vis = new boolean[n];

        // Hashing elements with their original positions
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++)
            pos.put(arr[i], i);

        Arrays.sort(arr);

        int swaps = 0;
        for (int i = 0; i < n; i++) {

            // Already a part of another cycle Or
            // in its correct position
            if (vis[i] || pos.get(arr[i]) == i)
                continue;

            int j = i, cycleSize = 0;

            // We make a cycle until it comes
            // back to first element again.
            while (!vis[j]) {
                vis[j] = true;

                // move to next element of the cycle
                j = pos.get(arr[j]);
                cycleSize++;
            }

            // Update answer by adding current cycle.
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
}

