package com.java.dsa;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

        public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<List<String>>();
        //create a map of key with sorted strings
            Map<String,List<String>> map= new HashMap<>();
            for(String str:strs)
            {
                char[] arr=str.toCharArray();
                Arrays.sort(arr);
                String key=new String(arr);
                //if the key is to be added new, add a new entry with empty list
                if(!map.containsKey(key))
                    map.put(key,new ArrayList<>());
                //add the key with its original string as value
                map.get(key).add(str);
            }
            //return the values of the map
            List<List<String>> result=new ArrayList<>(map.values());
            return result;
        }

}
