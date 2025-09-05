package com.java.leetcode.interview;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }

    private static int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int buy=prices[0]; int j=1;int sum=0;
        for(int i=0;i<prices.length;i++)
        {
            if(j<prices.length&&prices[j]-buy>0)
            {
                sum=prices[j]-buy;
                profit=Integer.max(profit,sum);
                j++;
            }
            else if(j<prices.length) {
                buy=Integer.min(buy,prices[j]);
                j++;
            }
        }
        return profit;
    }
}
