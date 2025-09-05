package com.java.dsa;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={805306368,805306368,805306368};
        int h=1000000000;
      /*  int[] piles={3,6,7,11};
        int h=8;*/
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        //start can be minimum in the array and end can be the sum of all elements. start=3;end=27 ans must be between this
        // mid value is 12. 1,1,1,1=4 but h=8
        //now the speed can be less than 12, so start will not change but end can be reduced to 11.mid val=7 1,1,1,2 but h=5
        //reduce the speed to 3to6, which is 4 now, h=1,2,2,3=8
        //if the pile is just one, if it can be divided equally by the hours, return the divisor else if it has a reminder, then add one more since it exceeds by one more hour
        if(piles.length==1)
            return (piles[0]%h==0?piles[0]/h:piles[0]/h+1);
        //assuming minimum speed is one banana per hour as a lower bound
        int start=1;
        //finding the maximum number of pile in piles array for an upper bound
        int end=Integer.MIN_VALUE;
        int ans=0;
        for(int pile:piles)
        {
            end=Math.max(end,pile);
        }
        while(start<=end)
        {
            int speed=0;
            int mid=start+(end-start)/2;
            for(int pile:piles)
            {
                speed+=pile/mid+1;//speed will be calculated as total speed for that mid value per hour
            }

            if(speed<=h && speed>0) {//speed if less than or equal to h, it means koko can eat more slowly, but it could also be the final answer. so storing in ans variable and getting the lower bound less than mid
                ans=mid;
                end = mid - 1;
            }
            else
                start=mid+1;//koko has to eat faster.
        }
        return ans;
    }
}
