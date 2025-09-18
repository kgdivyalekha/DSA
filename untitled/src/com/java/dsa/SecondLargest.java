package com.java.dsa;
//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int last=-1;
        int secondLast=-1;
        for(int num:arr)
        {
            last=Math.max(last,num);
        }
        for(int num:arr)
        {
            if(num>secondLast && num!=last)
                secondLast=num;
        }
        return secondLast;
    }
}
