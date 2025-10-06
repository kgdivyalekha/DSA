package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofStrings {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sathish", "Kumar", "Yadav","Yuvan","Neeban","Lekha","Gunasekaran","Dinesh","Kiruthik","Max");
        System.out.println("Sorted List:\n"+sortListOfStrings(list));
    }

    private static ArrayList<String> sortListOfStrings(List<String> list) {
        List<String> result=list.stream().sorted().collect(Collectors.toList());
        return (ArrayList<String>) result;
    }
}
