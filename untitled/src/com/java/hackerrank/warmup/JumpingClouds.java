package com.java.hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class JumpingClouds {
    public static void main(String[] args) {
        int ways = jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0));
        System.out.println(ways);
    }

    private static int jumpingOnClouds(List<Integer> clouds) {
        int left = 0;
        int waysMin = 0;
        while(left<clouds.size()-1)
        {
            if(left+2<clouds.size() && clouds.get(left)==0 && clouds.get(left+2)==0) {
                waysMin++;
                left+=2;
            }
            else if(left+1<clouds.size() && clouds.get(left)==0 && clouds.get(left+1)==0)
            {
                waysMin++;
                left++;
            }
        }
        return waysMin;
    }
}