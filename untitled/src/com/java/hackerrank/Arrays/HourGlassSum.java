package com.java.hackerrank.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlassSum {
    public static void main(String[] args) {
        List<List<Integer>> matrix=new ArrayList<>();
        matrix.add(Arrays.asList(-9,-9,-9,1,1,1));
        matrix.add(Arrays.asList(0,-9,0,4,3,2));
        matrix.add(Arrays.asList(-9,-9,-9,1,2,3));
        matrix.add(Arrays.asList(0,0,8,6,6,0));
        matrix.add(Arrays.asList(0,0,0,-2,0,0));
        matrix.add(Arrays.asList(0,0,1,2,4,0));
        int sum=hourGlassSum(matrix);
        System.out.println(sum);
    }

    private static int hourGlassSum(List<List<Integer>> matrix) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int twoDArray[][]=new int[matrix.size()][matrix.size()];
        for(int i=0;i<matrix.size();i++)
        {
            List<Integer> inner = matrix.get(i);
            for(int j=0;j<inner.size();j++)
            {
                twoDArray[i][j]=inner.get(j);
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=twoDArray[i][j]+twoDArray[i][j+1]+twoDArray[i][j+2]+twoDArray[i+1][j+1]+twoDArray[i+2][j]+twoDArray[i+2][j+1]+twoDArray[i+2][j+2];
                max=Integer.max(max,sum);
            }

        }
        return max;
    }
}
