package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,10,9,6};
        int target=15;
        List<List<Integer>> result= threeSum(arr,target);
        for(List list:result)
            System.out.println(list);
    }

    private static List<List<Integer>> threeSum(int[] arr, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int l=i+1;
            int r=arr.length-1;

            while(l<r)
            {
                int sum=arr[i]+arr[l]+arr[r];
                if(target==sum)
                {

                    result.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    while(l<r && arr[l]==arr[l-1])
                        l++;
                    while(l<r && arr[r]==arr[r-1])
                        r--;
                    l++;
                    r--;
                }
                else if(target< sum)
                    r--;
                else l++;
            }


        }
        return result;
    }
}
