package com.java.hackerrank.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(1,2,3,4,5,6,7);
        int rotation =3;
        List<Integer> rotated=rotateLeft(arrList,rotation);
        System.out.println(rotated);
    }

    private static List<Integer> rotateLeft(List<Integer> a, int d) {
    int[] arr=a.stream().mapToInt(Integer::intValue).toArray();
    int n=arr.length;
    int[] rotatedArr=new int[n];
    if(d>n)
        d=d%n;
    for(int i=0;i<n;i++)
    {
        int index=(i+n-d)%n;
        //rotatedArr[index]=arr[i];
        rotatedArr[i]=arr[index]; //--> for right rotation
    }
    arr=Arrays.copyOf(rotatedArr,rotatedArr.length);
    return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
