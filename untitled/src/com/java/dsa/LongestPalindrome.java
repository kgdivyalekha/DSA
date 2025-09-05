package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str="babad";
        String s = longestPalindrome(str);
        System.out.println(s);
    }

    private static String longestPalindrome(String str) {
        String subStr="";
        char[] cArr=str.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char c:cArr)
            set.add(c);
        return subStr;
    }
}
