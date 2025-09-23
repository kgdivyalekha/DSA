package com.java.dsa;
//NOT FINISHED YET
public class FindEquilibrium {
    public static void main(String[] args) {
        int[] arr={1,2,0,3};
        System.out.println(findEquilibrium(arr));
    }

    private static int findEquilibrium(int[] arr) {
        int total=0;
        for(int num:arr)
            total+=num;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(total-sum==sum)
                return i+1;
        }
        return -1;
    }
}
