package com.java.dsa;

import java.util.*;

public class ThreeSumToZero {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        List<List<Integer>> result = threeSumToZero(arr);
        for(List list: result)
            System.out.println(list);
    }

    private static List<List<Integer>> threeSumToZero(int[] arr) {
        Set<List<Integer>> set= new HashSet<>();
        Arrays.sort(arr);
        int target=0; int right=0; int left=0;
        for(int i=0;i<arr.length-2;i++)
        {
           left=i+1;
           right=arr.length-1;
           while(left<right)
           {
               int sum=arr[i]+arr[left]+arr[right];
               if(sum==target) {
                   set.add(Arrays.asList(arr[i], arr[left], arr[right]));
                   while (i > 0 && left<arr.length-1 && arr[left] == arr[left - 1])
                       left++;
                   while (i > 0 && right>0 && arr[right] == arr[right - 1])
                       right--;
                   left++;
                   right--;
               }
               else if(sum>target)
                   right--;
               else left++;
           }
       }
       List<List<Integer>> result=new ArrayList<>(set);
        return result;
    }
}
