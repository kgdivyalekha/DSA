package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff=3;
        int count=arithmeticTriplets(nums,diff);
        System.out.println(count);
    }

    private static int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums)
            set.add(num);
        for (int num:nums)
        {
            if(set.contains(num+diff)&& set.contains(num+diff*2))
                count++;
        }
        return count;
    }
}
