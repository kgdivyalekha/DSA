package com.java.dsa;

import java.util.Arrays;

public class CompressString {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
    StringBuilder sb= new StringBuilder();
    int left=0;int count=0;
    int right=0;
    //run the loop from 0 as left to arr length
        while(right<chars.length) {
            //if left and right are equal, increment the count
            if(chars[left]==chars[right])
            {
                count++;
                if(sb.indexOf(String.valueOf(chars[left]))==-1)
                    sb.append(chars[left]);
                if(count>1 && !Character.isDigit(sb.charAt(sb.length()-1)))
                    sb.append(count);
                else if(count>1 && Character.isDigit(sb.charAt(sb.length()-1)))
                {
                    for(int j=sb.length()-1;j>0;j--)
                    {
                        if(Character.isDigit(sb.charAt(sb.length()-1)))
                        {
                            sb.deleteCharAt(j);
                        }
                    }

                    sb.append(count);
                }

                right++;
            }
            else {

                count=0;
                left=right;
            }

            // move the right pointer keeping left the same until the letter doesn't match
            //now add the char and count to sb and move left to right and right to right+1

        }
        String s=sb.toString();
        System.out.println(Arrays.toString(s.toCharArray()));
    return s.toCharArray().length;
    }
}
