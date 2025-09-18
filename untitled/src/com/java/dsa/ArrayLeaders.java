package com.java.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
       // int[] arr={16, 17, 4, 3, 5, 2};
        int[] arr={61,61,17};
        ArrayList<Integer> list= arrayLeaders(arr);
        System.out.println(list);
    }

    private static ArrayList<Integer> arrayLeaders(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        // key is to traverse from the end since the object is to find elements greater
        //than the elements to its right
        int temp=arr[arr.length-1];
        list.add(temp);// adding the last element since there is no greater element in the right
        for(int i=arr.length-2;i>=0;i--)//looping from second last element as last is already dealt with
        {
            if(arr[i]>=temp){
                temp=arr[i];//finding the greatest element
                list.add(temp);
            }
        }
        Collections.reverse(list);//reversing as we added from last
        return list;
    }
}
