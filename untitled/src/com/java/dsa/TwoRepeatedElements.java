package com.java.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int[] arr={1, 2, 2,1};
        int[] res=twoRepeatedElements(arr);
        System.out.println(Arrays.toString(res));
    }

   /* private static int[] twoRepeatedElements(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        List<Integer> res=new ArrayList<>() ;
        int j=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
             if(entry.getValue()==2) {
                 res.add(entry.getKey());
             }
        }
        return res.stream().mapToInt(i->i).toArray();
    }*/
    private static int[] twoRepeatedElements(int[] arr) {
    //     int[] arr={1, 2, 1, 3, 4, 3};
       int n= arr.length;
       boolean[] seen = new boolean[n-1];
       int i=0;
       int[] ans=new int[2];
       for(int num:arr)
       {
           if(seen[num]) ans[i++]=num;
           else if(i==2) break;
           else seen[num]=true;
       }

       return ans;
    }
}
