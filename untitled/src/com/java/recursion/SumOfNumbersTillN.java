package com.java.recursion;

import java.util.HashMap;

public class SumOfNumbersTillN {
    public static void main(String[] args) {
        //simple recursion
        System.out.println(sumOfNumbers(10));
        //recursion with memoization
        System.out.println(sumOfNumbersWithMemo(11, new HashMap<Integer,Integer>()));
        //recursion with tabulation
        System.out.println(sumOfNumbersWithTab(12));
    }

    private static int sumOfNumbersWithTab(int n) {
        //constructing a DP array and since the base case is dp[0]=0, leaving it as such because arrays are initialized to zero by default
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++)
            dp[i]=dp[i-1]+i;
        return dp[n];
    }

    private static int sumOfNumbersWithMemo(int n, HashMap<Integer, Integer> memo) {
        if(n<=1)
            return n;
        if(memo.containsKey(n))
            return memo.get(n);
        int result=n+sumOfNumbersWithMemo(n-1,memo);
        memo.put(n,result);
        return result;
    }

    private static int sumOfNumbers(int n) {
        if(n<=1)
            return n;
        return n+sumOfNumbers(n-1);
    }
}
