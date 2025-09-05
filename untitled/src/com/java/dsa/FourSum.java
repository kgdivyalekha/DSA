package com.java.dsa;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int arr[]={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        List<List<Integer>> result=fourSum(arr,target);
        for(List<Integer> list:result)
            System.out.println(list);
    }

    private static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result=new ArrayList<>();
       if(target<Integer.MAX_VALUE && target>Integer.MIN_VALUE)
        {

            Arrays.sort(arr);
            Set<List<Integer>> set = new HashSet<>();
            int left = 0;
            int right = 0;
            int j = 0;
            for (int i = 0; i < arr.length - 2; i++) {
                for (j = i + 1; j < arr.length - 1; j++) {
                    left = j + 1;
                    right = arr.length - 1;
                    while (left < right) {
                        long sum = (long)arr[i] + (long)arr[j] + (long)arr[left] + (long) arr[right];
                        if (sum == target) {
                            set.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                            right--;
                        } else if (sum > target)
                            right--;
                        else left++;
                    }
                }

            }
            result = new ArrayList<>(set);

        }
        return result;
    }
}
