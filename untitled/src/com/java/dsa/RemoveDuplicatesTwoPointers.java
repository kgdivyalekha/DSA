package com.java.dsa;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTwoPointers {
    public static void main(String[] args) {
        int res=removeDuplicate(Arrays.asList(0,0,1,1,1,2,2,200,200,300,3000));
        System.out.println(res);
    }
    public static int removeDuplicate(List<Integer> arr)
    {
        int count=0;
        int left=0;
        int right=1;
        if(arr.size()==0||arr==null)
            return count;
        else if(arr.size()==1)
            return count+1;
        while(right<arr.size() && left<=right)////0 0 1 1 1 2 2 200 200 300 3000
        {
            int i=arr.get(left);
            int j=arr.get(right);

            if(i!=j)
            {
                System.out.println(i+","+j);
                left++;

                arr.set(left,arr.get(right));

            }

            right++;

        }
        count=left+1;
        return count;
    }
}
