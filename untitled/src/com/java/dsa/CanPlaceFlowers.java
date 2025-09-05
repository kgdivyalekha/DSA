package com.java.dsa;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,1,0,0};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean prev=false;
        int nos=n;
        int l=flowerbed.length;
        if(n==0)
            return true;
        for(int i=0;i<l;i++)
        {
            if(flowerbed[i]==0 && (i == 0 || flowerbed[i - 1] == 0) && (i == l - 1 || flowerbed[i + 1] == 0))
            {
                flowerbed[i]=1;
                nos--;
            }

            if(nos==0)
                return true;
        }

        return false;
    }
}
