package com.java.dsa;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        Map<Character,Integer> map= countCharacters("Yuvan Neeban Sathish");
        for (Map.Entry<Character,Integer> m:map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }

    private static Map<Character, Integer> countCharacters(String str) {
        Map<Character,Integer> result=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                result.put(str.charAt(i), result.getOrDefault(str.charAt(i),0)+1);
        }
        return result;
    }
}
