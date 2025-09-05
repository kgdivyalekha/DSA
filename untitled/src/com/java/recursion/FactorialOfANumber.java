package com.java.recursion;

import java.util.HashMap;
import java.util.Scanner;

public class FactorialOfANumber {
    private static HashMap<Integer,Integer> memoMap=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(factorialWithTabulation(n));
    }

    private static int factorialWithMemoization(int n) {

        if(n<=1)
            return 1;
        if(memoMap.containsKey(n))
            return memoMap.get(n);
        int memo= n* factorialWithMemoization(n-1);
        memoMap.put(n,memo);
        return memo;
    }

    private static int factorialWithTabulation(int n) {

        if(n<=1)
            return 1;
        int[] dp= new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            dp[i]=dp[i-1]*i;
        }
        return dp[n];
    }

}
