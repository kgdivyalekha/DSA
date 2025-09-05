package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int count=lengthOfLongestSubstring("qrsvbspk");
        System.out.println(count);
    }
    public static int lengthOfLongestSubstring(String s) {
        int count=0;
        Set<Character> set=new HashSet<>();
        //add first element in array to set
        //start left tracker at 0 and right at 1
        //if right element not in set, add to set and update count & increment right
        //if it exists, remove left element and add right to set and increment left and right.
        if(s.length()==0)
            return 0;
        else if(s.length()==1)
            return 1;
        else
        {

            int left=0;int right=0;
            int n=s.length();
            while(right<n)
            {
                if(!set.contains(s.charAt(right)))
                {
                    set.add(s.charAt(right));
                    count=Math.max(count,right-left+1);
                    right++;
                }
                else
                {
                 set.remove(s.charAt(left));
                    left++;
                }
            }
            return count;
        }
    }
}
