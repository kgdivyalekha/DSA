package com.java.hackerrank.warmup;

import java.util.*;

public class SockMerchant {
    public static void main(String[] args) {

   //     int array[] = new int[]{1,2,1,2,1,3,2};
        List<Integer> array = new ArrayList<>(Arrays.asList(10,20,20,10,10,30,50,10,20));
        int count = sockMerchant(array,array.size());
        System.out.println(count);
    }

    private static int sockMerchant(List<Integer> ar, int n) {
        if(n==0||ar.isEmpty())
            return 0;
        else
        {
            Map<Integer,Integer> sockMap = new HashMap<>();
            if(sockMap.isEmpty()) {
                sockMap.put(ar.get(0), 1);

            }
            for(int i=1;i<n;i++)
            {
                if(sockMap.containsKey(ar.get(i)))
                    sockMap.put(ar.get(i),sockMap.get(ar.get(i))+1);
                else
                    sockMap.put(ar.get(i), 1);
            }
            int count=0;
            for(Integer val:sockMap.values())
            {
                int j=val/2;
                count+=j;
            }
            return count;
        }
    }

}

