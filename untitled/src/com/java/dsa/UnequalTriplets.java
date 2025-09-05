package com.java.dsa;

import java.util.*;

public class UnequalTriplets {
    public static void main(String[] args) {
        int[] nums={1,3,1,2,4};
        int count = unequalTriplets(nums);
        System.out.println(count);
    }

    private static int unequalTriplets(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(countMap);
        int result = 0;
        int prevCount = 0;
        int totalLength = nums.length;

        for (int currentFreq : countMap.values()) {
            int remainingCount = totalLength - prevCount - currentFreq;
            result += prevCount * currentFreq * remainingCount;
            prevCount += currentFreq;
        }
        return result;
    }
}
