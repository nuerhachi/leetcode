package com.wencongxiao.leetcode;

public class 顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        int[] res;
        int bottom=matrix.length-1;
        if(bottom<0)
            res=new int[0];
        else{
            int right=matrix[0].length-1,left=0,top=0,x=0;
            res=new int[(right+1)*(bottom+1)];
            while (true) {
                for (int i = left; i <= right; i++) res[x++] = matrix[top][i];
                if (++top > bottom) break;
                for (int i = top; i <= bottom; i++) res[x++] = matrix[i][right];
                if (--right < left) break;
                for (int i = right; i >= left; i--) res[x++] = matrix[bottom][i];
                if (--bottom < top) break;
                for (int i = bottom; i >= top; i--) res[x++] = matrix[i][left];
                if (++left > right) break;
            }
        }
        return res;

    }

    public static void main(String args[]) {


    }
}
