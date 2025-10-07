package com.java.dsa;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbingStairs(2));
    }

    private static int climbingStairs(int stairs) {
        if(stairs==0||stairs==1)
            return stairs;
        int[] dp=new int[stairs+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=stairs;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[stairs];
    }
}
