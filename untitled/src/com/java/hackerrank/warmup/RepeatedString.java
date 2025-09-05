package com.java.hackerrank.warmup;

public class RepeatedString {
    public static void main(String[] args) {
        String str="a";
        long n=1000000000000L;
        long count =repeatedString(str,n);
        System.out.println(count);
    }

    private static long repeatedString(String s, long n) {
        long count=0;
        long noOfTimes=n/s.length();
        long rem=n%s.length();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                count++;
        }
        count*=noOfTimes;
        for(int i=0;i<rem;i++)
        {
            if(s.charAt(i)=='a')
                count++;
        }
        return count;
    }
}
