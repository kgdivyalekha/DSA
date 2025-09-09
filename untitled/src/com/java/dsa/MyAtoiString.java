package com.java.dsa;

public class MyAtoiString {
    public static void main(String[] args) {
        //String s="1337c0d3";
        String s="-+12";
        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        int i=0;
        long res=0;//declaring it as long to avoid overflows-edge cases
        int sign=1;
        //check the nature of sign at position 0
        if(s.charAt(0)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+') {
            i++;
        }
        while(i<s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;//this is to check alphanumerics
            //if it's a number, calculate the value of it (if ch='5', ch-0 gives integer value of 5)
            res = res * 10 + (ch - '0');
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)res;
    }
}
