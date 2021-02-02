package com.wencongxiao.leetcode;

import java.util.Arrays;

public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[]res=new int[k];
        Arrays.sort(arr);
        for(int i=0;i<k;i++)
            res[i]=arr[i];
        return res;
    }

    public static void main(String args[]) {


    }
}
