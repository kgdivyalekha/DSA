package com.java.hackerrank.warmup;

public class CountingValleys {
    public static void main(String[] args) {
        int count=countingValleys(12,"DDUUDDUDUUUD");
        System.out.println(count);
    }

    private static int countingValleys(int steps, String path) {
        if (steps==0||path.isEmpty())
            return 0;
        char[] arr=path.toCharArray();
        int counter=0,paths=0;
        for(int i=0;i<steps;i++)
        {
           if(arr[i]=='U') {
               counter++;
               if(counter==0)
                   paths++;
           }
           else counter--;
        }
       return paths;
    }
}
