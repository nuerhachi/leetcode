package com.wencongxiao.leetcode;

public class 旋转矩阵 {
    static public void rotate(int[][] matrix) {
        int middle=0,size=matrix.length-1;
        for (int i=0;i<size;i++)
            for (int j=i;j<size-i;j++)
            {
                middle= matrix[i][j];
                matrix[i][j]=matrix[size-j][i];
                matrix[size-j][i]=matrix[size-i][size-j];
                matrix[size-i][size-j]=matrix[j][size-i];
                matrix[j][size-i]=middle;
            }



    }


    public static void main(String args[]) {


    }
}
